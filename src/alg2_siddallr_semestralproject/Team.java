package alg2_siddallr_semestralproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this class represents a object team and provides various methods to work with
 * team data
 *
 * @author Ronald Ch. Siddall
 */
public class Team {

    private String nameOfTeam;
    private int totalMatches;
    private int wonMatches;
    private int drawnMatches;
    private int lostMatches;
    private int forfeitedMatches;
    private int positiveScore;
    private int negativeScore;
    private int pointsOfTeam;
    private double teamSuccessRate;

    /**
     * constructor that constructs a new Team object with the given parameters.
     *
     * @param nameOfTeam - the name of the team
     * @param totalMatchesTeam - the total number of matches played by the team
     * @param wonMatchesTeam - the number of matches won by the team
     * @param drawnMatchesTeam - the number of matches drawn by the team
     * @param lostMatchesTeam - the number of matches lost by the team
     * @param forfeitedMatchesTeam - the number of matches forfeited by the team
     * @param positiveScoreTeam - the positive score of the team
     * @param negativeScoreTeam - the negative score of the team
     * @param pointsTeam - the points of the team
     */
    public Team(String nameOfTeam, int totalMatchesTeam, int wonMatchesTeam, int drawnMatchesTeam,
            int lostMatchesTeam, int forfeitedMatchesTeam, int positiveScoreTeam, int negativeScoreTeam, int pointsTeam) {
        this.nameOfTeam = nameOfTeam;
        this.totalMatches = totalMatchesTeam;
        this.wonMatches = wonMatchesTeam;
        this.drawnMatches = drawnMatchesTeam;
        this.lostMatches = lostMatchesTeam;
        this.forfeitedMatches = forfeitedMatchesTeam;
        this.positiveScore = positiveScoreTeam;
        this.negativeScore = negativeScoreTeam;
        this.pointsOfTeam = pointsTeam;
    }

    /**
     * returns the name of the team
     *
     * @return the name of the team
     */
    public String getNameOfTeam() {
        return nameOfTeam;
    }

    /**
     * returns the total number of matches played by the team.
     *
     * @return the total number of matches played
     */
    public int getTotalMatches() {
        return totalMatches;
    }

    /**
     * returns the number of matches won by the team.
     *
     * @return the number of matches won
     */
    public int getWonMatches() {
        return wonMatches;
    }

    /**
     * returns the number of matches drawn by the team.
     *
     * @return the number of matches drawn
     */
    public int getDrawnMatches() {
        return drawnMatches;
    }

    /**
     * returns the number of matches lost by the team.
     *
     * @return the number of matches lost
     */
    public int getLostMatches() {
        return lostMatches;
    }

    /**
     * returns the number of matches forfeited by the team.
     *
     * @return the number of matches forfeited
     */
    public int getForfeitedMatches() {
        return forfeitedMatches;
    }

    /**
     * returns the positive score of the team.
     *
     * @return the positive score
     */
    public int getPositiveScore() {
        return positiveScore;
    }

    /**
     * returns the negative score of the team.
     *
     * @return the negative score
     */
    public int getNegativeScore() {
        return negativeScore;
    }

    /**
     * returns the points earned by the team.
     *
     * @return the points earned
     */
    public int getPointsOfTeam() {
        return pointsOfTeam;
    }

    /**
     * calculates and returns the team's success rate in percentage and if the
     * team played 0 matches their success rate is 0%
     *
     * @return the team´s success rate in percentage rounded to 2 decimals
     */
    public double getTeamSuccessRateInPercentage() {
        if (totalMatches == 0) {
            return 0;
        }
        teamSuccessRate = (double) wonMatches * 100 / (double) totalMatches;
        String formattedSuccessRate = String.format("%.2f", teamSuccessRate).replace(",", ".");
        teamSuccessRate = Double.parseDouble(formattedSuccessRate);
        return teamSuccessRate;
    }

    /**
     * @return a string representation of the Team object
     */
    @Override
    public String toString() {
        return "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"
                + "\n" + "                         Název družstva: " + nameOfTeam + "\n"
                + "                         Celkem odehraných utkání: " + totalMatches + "\n"
                + "                         Výhry: " + wonMatches + "\n"
                + "                         Remízy: " + drawnMatches + "\n"
                + "                         Prohry: " + lostMatches + "\n"
                + "                         Kontumovaná utkání: " + forfeitedMatches + "\n"
                + "                         Skóre: " + positiveScore + ":" + negativeScore + "\n"
                + "                         Body: " + pointsOfTeam + "\n"
                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
    }

    /**
     * if the team is found within the source data the method returns the string
     * representation of the team, otherwise it returns a message that the team
     * wasnt found
     *
     * @param nameOfTeam - the name of the team that is supposed to be searched
     * @param pathToFile - the path to the source file with the data of the
     * teams
     * @return the team´s string representation if its found within the source
     * data, or an error message if not found
     * @throws IOException
     */
    public static String getTeamInfoByName(String nameOfTeam, String pathToFile) throws IOException {
        ArrayList<Team> teams = FileUtility.loadTeamsFromLeaderBoardTeams(pathToFile);
        for (Team team : teams) {
            if (team.getNameOfTeam().equalsIgnoreCase(nameOfTeam)) {
                return team.toString();
            }
        }
        return "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"
                + "\n" + "Družstvo s názvem '" + nameOfTeam + "' nebylo nalezeno v soutěži "
                + FileUtility.getNameOfLeagueLeaderBoardTeams(pathToFile) + "." + "\n"
                + "Zkontrolujte si název družstva a zkuste to znovu." + "\n"
                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
    }

    /**
     * returns a string representation of teams before they are sorted by
     * success rate in descending order
     *
     * @param teams - the list of teams
     * @return - a string representation of teams sorted by success rate
     */
    public static String sortedStringForSuccessRateSort(List<Team> teams) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Team team : teams) {
            builder.append(i).append(". ").append(team.getNameOfTeam());
            builder.append(" - ").append(team.getTeamSuccessRateInPercentage()).append("%").append("\n");
            i++;
        }
        return builder.toString();
    }

    /**
     * sorts the teams in the given list by their success rate in descending
     * order
     *
     * @param teams - the list of teams to be sorted
     * @return - a string representation of teams sorted by success rate in
     * descending order
     */
    public static String sortTeamsBySuccessRate(List<Team> teams) {
        Collections.sort(teams, new ComparatorBySuccessRateTeams());
        return sortedStringForSuccessRateSort(teams);
    }

    /**
     * returns a string representation of teams before they are sorted by points
     *
     * @param teams - the list of teams to be sorted
     * @return - a string representation of teams
     */
    public static String sortedStringForPointsSort(List<Team> teams) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Team team : teams) {
            builder.append(i).append(". ").append(team.getNameOfTeam());
            builder.append(" - ").append(team.getPointsOfTeam()).append(" bodů").append("\n");
            i++;
        }
        return builder.toString();
    }

    /**
     * sorts the teams in the given list by points in descending order
     *
     * @param teams - the list of teams to be sorted
     * @return - a string representation of teams sorted by points
     */
    public static String sortTeamsByPoints(List<Team> teams) {
        Collections.sort(teams, new ComparatorByPointsTeam());
        return sortedStringForPointsSort(teams);
    }
}
