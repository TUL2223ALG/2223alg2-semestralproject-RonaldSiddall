package alg2_siddallr_semestralproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * this class represents a object player and provides various methods to work
 * with player data
 *
 * @author Ronald Ch. Siddall
 */
public class Player implements Comparable<Player> {

    private String nameOfLeague;
    private String nameOfPlayer;
    private long IDofPlayer;
    private int yearOfBirth;
    private Gender genderOfPlayer;
    private String categoryOfPlay;
    private String clubOfPlayer;
    private int totalMatches;
    private int wonMatches;
    private int lostMatches;
    private int playerSTR;
    private double playerSTRstabil;
    private double playerSuccessRate;
    private int playerAge;

    /**
     *
     * @param nameOfPlayer - name of the player
     * @param IDofPlayer - ID of the player
     * @param yearOfBirth - year of birth of the player
     * @param genderOfPlayer - gender of the player
     * @param categoryOfPlay - category where the player plays
     * @param clubOfPlayer - club of the player
     * @param totalMatches - total played matches of the player
     * @param wonMatches - how many matches he won
     * @param lostMatches - how many matches he lost
     * @param playerSTR - the current skill rating of the player
     * @param playerSTRstabil - the longterm skill rating of the player
     */
    public Player(String nameOfPlayer, long IDofPlayer, int yearOfBirth, char genderOfPlayer, String categoryOfPlay, String clubOfPlayer, int totalMatches, int wonMatches, int lostMatches, int playerSTR, double playerSTRstabil) {
        this.nameOfPlayer = nameOfPlayer;
        this.IDofPlayer = IDofPlayer;
        this.yearOfBirth = yearOfBirth;
        this.genderOfPlayer = getGenderFromChar(genderOfPlayer);
        this.categoryOfPlay = categoryOfPlay;
        this.clubOfPlayer = clubOfPlayer;
        this.totalMatches = totalMatches;
        this.wonMatches = wonMatches;
        this.lostMatches = lostMatches;
        this.playerSTR = playerSTR;
        this.playerSTRstabil = playerSTRstabil;
        this.playerSuccessRate = getPlayerSuccessRateInPercentage();
        this.playerAge = getPlayerAge();
    }

    /**
     *
     * @return name of the league that the players are in
     */
    public String getNameOfLeague() {
        return nameOfLeague;
    }

    /**
     *
     * @return name of the specific player
     */
    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    /**
     *
     * @return ID of player
     */
    public long getIDofPlayer() {
        return IDofPlayer;
    }

    /**
     *
     * @return year of birth of the player
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     *
     * @return gender of player
     */
    public Gender getGenderOfPlayer() {
        return genderOfPlayer;

    }

    /**
     *
     * @return category that the player is playing in
     */
    public String getCategoryOfPlay() {
        return categoryOfPlay;
    }

    /**
     *
     * @return club of the player
     */
    public String getClubOfPlayer() {
        return clubOfPlayer;
    }

    /**
     *
     * @return total matches of player
     */
    public int getTotalMatches() {
        return totalMatches;
    }

    /**
     *
     * @return total won matches of player
     */
    public int getWonMatches() {
        return wonMatches;
    }

    /**
     *
     * @return total lost matches
     */
    public int getLostMatches() {
        return lostMatches;
    }

    /**
     *
     * @return player STR
     */
    public int getPlayerSTR() {
        return playerSTR;
    }

    /**
     *
     * @return player STRstab
     */
    public double getPlayerSTRstabil() {
        return playerSTRstabil;
    }

    /**
     *
     * @return players age
     */
    public int getPlayerAge() {
        playerAge = 2022 - yearOfBirth;
        return playerAge;
    }

    /**
     *
     * @return player success rate in percentage up two 2 decimal places
     */
    public double getPlayerSuccessRateInPercentage() {
        if (totalMatches == 0) {
            return 0;
        }
        playerSuccessRate = (double) wonMatches * 100 / (double) totalMatches;
        String formattedSuccessRate = String.format("%.2f", playerSuccessRate).replace(",", ".");
        playerSuccessRate = Double.parseDouble(formattedSuccessRate);
        return playerSuccessRate;
    }

