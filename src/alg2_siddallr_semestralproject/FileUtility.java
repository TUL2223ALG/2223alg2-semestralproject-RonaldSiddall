package alg2_siddallr_semestralproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * this class is used as a utility class that works with the files, from
 * reading, to creating and writting into new files some of the methods are used
 * to load information from the source files
 *
 * @author Ronald Ch. Siddall
 */
public class FileUtility {

    /**
     * this method reads the file and determines the name of the league that the
     * document represents
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return the name of the league in the leaderboard for individual players
     * @throws IOException
     */
    public static String getNameOfLeagueLeaderBoardSTR(String pathToFile) throws IOException {
        File textFile = new File(pathToFile);
        String nameOfLeague = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            String[] parts;
            while ((line = reader.readLine()) != null) {
                parts = line.split("STR - ");
                if (parts.length > 1) {
                    nameOfLeague = parts[1].replace(";", "");
                    break;
                }
            }
        } catch (IOException ex) {

            System.out.println("Nastala chyba při načítání názvu soutěže. Zkontrolujte cestu k souboru.");
            System.out.println(pathToFile);

        }
        return nameOfLeague;
    }

    /**
     * this method finds the specific line where the time of the creation of
     * that specific file, than it returns it
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return the time of the creation of the leaderboard for individual
     * players that is avaible in the file itself
     * @throws IOException
     */
    public static String getTimeOfCreationOfLeaderBoardSTR(String pathToFile) throws IOException {
        File textFile = new File(pathToFile);
        String timeOfCreationLeaderBoard = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            String[] parts;
            while ((line = reader.readLine()) != null) {
                parts = line.split("Vygenerováno: ");
                if (parts.length > 1) {
                    timeOfCreationLeaderBoard = parts[1].replace(";", "");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Nastala chyba při načítání času vytvoření tabulky. Zkontrolujte cestu k souboru.");
            System.out.println(pathToFile);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
        return timeOfCreationLeaderBoard;
    }

    /**
     * this methods reads the file from the source data, then it creates a
     * object Player for each line, that contains a player, that is added to the
     * list of players, each player has many determining attributes that make
     * him unique
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return the list of players
     * @throws IOException
     */
    public static ArrayList<Player> loadPlayerInfoFromLeaderBoardSTR(String pathToFile) throws IOException {
        File textFile = new File(pathToFile);
        ArrayList<Player> playerList = new ArrayList(); // create a dynamic array to store the player information
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            String[] parts;
            String nameOfPlayer;
            long IDofPlayer;
            int yearOfBirth;
            char genderOfPlayer;
            String categoryOfPlay;
            String clubOfPlayer;
            int totalMatches;
            int wonMatches;
            int lostMatches;
            int playerSTR;
            double playerSTRstabil;

            while ((line = reader.readLine()) != null) {
                // Skip lines that don't start with a digit
                if (!Character.isDigit(line.charAt(0))) {
                    continue;
                }
                parts = line.split(";");
                nameOfPlayer = parts[2];
                IDofPlayer = Long.parseLong(parts[1]);
                yearOfBirth = Integer.parseInt(parts[3]);
                genderOfPlayer = parts[4].charAt(0);
                categoryOfPlay = parts[5];
                clubOfPlayer = parts[6];
                totalMatches = Integer.parseInt(parts[7]);
                wonMatches = Integer.parseInt(parts[8]);
                lostMatches = Integer.parseInt(parts[9]);
                playerSTR = Integer.parseInt(parts[10]);
                playerSTRstabil = Double.parseDouble(parts[11].replace(',', '.'));

                Player player = new Player(nameOfPlayer, IDofPlayer, yearOfBirth, genderOfPlayer, categoryOfPlay, clubOfPlayer, totalMatches, wonMatches, lostMatches, playerSTR, playerSTRstabil);
                playerList.add(player);
            }
        } catch (IOException e) {
            System.out.println("Nastala chyba při načítání hráčů z tabulky. Zkontrolujte cestu k souboru.");
            System.out.println(pathToFile);
        }
        return playerList;
    }

    /**
     * this method is the exact same as the previous method, it reads the
     * corresponding source file and with the relevant data it creates the team
     * objects that are stored into a array list
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return list of teams
     * @throws IOException
     */
    public static ArrayList<Team> loadTeamsFromLeaderBoardTeams(String pathToFile) throws IOException {
        File textFile = new File(pathToFile);
        ArrayList<Team> teamList = new ArrayList();
        String stopText = "Tabulka z domácích utkání";
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            String parts[];
            String nameOfTeam;
            int totalMatchesTeam;
            int wonMatchesTeam;
            int drawnMatchesTeam;
            int lostMatchesTeam;
            int forfeitedMatchesTeam;
            int positiveScoreTeam;
            int negativeScoreTeam;
            int pointsTeam;
            while ((line = reader.readLine()) != null && !line.contains(stopText)) {
                if (!(Character.isDigit(line.charAt(1)) || Character.isDigit(line.charAt(2)))) {
                    continue;
                }
                parts = line.split(";");
                nameOfTeam = parts[2];
                totalMatchesTeam = Integer.parseInt(parts[3]);
                wonMatchesTeam = Integer.parseInt(parts[4]);
                drawnMatchesTeam = Integer.parseInt(parts[5]);
                lostMatchesTeam = Integer.parseInt(parts[6]);
                forfeitedMatchesTeam = Integer.parseInt(parts[7]);
                positiveScoreTeam = Integer.parseInt(parts[8]);
                negativeScoreTeam = Integer.parseInt(parts[9]);
                pointsTeam = Integer.parseInt(parts[10]);

                Team team = new Team(nameOfTeam, totalMatchesTeam, wonMatchesTeam, drawnMatchesTeam, lostMatchesTeam, forfeitedMatchesTeam, positiveScoreTeam, negativeScoreTeam, pointsTeam);
                teamList.add(team);
            }

        } catch (IOException e) {
            System.out.println("Nastala chyba při načítání hráčů z tabulky. Zkontrolujte cestu k souboru.");
            System.out.println(pathToFile);
        }
        return teamList;
    }

    /**
     * this method finds the specific line that has the name of the league of
     * the teams that the file is regarding to
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return name of the league of teams are playing in
     * @throws IOException
     */
    public static String getNameOfLeagueLeaderBoardTeams(String pathToFile) throws IOException {
        File textFile = new File(pathToFile);
        String nameOfLeagueWithWeirdSquare;
        String nameOfLeague = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            nameOfLeagueWithWeirdSquare = reader.readLine();
            nameOfLeague = nameOfLeagueWithWeirdSquare.substring(1).replace(";", "");
        } catch (IOException ex) {
            System.out.println("Nastala chyba při načítání názvu soutěže z tabulky týmů. Zkontrolujte cestu k souboru.");
            System.out.println(pathToFile);
        }
        return nameOfLeague;
    }

    /**
     * this method is used to compute the time since the creation of the file
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return time since the creation of the file in total seconds
     * @throws IOException
     */
    public static long getTimeSinceCreationLeaderBoardSTRinSeconds(String pathToFile) throws IOException {
        String creationTimeOfLeaderBoardSTR = getTimeOfCreationOfLeaderBoardSTR(pathToFile);
        if (creationTimeOfLeaderBoardSTR.matches("")) {
            return 0;
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime creationTime = LocalDateTime.parse(creationTimeOfLeaderBoardSTR, formatter);
            LocalDateTime currentTime = LocalDateTime.now();
            Duration timeElapsed = Duration.between(creationTime, currentTime);
            long secondsElapsed = timeElapsed.getSeconds();
            return secondsElapsed;
        }
    }

    /**
     * this method changes the time from total seconds to more readeble
     * information that means to days, hours, minutes, seconds since the file
     * was created
     *
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @return an array that is of this format [days, hours, minutes, seconds]
     * since the creation of the file
     * @throws IOException
     */
    public static long[] getFormattedTimeSinceCreationOfLeaderBoardSTR(String pathToFile) throws IOException {
        final int DEN = 86400;
        final int HODINA = 3600;
        final int MINUTA = 60;
        long[] timeResults = new long[4];
        long timeInSeconds = FileUtility.getTimeSinceCreationLeaderBoardSTRinSeconds(pathToFile);
        if (timeInSeconds != 0) {
            long days = timeInSeconds / DEN;
            long hours = (timeInSeconds % DEN) / HODINA;
            long minutes = (timeInSeconds % HODINA) / MINUTA;
            long seconds = timeInSeconds % MINUTA;
            timeResults[0] = days;
            timeResults[1] = hours;
            timeResults[2] = minutes;
            timeResults[3] = seconds;
            return timeResults;
        } else {
            return null;
        }
    }

    /**
     * this method is a generalised method that is used to write new information
     * into a new binary file
     *
     * @param text - the text that should be written into the new binary file
     * @param pathOfFileWhereToCreate - a directory where the binary file should
     * be created
     * @param nameOfFile - how the new file should be named
     */
    public static void writeIntoBinaryFileInGeneralMethod(String text, String pathOfFileWhereToCreate, String nameOfFile) {
        try (DataOutputStream writer = new DataOutputStream(new FileOutputStream(pathOfFileWhereToCreate + "\\" + nameOfFile + ".bin"))) {
            if (text != null) {
                writer.writeUTF(text);
            }
        } catch (IOException e) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Nastala chyba při zápisu informací o zápase do souboru. Zkontrolujte adresář, kde se má soubor vytvořit.");
            System.out.println(pathOfFileWhereToCreate);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }

    /**
     * this is a generalised method that is used to write new information into
     * the text file
     *
     * @param text - the text that should be written into the new text file
     * @param pathOfFileWhereToCreate - a directory where the text file should
     * be created
     * @param nameOfFile - how the new file should be named
     */
    public static void writeIntoTextFileInGeneralMethod(String text, String pathOfFileWhereToCreate, String nameOfFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOfFileWhereToCreate + "\\" + nameOfFile + ".txt"))) {
            if (text != null) {
                writer.write(text);
            }
        } catch (IOException e) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("Nastala chyba při zápisu informací o zápase do souboru. Zkontrolujte adresář, kde se má soubor vytvořit:");
            System.out.println(pathOfFileWhereToCreate);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        }
    }

    /**
     * this method uses the generalised method to write info into a text file,
     * the text that is written into the text file are the results of the match
     * between two specific players that are in the league of individual players
     *
     * @param winnerName
     * @param looserName
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @param pathOfFileWhereToCreate
     * @param nameOfFile
     * @throws IOException
     */
    public static void writeInfoAfterMatchIntoFile(String winnerName, String looserName, String pathToFile, String pathOfFileWhereToCreate, String nameOfFile) throws IOException {
        String text = CheckerClassForAllMethods.checkConvertStatsAfterMatchToString(winnerName, looserName, pathToFile);
        writeIntoTextFileInGeneralMethod(text, pathOfFileWhereToCreate, nameOfFile);
    }

    /**
     * this method uses the generalised method to write info into a binary file,
     * the text that is written into the file are the results of the match
     * between two specific players that are in the league of individual players
     *
     * @param winnerName - a String representing the winning player
     * @param looserName - a String representing the loosing player
     * @param pathToFile - path to the source file, where the information is
     * stored
     * @param pathOfFileWhereToCreate - a directory where the text file should
     * be created
     * @param nameOfFile - how the new file should be named
     * @throws IOException
     */
    public static void writeInfoAfterMatchIntoBinaryFile(String winnerName, String looserName, String pathToFile, String pathOfFileWhereToCreate, String nameOfFile) throws IOException {
        String text = CheckerClassForAllMethods.checkConvertStatsAfterMatchToString(winnerName, looserName, pathToFile);
        writeIntoBinaryFileInGeneralMethod(text, pathOfFileWhereToCreate, nameOfFile);
    }
}
