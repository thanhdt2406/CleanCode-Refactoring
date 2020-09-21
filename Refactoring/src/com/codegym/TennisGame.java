package com.codegym;

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(int player1Score, int player2Score) {

        boolean isDeuce = player1Score == player2Score;
        if (isDeuce) {
            switch (player1Score) {
                case LOVE:
                    return "Love-All";
                case FIFTEEN:
                    return "Fifteen-All";
                case THIRTY:
                    return "Thirty-All";
                case FORTY:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }

        boolean isAdvantage1 = player1Score >= 4;
        boolean isAdvantage2 = player2Score >= 4;
        if (isAdvantage1 || isAdvantage2) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                return "Advantage player1";
            } else if (minusResult == -1) {
                return "Advantage player2";
            } else if (minusResult >= 2) {
                return "Win for player1";
            } else return "Win for player2";
        }

        String scoreStr = "";
        int tempScore;
        for (int score = FIFTEEN; score < FORTY; score++) {
            if (score == FIFTEEN) {
                tempScore = player1Score;
            } else {
                scoreStr += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case LOVE:
                    scoreStr += "Love";
                    break;
                case FIFTEEN:
                    scoreStr += "Fifteen";
                    break;
                case THIRTY:
                    scoreStr += "Thirty";
                    break;
                case FORTY:
                    scoreStr += "Forty";
                    break;
            }
        }
        return scoreStr;
    }
}