    /**
     *
     * @param o - object player
     * @return UnsupportedOperationException
     */
    @Override
    public int compareTo(Player o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * method using enum
     */
    public enum Gender {
        Muž, Žena;
    }

    /**
     *
     * @param genderOfPlayer - gender of player
     * @return for character M - Muž, for character Z - Žena, else - null (but
     * cannot happen)
     */
    public Gender getGenderFromChar(char genderOfPlayer) {
        return switch (genderOfPlayer) {
            case 'M' ->
                Gender.Muž;
            case 'Z' ->
                Gender.Žena;
            default ->
                null;
        };
    }

    /**
     *
     * @return string representation of the player, including all information
     * about that player
     */
    @Override
    public String toString() {
        return "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"
                + "\n" + "                         Příjmení a jméno hráče: " + nameOfPlayer + "\n"
                + "                         ID: " + IDofPlayer + "\n"
                + "                         Rok narození: " + yearOfBirth + "\n"
                + "                         Pohlaví: " + genderOfPlayer + "\n"
                + "                         Kategorie: " + categoryOfPlay + "\n"
                + "                         Družstvo: " + clubOfPlayer + "\n"
                + "                         Celkem odehraných zápasů: " + totalMatches + "\n"
                + "                         Vyhraných zápasů: " + wonMatches + "\n"
                + "                         Prohraných zápasů: " + lostMatches + "\n"
                + "                         STR: " + playerSTR + "\n"
                + "                         STRstabil: " + playerSTRstabil + "\n"
                + "                         Úspěšnost: " + playerSuccessRate + "%" + "\n"
                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
    }

    /**
     * this method checks if a player with the given name exists within the
     * source files, if yes all the information about the player is returned as
     * a string, otherwise a error message is returned
     *
     * @param playerName - players name to be searched
     * @param pathToFile - path to the file with the source data
     * @return string representing all information about the player if he exists
     * within that league in the source data, otherwise a message saying that
     * the player with that name doesnt exist
     * @throws IOException
     */
    public static String getPlayerInfoByName(String playerName, String pathToFile) throws IOException {
        String nameOfLeague = FileUtility.getNameOfLeagueLeaderBoardSTR(pathToFile);
        ArrayList<Player> players = FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile);
        for (Player player : players) {
            if (player.getNameOfPlayer().equalsIgnoreCase(playerName)) {
                return player.toString();
            }
        }
        return "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                + "Hráč '" + playerName + "' nebyl nalezen v soutěži " + nameOfLeague + "\n" + "Zkontrolujte jméno a zkuste to znovu." + "\n"
                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
    }

