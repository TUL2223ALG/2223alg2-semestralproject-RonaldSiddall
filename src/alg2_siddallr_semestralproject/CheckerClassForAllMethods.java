package alg2_siddallr_semestralproject;

import java.io.File;
import java.io.IOException;

/**
 * this class is used to check for all the methods that are used within the
 * program if the file, that is supposed to be used, is valid, if yes, the
 * method returns the same, if not, the method returns an IOexception with the
 * message this class is somewhat of an barrier between the logic and the UI of
 * the project
 *
 * @author Ronald Ch. Siddall
 */
public class CheckerClassForAllMethods {

    /**
     * this method is used in all the following methods, it checks if a file
     * exists
     *
     * @param pathToFile
     * @throws IOException
     */
    public static void checkerIfFileExists(String pathToFile) throws IOException {
        File textFile = new File(pathToFile);
        if (!textFile.exists()) {
            throw new IOException();
        }
    }

    /**
     * this method checks the getPlayerInfoByID method, then it runs it if the
     * file exists, otherwise an appropriate message saying that the file doesnt
     * exist is returned
     *
     * @param IDofPlayer - ID of the player to be searched
     * @param pathToFile - path to the file with the source data
     * @return string representing all information about the player if he exists
     * within that league in the source data, otherwise a message saying that
     * the player with that ID doesnt exist
     */
    public static String checkPlayerInfoByID(long IDofPlayer, String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return Player.getPlayerInfoByID(IDofPlayer, pathToFile);
        } catch (IOException e) {
            return ("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the getPlayerInfoByName method, then it runs it if the
     * file exists, otherwise an appropriate message saying that the file doesnt
     * exist is returned
     *
     * @param playerName - name of the player
     * @param pathToFile - path to the file with the source data
     * @return string representing all information about the player if he exists
     * within that league in the source data, otherwise a message saying that
     * the player with that name doesnt exist
     */
    public static String checkPlayerInfoByName(String playerName, String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return Player.getPlayerInfoByName(playerName, pathToFile);
        } catch (IOException e) {
            return ("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the getNameOfLeagueLeaderBoardTeams method, then it
     * runs it if the file exists, otherwise an appropriate message saying that
     * the file doesnt exist is returned
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return the name of the league in the leaderboard for the teams
     */
    public static String checkNameOfLeagueLeaderBoardTeams(String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return FileUtility.getNameOfLeagueLeaderBoardTeams(pathToFile);
        } catch (IOException e) {
            return ("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the getNameOfLeagueLeaderBoardSTR method, then it runs
     * it if the file exists, otherwise an appropriate message saying that the
     * file doesnt exist is returned
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return the name of the league in the leaderboard for individual players
     */
    public static String checkNameOfLeagueLeaderBoardForSTR(String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return FileUtility.getNameOfLeagueLeaderBoardSTR(pathToFile);
        } catch (IOException e) {
            return ("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the getTeamInfoByName method, then it runs it if the
     * file exists, otherwise an appropriate message saying that the file doesnt
     * exist is returned
     *
     * @param nameOfTeam - the name of the team that is supposed to be searched
     * @param pathToFile - the path to the source file with the data of the
     * teams
     * @return the team´s string representation if its found within the source
     * data, or an error message if not found
     */
    public static String checkTeamInfoByName(String nameOfTeam, String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return Team.getTeamInfoByName(nameOfTeam, pathToFile);
        } catch (IOException e) {
            return ("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the getFormattedTimeSinceCreationOfLeaderBoardSTR
     * method, then it runs it if the file exists, otherwise an appropriate
     * message saying that the file doesnt exist is returned
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return an array that is of this format [days, hours, minutes, seconds]
     * since the creation of the file
     * @throws IOException
     */
    public static long[] checkTimeSinceCreationOfLeaderBoardSTR(String pathToFile) throws IOException {
        try {
            checkerIfFileExists(pathToFile);
            if (FileUtility.getFormattedTimeSinceCreationOfLeaderBoardSTR(pathToFile) != null) {
                return FileUtility.getFormattedTimeSinceCreationOfLeaderBoardSTR(pathToFile);
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
        return FileUtility.getFormattedTimeSinceCreationOfLeaderBoardSTR(pathToFile);
    }

    /**
     * this method checks the validitizeStatsForMatchStatistics method, then it
     * runs it if the file exists, otherwise an appropriate message saying that
     * the file doesnt exist is returned
     *
     * @param winnerName - name of winner
     * @param looserName - name of looser
     * @param pathToFile - path to the file with the source data
     * @return true if all values of STR and STRstab are valid, false otherwise
     * @throws IOException
     */
    public static boolean checkStatsForMatchStatistics(String winnerName, String looserName, String pathToFile) throws IOException {
        try {
            checkerIfFileExists(pathToFile);
            Player.validitizeStatsForMatchStatistics(winnerName, looserName, pathToFile);
        } catch (IOException e) {
            System.out.println("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
        return Player.validitizeStatsForMatchStatistics(winnerName, looserName, pathToFile);
    }

    /**
     * this method checks the convertStatsAfterMatchToString method, then it
     * runs it if the file exists, otherwise an appropriate message saying that
     * the file doesnt exist is returned
     *
     * @param winnerName - name of the winner
     * @param looserName - name of the looser
     * @param pathToFile - path to the source file, where the information about
     * the players are stored
     * @return a String representing the results of the match
     * @throws IOException
     */
    public static String checkConvertStatsAfterMatchToString(String winnerName, String looserName, String pathToFile) throws IOException {
        try {
            checkerIfFileExists(pathToFile);
            return EmailSendingSystem.convertStatsAfterMatchToString(winnerName, looserName, pathToFile);

        } catch (IOException e) {
            return ("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the checkStatsForMatchStatistics method, if it is true
     * then an email with non problematic data is sent, otherwise an email with
     * an error message is sent, an email is only sent when the file with the
     * source data exists
     *
     * @param pathToFile - the path to the file with the source data
     * @param recipientEmail - email of recipient
     * @param winnerName - name of winner
     * @param looserName - name of looser
     * @param pathOfFileWhereToCreate - the path of where the attachment of the
     * email will be created
     * @param nameOfFile - name of the attachment of the email
     * @throws IOException
     */
    public static void checkSendingCompleteEmailAndCreateFile(String winnerName, String looserName, String pathToFile, String pathOfFileWhereToCreate, String nameOfFile, String recipientEmail) throws IOException {
        try {
            checkerIfFileExists(pathToFile);
            if (checkStatsForMatchStatistics(winnerName, looserName, pathToFile)) {
                FileUtility.writeInfoAfterMatchIntoFile(winnerName, looserName, pathToFile, pathOfFileWhereToCreate, nameOfFile);
                String attachmentPath = pathOfFileWhereToCreate + "\\" + nameOfFile + ".txt";
                EmailSendingSystem.sendNonProblematicEmailWithAttachment(recipientEmail, winnerName, looserName, attachmentPath, nameOfFile);
            } else {
                FileUtility.writeInfoAfterMatchIntoFile(winnerName, looserName, pathToFile, pathOfFileWhereToCreate, nameOfFile);
                String attachmentPath = pathOfFileWhereToCreate + "\\" + nameOfFile + ".txt";
                EmailSendingSystem.sendEmailWithAttachmentAboutProblem(recipientEmail, winnerName, looserName, attachmentPath, nameOfFile);
            }
        } catch (IOException e) {
            System.out.println("\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n"
                    + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu." + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this method checks the sortPlayersByAgeFromOldest method, then it runs it
     * if the file exists, otherwise an appropriate message saying that the file
     * doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by age from youngest to oldest in a string
     */
    public static String checkSortPlayersByAgeFromOldest(String pathToFile) {
        try {
            return Player.sortPlayersByAgeFromOldest(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersByAgeFromYoungest method, then it runs
     * it if the file exists, otherwise an appropriate message saying that the
     * file doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by age from youngest to youngest in a string
     */
    public static String checkSortPlayerByAgeFromYoungest(String pathToFile) {
        try {
            return Player.sortPlayersByAgeFromYoungest(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersByName method, then it runs it if the
     * file exists, otherwise an appropriate message saying that the file doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by name from A
     */
    public static String checkSortPlayersByName(String pathToFile) {
        try {
            return Player.sortPlayersByName(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersByNameReverse method, then it runs it
     * if the file exists, otherwise an appropriate message saying that the file
     * doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by name from Z
     */
    public static String checkSortPlayersByNameReverse(String pathToFile) {
        try {
            return Player.sortPlayersByNameReverse(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersBySuccessRate method, then it runs it
     * if the file exists, otherwise an appropriate message saying that the file
     * doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by the highest success rate
     */
    public static String checkSortPlayersBySuccessRate(String pathToFile) {
        try {
            return Player.sortPlayersBySuccessRate(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersBySuccessRateReverse method, then it
     * runs it if the file exists, otherwise an appropriate message saying that
     * the file doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by the lowest success rate
     */
    public static String checkSortPlayersBySuccessRateReverse(String pathToFile) {
        try {
            return Player.sortPlayersBySuccessRateReverse(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersBySTR method, then it runs it if the
     * file exists, otherwise an appropriate message saying that the file doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by the highest STR
     */
    public static String checkSortPlayersBySTR(String pathToFile) {
        try {
            return Player.sortPlayersBySTR(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortPlayersBySTRReverse method, then it runs it if
     * the file exists, otherwise an appropriate message saying that the file
     * doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted players by the lowest STR
     */
    public static String checkSortPlayersBySTRReverse(String pathToFile) {
        try {
            return Player.sortPlayersBySTRReverse(FileUtility.loadPlayerInfoFromLeaderBoardSTR(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortTeamsBySuccessRate method, then it runs it if
     * the file exists, otherwise an appropriate message saying that the file
     * doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted teams by the highest success rate
     */
    public static String checkSortTeamsBySuccessRate(String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return Team.sortTeamsBySuccessRate(FileUtility.loadTeamsFromLeaderBoardTeams(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }

    /**
     * this method checks the sortTeamsByPoints method, then it runs it if the
     * file exists, otherwise an appropriate message saying that the file doesnt
     *
     * @param pathToFile - the path of the file with the source data
     * @return sorted teams by name from the most points
     */
    public static String checkSortTeamsByPoints(String pathToFile) {
        try {
            checkerIfFileExists(pathToFile);
            return Team.sortTeamsByPoints(FileUtility.loadTeamsFromLeaderBoardTeams(pathToFile));
        } catch (IOException e) {
            return ("Soubor s adresářem '" + pathToFile + "', který Vámi byl zadán, neexistuje." + "\n" + "Ujistěte se prosím, že složka s Vámi zadaným adresářem existuje a zkuste to znovu.");
        }
    }
}
