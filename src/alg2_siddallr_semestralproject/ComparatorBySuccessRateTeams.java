package alg2_siddallr_semestralproject;

import java.util.Comparator;

/**
 * this class implements the comparator that sorts the teams by their success
 * rate
 *
 * @author Ronald Ch. Siddall
 */
public class ComparatorBySuccessRateTeams implements Comparator<Team> {

    /**
     *
     * @param t1 - first team
     * @param t2 - second team
     * @return a negative integer if team t1 has a lower success rate, a
     * positive integer if team t1 has a higher success rate, or 0 if both team
     * have the same success rate
     */
    @Override
    public int compare(Team t1, Team t2) {
        return Double.compare(t2.getTeamSuccessRateInPercentage(), t1.getTeamSuccessRateInPercentage());
    }
}