    /**
     * this method checks if a player with the given ID exists within the source
     * files, if yes all the information about the player is returned as a
     * string, otherwise a error message is returned
     *
     * @param IDofPlayer - ID of the player to be searched
     * @param pathToFile - path to the file with the source data
     * @return string representing all information about the player if he exists
     * within that league in the source data, otherwise a message saying that
     * the player with that ID doesnt exist
     * @throws IOException
     */
    public static String getPlayerInfoByID(long IDofPlayer, String pathToFile) throws IOException {
        String nameOfLeague = FileUtility.getNameOfLeagueLeaderBoardSTR(pathToFile);
        ArrayList<Player> players = FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile);
        for (Player player : players) {
            if (player.IDofPlayer == IDofPlayer) {
                return player.toString();
            }
        }
        return "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                + "Hráč s ID '" + IDofPlayer + "' nebyl nalezen v tabulce soutěže " + nameOfLeague + "\n" + "Zkontrolujte ID a zkuste to znovu."
                + "\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
    }

    /**
     * this method checks if the player exists, if yes, the method returns the
     * STR value of that specific player before the match, otherwise it returns
     * -1, signalling that he doesnt exist within the source data
     *
     * @param winnerName - name of the winner
     * @param pathToFile - path to the file with the source data
     * @return STR of the specific player (if he exists), otherwise -1
     * @throws IOException
     */
    public static int checkedWinnerSTRBeforeMatch(String winnerName, String pathToFile) throws IOException {
        ArrayList<Player> players = FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile);
        for (Player player : players) {
            if (player.getNameOfPlayer().equalsIgnoreCase(winnerName)) {
                return player.getPlayerSTR();
            }
        }
        return -1;
    }

    /**
     * this method checks if the player exists, if yes, the method returns the
     * STR value of that specific player before the match, otherwise it returns
     * -1, signalling that he doesnt exist within the source data
     *
     * @param looserName - name of the winner
     * @param pathToFile - path to the file with the source data
     * @return STR of the specific player (if he exists), otherwise -1
     * @throws IOException
     */
    public static int checkedLooserSTRBeforeMatch(String looserName, String pathToFile) throws IOException {
        ArrayList<Player> players = FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile);
        for (Player player : players) {
            if (player.getNameOfPlayer().equalsIgnoreCase(looserName)) {
                return player.getPlayerSTR();
            }
        }
        return -1;
    }

    /**
     * this method computes the winners and loosers STR values if they would
     * play a match against each other, it uses the methods in the class
     * STRcompute.java, before computing the STR after the match a check is
     * applied, checking if both players exist: both dont have STR before the
     * match of the value of -1
     *
     * @param winnerName - winners name
     * @param looserName - loosers name
     * @param pathToFile - path to the file with the source data
     * @return an static int array of this form [winnerSTRafterMatch,
     * looserSTRafterMatch]
     * @throws IOException
     */
    public static int[] computeWinnerAndLooserSTRAfterMatch(String winnerName, String looserName, String pathToFile) throws IOException {
        int winnerSTRbefore = checkedWinnerSTRBeforeMatch(winnerName, pathToFile);
        int looserSTRbefore = checkedLooserSTRBeforeMatch(looserName, pathToFile);
        int[] bothResultSTRafterMatch = new int[2];
        if ((winnerSTRbefore != -1) && (looserSTRbefore != -1)) {
            bothResultSTRafterMatch[0] = STRcompute.getWinnerSTR(winnerSTRbefore, looserSTRbefore); //stores the winnerSTR after match
            bothResultSTRafterMatch[1] = STRcompute.getLooserSTR(winnerSTRbefore, looserSTRbefore); //stores the looserSTR after match
            return bothResultSTRafterMatch;

        }
        return bothResultSTRafterMatch;
    }

    /**
     * this method checks if the player exists, if yes, the method returns the
     * STRstabil value of that specific player before the match, otherwise it
     * returns -1, signalling that he doesnt exist within the source data
     *
     * @param winnerName - name of the winner
     * @param pathToFile - path to the file with the source data
     * @return STRstabil of the specific player (if he exists), otherwise -1
     * @throws IOException
     */
    public static double checkedWinnerSTRstabilBeforeMatch(String winnerName, String pathToFile) throws IOException {
        ArrayList<Player> players = FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile);
        for (Player player : players) {
            if (player.getNameOfPlayer().equalsIgnoreCase(winnerName)) {
                return player.getPlayerSTRstabil();
            }
        }
        return -1;
    }

    /**
     * this method checks if the player exists, if yes, the method returns the
     * STRstabil value of that specific player before the match, otherwise it
     * returns -1, signalling that he doesnt exist within the source data
     *
     * @param looserName - name of the winner
     * @param pathToFile - path to the file with the source data
     * @return STRstabil of the specific player (if he exists), otherwise -1
     * @throws IOException
     */
    public static double checkedLooserSTRstabilBeforeMatch(String looserName, String pathToFile) throws IOException {
        ArrayList<Player> players = FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile);
        for (Player player : players) {
            if (player.getNameOfPlayer().equalsIgnoreCase(looserName)) {
                return player.getPlayerSTRstabil();
            }
        }
        return -1;
    }

    /**
     * this method computes the winners and loosers STRstabil values if they
     * would play a match against each other, it uses the methods in the class
     * STRcompute.java, before computing the STRstabil after the match a check
     * is applied, checking if both players exist: both dont have STRstabil
     * before the match of the value of -1
     *
     * @param winnerName - winners name
     * @param looserName - loosers name
     * @param pathToFile - path to the file with the source data
     * @return an static int array of this form [winnerSTRstabilAfterMatch,
     * looserSTRstabilAfterMatch]
     * @throws IOException
     */
    public static double[] computeWinnerAndLooserSTRstabilAfterMatch(String winnerName, String looserName, String pathToFile) throws IOException {
        double winnerSTRstabilBefore = checkedWinnerSTRstabilBeforeMatch(winnerName, pathToFile);
        double looserSTRstabilBefore = checkedLooserSTRstabilBeforeMatch(looserName, pathToFile);
        int winnerSTRbefore = checkedWinnerSTRBeforeMatch(winnerName, pathToFile);
        int looserSTRbefore = checkedLooserSTRBeforeMatch(looserName, pathToFile);
        double[] bothResultSTRstabilAfterMatch = new double[2];
        if ((winnerSTRstabilBefore != -1) && (looserSTRstabilBefore != -1)) {
            //stores the winnerSTRstab after match
            bothResultSTRstabilAfterMatch[0] = STRcompute.getWinnerSTRstab(winnerSTRbefore, winnerSTRstabilBefore, looserSTRbefore, looserSTRstabilBefore);
            //stores the looserSTRstab after match
            bothResultSTRstabilAfterMatch[1] = STRcompute.getLooserSTRstab(winnerSTRbefore, winnerSTRstabilBefore, looserSTRbefore, looserSTRstabilBefore);
        }
        return bothResultSTRstabilAfterMatch;
    }

    /**
     * this is a last checker method that checks if all values of the STR and
     * STRstab of both player before and after the match are valid if all the
     * values are valid, true is returned, otherwise if atleast one is not valid
     * false is returned
     *
     * @param winnerName - name of winner
     * @param looserName - name of looser
     * @param pathToFile - path to the file with the source data
     * @return true if all values of STR and STRstab are valid, false otherwise
     * @throws IOException
     */
    public static boolean validitizeStatsForMatchStatistics(String winnerName, String looserName, String pathToFile) throws IOException {
        int[] tempAfterMatchSTR = computeWinnerAndLooserSTRAfterMatch(winnerName, looserName, pathToFile);
        double[] tempAfterMatchSTRstabil = computeWinnerAndLooserSTRstabilAfterMatch(winnerName, looserName, pathToFile);
        int winnerSTRbefore = checkedWinnerSTRBeforeMatch(winnerName, pathToFile);
        int looserSTRbefore = checkedLooserSTRBeforeMatch(looserName, pathToFile);
        double winnerSTRstabilBefore = checkedWinnerSTRstabilBeforeMatch(winnerName, pathToFile);
        double looserSTRstabilBefore = checkedLooserSTRstabilBeforeMatch(looserName, pathToFile);
        int winnerSTRafter = tempAfterMatchSTR[0];
        int looserSTRafter = tempAfterMatchSTR[1];
        double winnerSTRstabilAfter = tempAfterMatchSTRstabil[0];
        double looserSTRstabilAfter = tempAfterMatchSTRstabil[1];
        return winnerSTRbefore != -1
                && looserSTRbefore != -1
                && winnerSTRstabilBefore != -1
                && looserSTRstabilBefore != -1
                && winnerSTRafter != -1
                && looserSTRafter != -1
                && winnerSTRstabilAfter != -1
                && looserSTRstabilAfter != -1;
    }

    /**
     * this method prepares a String that is used when sorting the players by
     * age
     *
     * @param players - list of objects player
     * @return string with all the players
     */
    public static String sortedStringForAgeSort(List<Player> players) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Player player : players) {
            builder.append(i).append(". ").append(player.getNameOfPlayer()).append(" - ");
            builder.append(player.getPlayerAge()).append(" let").append("\n");
            i++;
        }
        return builder.toString();
    }

    /**
     * this method sorts players by age from oldest and returns the string
     * representing these sorted players
     *
     * @param players - list of players
     * @return sorted players by age from oldest to youngest in a string
     */
    @SuppressWarnings("Convert2Lambda")
    public static String sortPlayersByAgeFromOldest(List<Player> players) {
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p2.getPlayerAge() - p1.getPlayerAge();
            }
        });
        return sortedStringForAgeSort(players);
    }

    /**
     * this method sorts players by age from youngest and returns the string
     * representing these sorted players
     *
     * @param players - list of players
     * @return sorted players by age from youngest to oldest in a string
     */
    @SuppressWarnings("Convert2Lambda")
    public static String sortPlayersByAgeFromYoungest(List<Player> players) {
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p1.getPlayerAge() - p2.getPlayerAge();
            }
        });
        return sortedStringForAgeSort(players);
    }

    /**
     * this method prepares a String that is used when sorting the players by
     * name
     *
     * @param players - list of objects player
     * @return string with all the players
     */
    public static String sortedStringForNameSort(List<Player> players) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Player player : players) {
            builder.append(i).append(". ").append(player.getNameOfPlayer()).append("\n");
            i++;
        }
        return builder.toString();
    }

    /**
     * this method returns the players sorted by name from A taking into account
     * czech letters
     *
     * @param players - list of objects player
     * @return sorted players by name from A
     */
    public static String sortPlayersByName(List<Player> players) {
        Collections.sort(players, new ComparatorByNamePlayer());
        return sortedStringForNameSort(players);
    }

    /**
     * this method returns the players sorted by name from Z taking into account
     * czech letters
     *
     * @param players - list of objects player
     * @return sorted players by name from Z
     */
    public static String sortPlayersByNameReverse(List<Player> players) {
        Collections.sort(players, new ComparatorByNamePlayer().reversed());
        return sortedStringForNameSort(players);
    }

    /**
     * this method prepares a String that is used when sorting the players by
     * success rate
     *
     * @param players - list of objects player
     * @return string with all the players
     */
    public static String sortedStringForSuccessRateSort(List<Player> players) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Player player : players) {
            builder.append(i).append(". ").append(player.getNameOfPlayer());
            builder.append(" - ").append(player.getPlayerSuccessRateInPercentage()).append("%").append("\n");
            i++;
        }
        return builder.toString();
    }

    /**
     * this method returns the players sorted by success rate from the highest
     * to lowest
     *
     * @param players - list of objects player
     * @return sorted players by success rate from the highest to lowest
     */
    public static String sortPlayersBySuccessRate(List<Player> players) {
        Collections.sort(players, new ComparatorBySuccessRatePlayer());
        return sortedStringForSuccessRateSort(players);
    }

    /**
     * this method returns the players sorted by success rate from the lowest to
     * highest
     *
     * @param players - list of objects player
     * @return sorted players by success rate from the lowest to highest
     */
    public static String sortPlayersBySuccessRateReverse(List<Player> players) {
        Collections.sort(players, new ComparatorBySuccessRatePlayer().reversed());
        return sortedStringForSuccessRateSort(players);
    }

    /**
     * this method prepares a String that is used when sorting the players by
     * the values of STR
     *
     * @param players - list of objects player
     * @return string with all the players
     */
    public static String sortedStringForSTR(List<Player> players) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (Player player : players) {
            builder.append(i).append(". ").append(player.getNameOfPlayer());
            builder.append(" - STR: ").append(player.getPlayerSTR()).append(", STRstabil: ").append(player.getPlayerSTRstabil()).append("\n");
            i++;
        }
        return builder.toString();
    }

    /**
     * this method returns the players sorted by the values of STR from the
     * highest to lowest
     *
     * @param players - list of objects player
     * @return sorted players by success rate from the highest to lowest
     */
    public static String sortPlayersBySTR(List<Player> players) {
        Collections.sort(players, new ComparatorBySTRPlayer());
        return sortedStringForSTR(players);
    }

    /**
     * this method returns the players sorted by the values of STR from the
     * lowest to highest
     *
     * @param players - list of objects player
     * @return sorted players by success rate from the lowest to highest
     */
    public static String sortPlayersBySTRReverse(List<Player> players) {
        Collections.sort(players, new ComparatorBySTRPlayer().reversed());
        return sortedStringForSTR(players);
    }
}
