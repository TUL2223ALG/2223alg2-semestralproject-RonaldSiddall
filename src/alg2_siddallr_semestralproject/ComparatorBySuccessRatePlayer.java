package alg2_siddallr_semestralproject;

import java.util.Comparator;

/**
 * this class implements the comparator that sorts the players by their success
 * rate
 *
 * @author Ronald Ch. Siddall
 */
public class ComparatorBySuccessRatePlayer implements Comparator<Player> {

    /**
     *
     * @param p1 - first player
     * @param p2 - second player
     * @return a negative integer if player p1 has a lower success rate, a
     * positive integer if player p1 has a higher success rate, or 0 if both
     * players have the same success rate.
     */
    @Override
    public int compare(Player p1, Player p2) {
        return Double.compare(p2.getPlayerSuccessRateInPercentage(), p1.getPlayerSuccessRateInPercentage());
    }
}
