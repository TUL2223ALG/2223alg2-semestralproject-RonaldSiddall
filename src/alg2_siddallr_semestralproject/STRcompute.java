package alg2_siddallr_semestralproject;

/**
 * this class is used to compute how the STR and STRstabil of both players
 * change after the match, the change of STR and STRstab is dependent on many
 * factors such as the longterm performance (STRstabil) and shortterm
 * performance (STR) of each player
 *
 * @author Ronald Ch. Siddall
 */
public class STRcompute {

    /**
     * K is the growth coeficient that indicates the "importance" of the result
     * of each match for low level play and competitions the value of K lies
     * between 10 and 20. C is the deviation coeficient that smoothens the
     * sudden change of STR gain/loss. it acts as a "protection" from sudden
     * unreasonable drops/increases in the value of STR
     */
    private static final int K = 17;
    private static final double C = 0.002;

    /**
     *
     * Computes the probability of the winner of a match given their skill
     * rating and the skill rating of the looser based on the Elo rating system.
     *
     * @param winnerSTR = the skill rating of the winner
     * @param looserSTR = the skill rating of the loser
     * @return the probability of the winner winning the match
     */
    public static double getProbabilityWinner(int winnerSTR, int looserSTR) {
        return (1 / (1 + Math.pow(10, (looserSTR - winnerSTR) / 400.0)));
    }

    /**
     *
     * @param winnerSTR = the current skill rating of the winner
     * @param looserSTR = the current skill rating of the looser
     * @return the probability of the looser winning the match
     */
    public static double getProbabilityLooser(int winnerSTR, int looserSTR) {
        return (1 - getProbabilityWinner(winnerSTR, looserSTR));
    }

    /**
     *
     * Computes the new value of STR of the winner after winning the match given
     * their current skill rating and the skill rating of the looser, based on
     * the Elo rating system.
     *
     * @param winnerSTR = the current skill rating of the winner
     * @param looserSTR = the current skill rating of the looser
     * @return the new int value of STR of the winning player
     */
    public static int getWinnerSTR(int winnerSTR, int looserSTR) {
        double probabilityOfWinner = getProbabilityWinner(winnerSTR, looserSTR);
        double newWinnerSTR = winnerSTR + K * (1 - probabilityOfWinner);
        int roundedNewWinnerSTR = (int) Math.round(newWinnerSTR);
        return roundedNewWinnerSTR;
    }

    /**
     * Computes the new value of STR of the looser after winning the match given
     * their current skill rating and the skill rating of the looser, based on
     * the Elo rating system.
     *
     * @param winnerSTR = the current skill rating of the winner
     * @param looserSTR = the current skill rating of the looser
     * @return the new int value of STR of the loosing player
     */
    public static int getLooserSTR(int winnerSTR, int looserSTR) {
        double probabilityOfLooser = getProbabilityLooser(winnerSTR, looserSTR);
        double newLooserSTR = looserSTR + K * (0 - probabilityOfLooser);
        int roundedNewLooserSTR = (int) Math.round(newLooserSTR);
        return roundedNewLooserSTR;
    }

    /**
     *
     * Computes the new value of STRstabil of the winner after winning the match
     * given their and the opponents current skill rating STR and longterm
     * rating STRstabil, based on the GLICKO2 rating system
     *
     * @param winnerSTR = the current skill rating of the winner
     * @param winnerSTRstabil = the longterm skill rating of the looser
     * @param looserSTR = the current skill rating of the loser
     * @param looserSTRstabil = the longterm skill rating of the looser
     * @return the new int value of STRstab of the winning player
     */
    public static double getWinnerSTRstab(int winnerSTR, double winnerSTRstabil, int looserSTR, double looserSTRstabil) {
        double delta = looserSTR - winnerSTR;
        double newWinnerSTRstabil = Math.sqrt((1 + C) * Math.pow(winnerSTRstabil, 2) + C * Math.pow(delta, 2));
        double roundedNewWinnerSTRstabil = Math.round(newWinnerSTRstabil * 10) / 10.0;
        return roundedNewWinnerSTRstabil;
    }

    /**
     *
     * Computes the new value of STRstabil of the looser after winning the match
     * given their and the opponents current skill rating STR and longterm
     * rating STRstabil, based on the GLICKO2 rating system
     *
     * @param winnerSTR = the current skill rating of the winner
     * @param winnerSTRstabil = the longterm skill rating of the looser
     * @param looserSTR = the current skill rating of the loser
     * @param looserSTRstabil = the longterm skill rating of the looser
     * @return the new int value of STRstab of the loosing player
     */
    public static double getLooserSTRstab(int winnerSTR, double winnerSTRstabil, int looserSTR, double looserSTRstabil) {
        double delta = looserSTR - winnerSTR;
        double newLooserSTRstabil = Math.sqrt((1 - C) * Math.pow(looserSTRstabil, 2) + C * Math.pow(delta, 2));
        double roundedNewLooserSTRstabil = Math.round(newLooserSTRstabil * 10) / 10.0;
        return roundedNewLooserSTRstabil;
    }
}
