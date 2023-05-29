package alg2_siddallr_semestralproject;

import java.util.Comparator;

/**
 * this class implements the comparator that sorts the team based on the amount
 * of points the teams have
 *
 * @author Ronald Ch. Siddall
 * @author Ronald Ch. Siddall
 */
public class ComparatorByPointsTeam implements Comparator<Team> {

    /**
     *
     * @param t1 - first team
     * @param t2 - second team
     * @return -1, or a 1 if team t1 has less, equal or more points than team t2
     */
    @Override
    public int compare(Team t1, Team t2) {
        return Double.compare(t2.getPointsOfTeam(), t1.getPointsOfTeam());
    }
}
