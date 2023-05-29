package alg2_siddallr_semestralproject;

import java.util.Scanner;

/**
 * this class is used to manage the directories of source files that are used in
 * the rest of the project at standart the directories of the source files are
 * set to a specific path with the original files but if a user wants to change
 * the directories of the source files, he can, as long as they are in the
 * required type
 *
 * @author Ronald Ch. Siddall
 */
public class DirManageClass {
    //these are the standart directories that are used

    private static String standardDirectoryOfLeaderBoardForSTRDataFile = "C:\\Users\\cools\\OneDrive\\Dokumenty\\NetBeansProjects\\ALG2_SiddallR_SemestralProject\\alg2_siddallr_semestralproject_data\\leaderBoardForSTR.csv";
    private static String standardDirectoryOfLeaderBoardTeamsDataFile = "C:\\Users\\cools\\OneDrive\\Dokumenty\\NetBeansProjects\\ALG2_SiddallR_SemestralProject\\alg2_siddallr_semestralproject_data\\leaderBoardTeams.csv";
    private static String standardDirectoryOfWhereToCreateFile = "C:\\Users\\cools\\OneDrive\\Dokumenty\\NetBeansProjects\\ALG2_SiddallR_SemestralProject\\alg2_siddallr_semestralproject_data";
    public static Scanner sc = new Scanner(System.in, "Cp1250");

    /**
     * Changes the directories used in the project.
     *
     */
    public static void setDirectories() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        System.out.println("Chcete opravdu změnit adresáře zdrojových dat? (ano/ne)");
        if (sc.nextLine().equalsIgnoreCase("ano")) {
            System.out.println("Chcete opravdu změnit adresář zdrojových dat s tabulkou jednotlivců? (ano/ne)");
            if (sc.nextLine().equalsIgnoreCase("ano")) {
                System.out.println("Dobře, abyste správně změnili adresář, je nutné ho mít například v tomto tvaru:\nC:\\Users\\cools\\OneDrive\\Dokumenty\\NetBeansProjects\\ALG2_SemestralProject\\src\\alg2_semestralproject_data\\leaderBoardForSTR.csv");
                System.out.println("Vložte nový adresář pro zdrojová data s tabulkou jednotlivců:");
                standardDirectoryOfLeaderBoardForSTRDataFile = sc.nextLine();
                System.out.println("Adresář byl změněn na: " + standardDirectoryOfLeaderBoardForSTRDataFile + "\n");
            } else {
                System.out.println("\n" + "Akce byla přerušena, adresář pro zdrojová data s tabulkou jednotlivců nebyl změněn.\n");
            }

            System.out.println("Chcete opravdu změnit adresář pro zdrojová data s tabulkou týmů? (ano/ne)");
            if (sc.nextLine().equalsIgnoreCase("ano")) {
                System.out.println("Abyste správně změnili adresář, je nutné ho mít například v tomto tvaru:\nC:\\Users\\cools\\OneDrive\\Dokumenty\\NetBeansProjects\\ALG2_SemestralProject\\src\\alg2_semestralproject_data\\leaderBoardTeams.csv");
                System.out.println("Vložte nový adresář:");
                standardDirectoryOfLeaderBoardTeamsDataFile = sc.nextLine();
                System.out.println("Adresář byl změněn na: " + standardDirectoryOfLeaderBoardTeamsDataFile + "\n");
            } else {
                System.out.println("\n" + "Akce byla přerušena, adresář pro zdrojová data s tabulkou týmů nebyl změněn.\n");
            }

            System.out.println("Chcete opravdu změnit adresář, kam se mají vytvářet soubory se zápisem zápasu? (ano/ne)");
            if (sc.nextLine().equalsIgnoreCase("ano")) {
                System.out.println("Abyste správně změnili adresář, je nutné ho mít například v tomto tvaru:\nC:\\Users\\cools\\OneDrive\\Dokumenty\\NetBeansProjects\\ALG2_SemestralProject\\src\\alg2_semestralproject_data\\leaderBoardTeams.csv");
                System.out.println("Vložte nový adresář:");
                standardDirectoryOfWhereToCreateFile = sc.nextLine();
                System.out.println("Adresář byl změněn na: " + standardDirectoryOfWhereToCreateFile + "\n");
            } else {
                System.out.println("\n" + "Akce byla přerušena, adresář, kde se mají vytvářet soubory, nebyl změněn.\n");
            }
        } else {
            System.out.println("\n" + "Akce byla přerušena, žádný adresář nebyl změněn.");
        }
    }

    /**
     * @return the directory path for the source data file with individual
     * player leaderboard
     */
    public static String getDirSTR() {
        return standardDirectoryOfLeaderBoardForSTRDataFile;
    }

    /**
     * @return the directory path for the source data file with team leaderboard
     */
    public static String getDirTeams() {
        return standardDirectoryOfLeaderBoardTeamsDataFile;
    }

    /**
     * @return the directory path where the files for match records are created
     */
    public static String getDirWhereToCreate() {
        return standardDirectoryOfWhereToCreateFile;
    }
}
