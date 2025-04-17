public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEqualScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getAdvancedOrWinScore(player1Score, player2Score);
        } else {
            return getNormalScore(player1Score, player2Score);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All";
            default: return "Deuce";
        }
    }

    private static String getAdvancedOrWinScore(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;

        if (scoreDifference == 1) return "Advantage player1";
        else if (scoreDifference == -1) return "Advantage player2";
        else if (scoreDifference >= 2) return "Win for player1";
        else return "Win for player2";
    }

    private static String getNormalScore(int player1Score, int player2Score) {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private static String getScoreName(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "Unknown";
        }
    }
}
