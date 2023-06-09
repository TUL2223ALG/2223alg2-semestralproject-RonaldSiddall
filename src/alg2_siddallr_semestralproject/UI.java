package alg2_siddallr_semestralproject;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is the user interface (UI) of the whole project. It displays
 * menus, handles user inputted values, and calls the necessary methods for the
 * functioning of the project. Author: Ronald Ch. Siddall
 */
public class UI {
    static Scanner sc = new Scanner(System.in, "Cp1250");
    /**
     * the main method, uses switch function to direct the user based on their
     * choice
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        int choiceStartMenu;
        boolean endWholeProject = false;
        System.out.println(displayStartMenu());
        do {
            System.out.println(simplifiedStartMenu());
            try {
                choiceStartMenu = sc.nextInt();
                switch (choiceStartMenu) {
                    case 1 ->
                        projectBaseMenu();
                    case 2 ->
                        dirMenu();
                    case 3 ->
                        helpMenu();
                    case 0 -> {
                        endWholeProject = true;
                        System.out.println("\n" + "Děkuji za používání programu." + "\n" + " ♛♛♛ Na shledanou! ♛♛♛");
                    }
                    default ->
                        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                                + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                                + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                        + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                        + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
                sc.nextLine(); // Clear the invalid input from the scanner
            }
        } while (!endWholeProject);
    }

    /**
     * this method displays the first start menu when you open the program while
     * using string builder to function
     *
     * @return start menu text
     */
    private static String displayStartMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("                    Vítejte milý uživateli!").append("\n").append("\n").append("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        builder.append("\n").append("Toto je finální semestrální projekt Ronalda Siddalla na předmět ALG2.").append("\n").append("\n");
        builder.append("Pokud pracujete s programem poprvé, tak se podívejte do třetí sekce 'Návod k programu'.").append("\n");
        builder.append("Tam najdete podrobný návod toho jak program správně používat a k čemu slouží.").append("\n").append("\n");
        simplifiedStartMenu();
        return builder.toString();
    }

    /**
     * this is the simplified menu, uses string builder
     *
     * @return string with the simplified start menu
     */
    private static String simplifiedStartMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Hlavní program").append("\n").append("▶ 2. Změna adresářů pro datové soubory").append("\n").append("▶ 3. Návod k programu").append("\n");
        builder.append("▶ 0. Ukončit program ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * this method displays the whole help text
     */
    private static void helpMenu() {
        System.out.println(helpWithProgramMenu());
        if (sc.nextInt() != 0) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                    + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                    + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        }
    }

    /**
     * this is the main text of the help option, uses string builder
     *
     * @return the string of the help option
     */
    private static String helpWithProgramMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               NÁVOD K POUŽÍVÁNÍ PROGRAMU                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("------------------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                K čemu je tento program určený? ");
        builder.append("\n").append("------------------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("1) SIMULACE TEORETICKÉHO ZÁPASU:").append("\n").append("➜ Chcete-li zjistit, kolik bodů STR a STRstabil byste získali, pokud byste vyhráli s nějakým konkrétním hráčem z Vaší tabulky,");
        builder.append("\n").append("   tak Vám to můj program umožňuje (můžete libovolně zvolit vítěze a poraženého, dokud jsou oba součástí používané tabulky).");
        builder.append("\n").append("➜ Výsledky zhodnocení hypotetického nasimulovaného zápasu si můžete zobrazit na konzoli, v textovém či binárním souboru.").append("\n");
        builder.append("➜ Případně si můžete nechat zaslat automaticky vygenerovaný email s kompletním rozborem teoretického zápasu mezi danými hráči (vše v příloze emailu)!").append("\n");
        builder.append("\n").append("2) INFORMACE A STATISTIKY").append("\n");
        builder.append("➜ Přejete-li si zobrazit informace či statistiky nějakého konkrétního hráče, týmu nebo hrané soutěže, tak Vám toto vše program umožňuje.").append("\n");
        builder.append("➜ Vámi požadované informace se přehledně vypíší na konzoli.").append("\n").append("\n");
        builder.append("3) ŽEBŘÍČKY HRÁČŮ A TÝMŮ").append("\n");
        builder.append("➜ Máte možnost si zobrazit kompletní žebříčky hráčů či týmu, které lze více upravovat pro Vaše specifické požadavky.").append("\n");
        builder.append("➜ Vámi požadované informace se přehledně vypíší na konzoli.").append("\n");
        builder.append("\n").append("------------------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Jak tento program správně používat a jak funguje? ");
        builder.append("\n").append("------------------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("➜ Vždy se byste se měli řídit pokyny uvedených na obrazovce. Pro výběr konkrétní volby a 'pohyb' mezi úrovněmi programu využívejte klávesy s čísly.").append("\n").append("\n");
        builder.append("➜ Program využívá matematických modelů, a to zejména modelů 'ELO' a 'GLICKO 2', které jsou používané v různých soutěžích (př. šachy či stolní tenis).").append("\n");
        builder.append("   Na základě zdrojových dat program poté vypočítá co nejpřesnější odhad vývoje STR a STRstab obou hráčů, kdyby teoreticky proti sobě hráli zápas.").append("\n");
        builder.append("\n").append("------------------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Jaká zdrojová data tento program používá a kde je mohu najít? ");
        builder.append("\n").append("------------------------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("➜ Veškerá data, se kterými tento program pracuje, jsou volně dostupná ke stažení ve formátu .csv z oficiální stránky českého stolního tenisu:").append("\n");
        builder.append("   STIS: https://stis.ping-pong.cz/").append("\n");
        builder.append("➜ Stažená data, se kterými program pracuje, jsou uložena ve zdrojových souborech, jejichž adresáře si můžete bez problémů zobrazit.").append("\n").append("➜ Program nedokáže pracovat s internetovými zdroji - pro aktuální výsledky je potřeba je znovu stáhnout zdrojová data ze STIS").append("\n");
        builder.append("➜ Pokud chcete zobrazit současné adresáře zdrojových dat nebo chcete změnit tyto adresáře, tak se vraťte do úvodního menu a stikněte 2.").append("\n");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               PRO NÁVRAT DO ÚVODNÍHO MENU STISKNĚTE 0                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        return builder.toString();
    }

    /**
     * displays the dir menu options, uses switch function to direct the user
     * based on their choice
     */
    private static void dirMenu() throws IOException {
        int choiceDirMenu;
        boolean end = false;
        do {
            System.out.println(dirMenuText());
            choiceDirMenu = sc.nextInt();
            switch (choiceDirMenu) {
                case 1 ->
                    showCurrentDir();
                case 2 ->
                    changeCurrentDir();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * this method uses string builder that displays the options that can be
     * chosen in the dirMenu
     *
     * @return
     */
    private static String dirMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Zobrazit současné adresáře zdrojových dat a cesty k nim").append("\n").append("▶ 2. Změnit adresáře pro datové soubory").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays current dir
     */
    private static void showCurrentDir() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Váš současný adresář, kde jsou uložena zdrojová data pro jednotlivce:" + "\n" + DirManageClass.getDirSTR() + "\n");
        System.out.println("Váš současný adresář, kde jsou uložena zdrojová data pro týmy: " + "\n" + DirManageClass.getDirTeams() + "\n");
        System.out.println("Váš současný adresář, kam se budou vytvářet soubory s informacemi o zápase:" + "\n" + DirManageClass.getDirWhereToCreate() + "\n");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * changes current dir
     */
    private static void changeCurrentDir() {
        DirManageClass.setDirectories();
    }

    /**
     * displays project base menu, uses switch function to direct the user based
     * on their choice
     *
     * @throws IOException
     */
    private static void projectBaseMenu() throws IOException {
        int choiceDirMenu;
        boolean end = false;
        do {
            System.out.println(projectBaseMenuText());
            choiceDirMenu = sc.nextInt();
            switch (choiceDirMenu) {
                case 1 ->
                    simulationMatchMenu();
                case 2 ->
                    infoAboutEverythingMenu();
                case 3 ->
                    leaderBoardsOfEverythingMenu();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides the base menu text
     *
     * @return base menu text
     */
    private static String projectBaseMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Simulace zápasu").append("\n").append("▶ 2. Zobrazit informace, statistiky hráčů, týmů nebo soutěží").append("\n").append("▶ 3. Zobrazit žebříčky").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * provides the simulation base menu text of all the options, uses string
     * builder
     *
     * @return base menu text of all the options
     */
    private static String simulationBaseMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, jakým způsobem si chcete zobrazit výsledky simulovaného zápasu.").append("\n");
        builder.append("Mimo jiné zde máte i možnost kontrolního výpisu libovolného binárního souboru, který byl programem vytvořen.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Zobrazit výsledky na konzoli").append("\n").append("▶ 2. Zapsat výsledky do souboru (+ možnost kontrolního výpisu binárního souboru)").append("\n").append("▶ 3. Zaslat automatický email s výsledky").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the complete simulation match menu, uses switch function to
     * direct the user based on their choice
     *
     * @throws IOException
     */
    private static void simulationMatchMenu() throws IOException {
        int choiceSimulationMenu;
        boolean end = false;
        do {
            System.out.println(simulationBaseMenuText());
            choiceSimulationMenu = sc.nextInt();
            switch (choiceSimulationMenu) {
                case 1 ->
                    consoleOptionForSimulation();
                case 2 ->
                    simulationFilesChoiceMenu();
                case 3 ->
                    emailOptionForSimulation();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides a string of the console option for simulation of a match, uses
     * string builder
     *
     * @returna string of the console option for simulation of a match
     * @throws IOException
     */
    private static String consoleOptionForSimulationText() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               SIMULACE TEORETICKÉHO ZÁPASU - ZÁPIS NA KONZOLI                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Kdo bude vítěž, kdo bude poražený? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Obě jména musí být přesně v tomto formátu (včetně mezery a diakritiky): PŘÍJMENÍ JMÉNO").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the names of the players for the simulation of the
     * match
     *
     * @throws IOException
     */
    private static void consoleOptionForSimulation() throws IOException {
        System.out.println(consoleOptionForSimulationText());
        System.out.println("Zadejte příjmení a jméno vítěze zápasu:");
        sc.nextLine();
        String winnerName = sc.nextLine();
        System.out.println("Zadejte příjmení a jméno poraženého hráče:");
        String looserName = sc.nextLine();
        System.out.println(CheckerClassForAllMethods.checkConvertStatsAfterMatchToString(winnerName, looserName, DirManageClass.getDirSTR()) + "\n" + "\n");
    }

    /**
     * provides the string that shows the user the choice of the options for
     * choosing of how he wants to look at the match results, uses string
     * builder
     *
     * @return
     */
    private static String simulationBaseTextFilesMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, v jakém souboru si chcete uložit výsledky zápasu.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Uložit do textového souboru").append("\n").append("▶ 2. Uložit do binárního souboru").append("\n").append("▶ 3. Kontrolní výpis binárního souboru").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays simulation files choice menu, uses switch function to direct the
     * user based on their choice
     *
     * @throws IOException
     */
    private static void simulationFilesChoiceMenu() throws IOException {
        int choiceFilesSimulationMenu;
        boolean end = false;
        do {
            System.out.println(simulationBaseTextFilesMenuText());
            choiceFilesSimulationMenu = sc.nextInt();
            switch (choiceFilesSimulationMenu) {
                case 1 ->
                    textFileOptionForSimulation();
                case 2 ->
                    binaryFileOptionForSimulation();
                case 3 ->
                    controlBinaryFileDisplay();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides the string of the simulation of the match between the two
     * players, uses string builder
     *
     * @return
     * @throws IOException
     */
    private static String textFileOptionForSimulationText() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                               SIMULACE TEORETICKÉHO ZÁPASU - ZÁPIS DO TEXTOVÉHO SOUBORU                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Kdo bude vítěž, kdo bude poražený? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Obě jména musí být přesně v tomto formátu (včetně mezery a diakritiky): PŘÍJMENÍ JMÉNO").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the names of the players before the match and the
     * name of the text file
     *
     * @throws IOException
     */
    private static void textFileOptionForSimulation() throws IOException {
        System.out.println(textFileOptionForSimulationText());
        System.out.println("Zadejte příjmení a jméno vítěze zápasu:");
        sc.nextLine();
        String winnerName = sc.nextLine();
        System.out.println("Zadejte příjmení a jméno poraženého hráče:");
        String looserName = sc.nextLine();
        System.out.println("Zadejte název textového souboru, který bude vytvořen:");
        String nameOfFile = sc.nextLine();
        System.out.println("\n" + "Pro připomenutí, soubor bude uložen na tomto adresáři s názvem:" + nameOfFile + ".txt");
        System.out.println("➜ " + DirManageClass.getDirWhereToCreate() + "\n");
        System.out.println("➜ Soubor se úspěšně vytvořil." + "\n");
        FileUtility.writeInfoAfterMatchIntoFile(winnerName, looserName, DirManageClass.getDirSTR(), DirManageClass.getDirWhereToCreate(), nameOfFile);
    }

    /**
     * provides the string representation of the binary file option for
     * simulation, uses string builder
     *
     * @return string of the option
     * @throws IOException
     */
    private static String binaryFileOptionForSimulationText() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                               SIMULACE TEORETICKÉHO ZÁPASU - ZÁPIS DO BINÁRNÍHO SOUBORU                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Kdo bude vítěž, kdo bude poražený? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Obě jména musí být přesně v tomto formátu (včetně mezery a diakritiky): PŘÍJMENÍ JMÉNO").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the names of the players before the match and the
     * name of the binary file
     *
     * @return
     * @throws IOException
     */
    private static void binaryFileOptionForSimulation() throws IOException {
        System.out.println(binaryFileOptionForSimulationText());
        System.out.println("Zadejte příjmení a jméno vítěze zápasu:");
        sc.nextLine();
        String winnerName = sc.nextLine();
        System.out.println("Zadejte příjmení a jméno poraženého hráče:");
        String looserName = sc.nextLine();
        System.out.println("Zadejte název binárního souboru, který bude vytvořen:");
        String nameOfFile = sc.nextLine();
        System.out.println("Pro připomenutí, soubor bude uložen na tomto adresáři s názvem:" + nameOfFile + ".bin");
        System.out.println("➜ " + DirManageClass.getDirWhereToCreate() + "\n");
        System.out.println("➜ Soubor se úspěšně vytvořil." + "\n");
        FileUtility.writeInfoAfterMatchIntoBinaryFile(winnerName, looserName, DirManageClass.getDirSTR(), DirManageClass.getDirWhereToCreate(), nameOfFile);
    }

    /**
     * provides the string representation of the binary file displaying in
     * readeble format option, uses string builder
     *
     * @return string of the option
     * @throws IOException
     */
    private static String controlMethodBinaryText() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               KONTROLNÍ VÝPIS BINÁRNÍHO SOUBORU                         ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Který binární soubor si chcete vypsat na konzoli? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Název binárního souboru musí být přesně v tomto formátu (bez koncovky!): NÁZEV SOUBORU ").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the name of the binary file that he wants to
     * display
     *
     * @throws IOException
     */
    private static void controlBinaryFileDisplay() throws IOException {
        System.out.println(controlMethodBinaryText());
        System.out.println("Zadejte název binárního souboru, který je uložen v standartním adresáři tj. kde jsou vytvářeny soubory programem:");
        sc.nextLine();
        String nameOfFile = sc.nextLine();
        System.out.println(CheckerClassForAllMethods.checkControlMethodForBinaryFile(DirManageClass.getDirWhereToCreate(), nameOfFile));
    }

    /**
     * provides the string representation before an email about the match is
     * sent, uses string builder
     *
     * @return string with the menu used in the email sending
     * @throws IOException
     */
    private static String emailOptionForSimulationText() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               SIMULACE TEORETICKÉHO ZÁPASU - ZÁPIS NA EMAIL                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Kdo bude vítěž, kdo bude poražený? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Obě jména musí být přesně v tomto formátu (včetně mezery a diakritiky): PŘÍJMENÍ JMÉNO").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the name of the winner, looser, the name of the
     * attachment and the email that the analysis should be sent to
     *
     * @throws IOException
     */
    private static void emailOptionForSimulation() throws IOException {
        System.out.println(emailOptionForSimulationText());
        System.out.println("Zadejte příjmení a jméno vítěze zápasu:");
        sc.nextLine();
        String winnerName = sc.nextLine();
        System.out.println("Zadejte příjmení a jméno poraženého hráče:");
        String looserName = sc.nextLine();
        System.out.println("Zadejte název souboru, který bude poslán v příloze emailu:");
        String nameOfFile = sc.nextLine();
        System.out.println("Zadejte svůj email:");
        String email = sc.nextLine();
        CheckerClassForAllMethods.checkSendingCompleteEmailAndCreateFile(winnerName, looserName, DirManageClass.getDirSTR(), DirManageClass.getDirWhereToCreate(), nameOfFile, email);
    }

    /**
     * displays info about everything menu, uses switch function to direct the
     * user based on their choice
     *
     * @throws IOException
     */
    private static void infoAboutEverythingMenu() throws IOException {
        int choiceDirMenu;
        boolean end = false;
        do {
            System.out.println(infoDisplayBaseMenuText());
            choiceDirMenu = sc.nextInt();
            switch (choiceDirMenu) {
                case 1 ->
                    teamDisplayInfo();
                case 2 ->
                    playerDisplayInfoChoiceMenu();
                case 3 ->
                    leagueDisplayInfoChoiceMenu();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides the string representation of the info display menu, uses string
     * builder
     *
     * @return string of the info display menu
     */
    private static String infoDisplayBaseMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, jaké informace si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Zobrazit informace konkrétního týmu").append("\n").append("▶ 2. Zobrazit informace konkrétního hráče").append("\n").append("▶ 3. Zobrazit informace soutěží").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * provides the string representation of the team display info beggining,
     * uses string builder
     *
     * @return string of the team display info
     * @throws IOException
     */
    private static String teamDisplayInfoText() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               ZOBRAZENÍ KOMPLETNÍ STATISTIKY KONKRÉTNÍHO TÝMU                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Informace kterého týmu si chcete zobrazit? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Jméno týmu musí být přesně v tomto formátu (včetně mezer a diakritiky): JMÉNO KLUBU ").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the name of the team that he wants to search in
     * the source files
     *
     * @throws IOException
     */
    private static void teamDisplayInfo() throws IOException {
        System.out.println(teamDisplayInfoText());
        System.out.println("Zadejte název týmu:");
        sc.nextLine();
        String nameOfTeam = sc.nextLine();
        System.out.println(CheckerClassForAllMethods.checkTeamInfoByName(nameOfTeam, DirManageClass.getDirTeams()));
    }

    /**
     * provides the string representation of the player base display menu, uses
     * string builder
     *
     * @return string of the player base display menu
     */
    private static String playerBaseDisplayMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, jak chcete vyhledat konkrétního hráče, jehož statistiky si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Podle jména").append("\n").append("▶ 2. Podle ID").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the player display info choice menu, uses switch function to
     * direct the user based on their choice
     *
     * @throws IOException
     */
    private static void playerDisplayInfoChoiceMenu() throws IOException {
        int playerChoiceMenu;
        boolean end = false;
        do {
            System.out.println(playerBaseDisplayMenuText());
            playerChoiceMenu = sc.nextInt();
            switch (playerChoiceMenu) {
                case 1 ->
                    playerOptionByName();
                case 2 ->
                    playerOptionByID();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides the string representation of the player display info by name,
     * uses string builder
     *
     * @return string of the player display info by name
     * @throws IOException
     */
    private static String playerDisplayInfoByName() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               ZOBRAZENÍ KOMPLETNÍ STATISTIKY KONKRÉTNÍHO HRÁČE                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Informace kterého hráče si chcete zobrazit? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("Jméno hráče musí být přesně v tomto formátu (včetně mezer a diakritiky): PŘÍJMENÍ JMÉNO ").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the name and surname of the player he wants to
     * seatch within the source data
     *
     * @throws IOException
     */
    private static void playerOptionByName() throws IOException {
        System.out.println(playerDisplayInfoByName());
        System.out.println("Zadejte příjmení a jméno hráče, jehož statistiky si chcete zobrazit:");
        sc.nextLine();
        String playerName = sc.nextLine();
        System.out.println(CheckerClassForAllMethods.checkPlayerInfoByName(playerName, DirManageClass.getDirSTR()));
    }

    /**
     * provides the string representation of the player display info by ID, uses
     * string builder
     *
     * @return string of the player display info by ID
     * @throws IOException
     */
    private static String playerDisplayInfoByID() throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("                                               ZOBRAZENÍ KOMPLETNÍ STATISTIKY KONKRÉTNÍHO HRÁČE                          ");
        builder.append("\n").append("                 ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
        builder.append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        builder.append("                                                Informace kterého hráče si chcete zobrazit? ");
        builder.append("\n").append("--------------------------------------------------------------------------------------------------------------------------------------").append("\n");
        return builder.toString();
    }

    /**
     * asks the user to enter the ID of the player that he wants to search
     * within the source data
     *
     * @throws IOException
     */
    private static void playerOptionByID() throws IOException {
        System.out.println(playerDisplayInfoByID());
        System.out.println("Zadejte ID hráče:");
        sc.nextLine();
        long playerID = sc.nextLong();
        System.out.println(CheckerClassForAllMethods.checkPlayerInfoByID(playerID, DirManageClass.getDirSTR()));
    }

    /**
     * provides the string representation of the league display menu, uses
     * string builder
     *
     * @return string of the league display menu
     */
    private static String leagueDisplayMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, kterou informaci si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Soutěž jednotlivců").append("\n").append("▶ 2. Soutěž týmů").append("\n").append("▶ 3. Časové informace tabulky jednotlivců").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the league display info choice menu, uses switch function to
     * direct the user based on their choice
     *
     * @throws IOException
     */
    private static void leagueDisplayInfoChoiceMenu() throws IOException {
        int leagueChoiceMenu;
        boolean end = false;
        do {
            System.out.println(leagueDisplayMenuText());
            leagueChoiceMenu = sc.nextInt();
            switch (leagueChoiceMenu) {
                case 1 ->
                    leagueNamePlayers();
                case 2 ->
                    leagueNameTeams();
                case 3 ->
                    leagueDisplayTimeInfoChoiceMenu();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the name of the league that the players are playing in
     *
     * @throws IOException
     */
    private static void leagueNamePlayers() throws IOException {
        String nameLeaguePlayer = CheckerClassForAllMethods.checkNameOfLeagueLeaderBoardForSTR(DirManageClass.getDirSTR());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                    Název soutěže jednotlivců: " + "\n" + nameLeaguePlayer);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * displays the name of the league that the teams are playing in
     *
     * @throws IOException
     */
    private static void leagueNameTeams() throws IOException {
        String nameLeagueTeam = CheckerClassForAllMethods.checkNameOfLeagueLeaderBoardTeams(DirManageClass.getDirTeams());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("                    Název soutěže týmů: " + "\n" + nameLeagueTeam);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * provides the string representation of the league time menu, uses string
     * builder
     *
     * @return string of the league time menu
     */
    private static String leagueTimeMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, kterou informaci o čase si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Čas vytvoření zdrojového souboru s tabulkou jednotlivců").append("\n").append("▶ 2. Kolik uběhlo času od vytvoření zdrojového souboru s tabulkou jednotlivců").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the league display time info choice menu, uses switch function
     * to direct the user based on their choice
     *
     * @throws IOException
     */
    private static void leagueDisplayTimeInfoChoiceMenu() throws IOException {
        int timeChoiceMenu;
        boolean end = false;
        do {
            System.out.println(leagueTimeMenuText());
            timeChoiceMenu = sc.nextInt();
            switch (timeChoiceMenu) {
                case 1 ->
                    timeWhenCreated();
                case 2 ->
                    timeSinceCreation();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the time when the source file with the leader board with the
     * individual players was created
     *
     * @throws IOException
     */
    private static void timeWhenCreated() throws IOException {
        try {
            String time = FileUtility.getTimeOfCreationOfLeaderBoardSTR(DirManageClass.getDirSTR());
            if (!time.matches("")) {
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("               Zdrojový soubor s tabulkou jednotlivců byl stažen z oficiální stránky STIS v tento čas: " + time);
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("");
        }
    }

    /**
     * displays the time since the source file with the leader board with the
     * individual players was created
     *
     * @throws IOException
     */
    private static void timeSinceCreation() throws IOException {
        try {
            if (CheckerClassForAllMethods.checkTimeSinceCreationOfLeaderBoardSTR(DirManageClass.getDirSTR()) != null) {
                long[] helperArray = CheckerClassForAllMethods.checkTimeSinceCreationOfLeaderBoardSTR(DirManageClass.getDirSTR());

                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("               Zdrojový soubor s daty jednotlivců je " + helperArray[0] + " dní " + helperArray[1] + " hodin " + helperArray[2] + " minut a " + helperArray[3] + " sekund starý.");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

            } else {
                throw new IOException();
            }
        } catch (IOException e) {
        }
    }

    /**
     * provides the string representation of the leader board menu, uses string
     * builder
     *
     * @return string of the leader board menu
     */
    private static String leaderBoardMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříčky týmů").append("\n").append("▶ 2. Žebříčky jednotlivců").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the leader boards of everything menu, uses switch function to
     * direct the user based on their choice
     */
    private static void leaderBoardsOfEverythingMenu() {
        int choiceDirMenu;
        boolean end = false;
        do {
            System.out.println(leaderBoardMenuText());
            choiceDirMenu = sc.nextInt();
            switch (choiceDirMenu) {
                case 1 ->
                    teamLeaderBoards();
                case 2 ->
                    playerLeaderBoards();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides the string representation of the team leader board menu, uses
     * string builder
     *
     * @return string of the team leader board menu
     */
    private static String teamLeaderBoardMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček pro týmy si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříčky týmů seřažených podle úspěšnosti").append("\n").append("▶ 2. Žebříčky týmů seřazených podle bodů").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the team leader boards menu, uses switch function to direct the
     * user based on their choice
     */
    private static void teamLeaderBoards() {
        int choiceTeamLeaderBoardMenu;
        boolean end = false;
        do {
            System.out.println(teamLeaderBoardMenuText());
            choiceTeamLeaderBoardMenu = sc.nextInt();
            switch (choiceTeamLeaderBoardMenu) {
                case 1 ->
                    teamLeaderBoardsBySuccessRate();
                case 2 ->
                    teamLeaderBoardsByPoints();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the team leader board sorted by success rate
     */
    private static void teamLeaderBoardsBySuccessRate() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(CheckerClassForAllMethods.checkSortTeamsBySuccessRate(DirManageClass.getDirTeams()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * displays the team leader board sorted by points
     */
    private static void teamLeaderBoardsByPoints() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(CheckerClassForAllMethods.checkSortTeamsByPoints(DirManageClass.getDirTeams()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * provides the string representation of the player leader board menu, uses
     * string builder
     *
     * @return string of the player leader board menu
     */
    private static String playerLeaderBoardMenuText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček pro hráče si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříčky hráčů seřažených podle bodů (STR)").append("\n").append("▶ 2. Žebříčky hráčů seřažených podle příjmení a jména").append("\n");
        builder.append("▶ 3. Žebříčky hráčů seřažených podle věku").append("\n").append("▶ 4. Žebříčky hráčů seřažených podle úspěšnosti").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the player leader board menu, uses switch function to direct the
     * user based on their choice
     */
    private static void playerLeaderBoards() {
        int choicePlayerLeaderBoardMenu;
        boolean end = false;
        do {
            System.out.println(playerLeaderBoardMenuText());
            choicePlayerLeaderBoardMenu = sc.nextInt();
            switch (choicePlayerLeaderBoardMenu) {
                case 1 ->
                    playerLeaderBoardBySTR();
                case 2 ->
                    playerLeaderBoardByName();
                case 3 ->
                    playerLeaderBoardByAge();
                case 4 ->
                    playerLeaderBoardBySuccessRate();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * provides the string representation of the player leader board by STR,
     * uses string builder
     *
     * @return string of the player leader board by STR
     */
    private static String playerLeaderBoardBySTRText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček pro hráče seřazených podle bodů si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříček hráčů seřažených podle bodů (STR) od největšího STR").append("\n").append("▶ 2. Žebříček hráčů seřažených podle bodů (STR) od nejmenšího STR").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displasy the leader board by STR menu, uses switch function to direct the
     * user based on their choice
     */
    private static void playerLeaderBoardBySTR() {
        int choicePlayerLeaderBoardMenuBySTR;
        boolean end = false;
        do {
            System.out.println(playerLeaderBoardBySTRText());
            choicePlayerLeaderBoardMenuBySTR = sc.nextInt();
            switch (choicePlayerLeaderBoardMenuBySTR) {
                case 1 ->
                    playerLeaderBoardBySTRFromHighest();
                case 2 ->
                    playerLeaderBoardBySTRFromLowest();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the sorted player leader board by STR from the highest
     */
    private static void playerLeaderBoardBySTRFromHighest() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersBySTR(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * displays the sorted player leader board by STR from the lowest
     */
    private static void playerLeaderBoardBySTRFromLowest() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersBySTRReverse(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * provides the string representation of the player leader board by name,
     * uses string builder
     *
     * @return string of the player leader board by name
     */
    private static String playerLeaderBoardByNameText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček pro hráče seřazených podle jména si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříček hráčů seřažených podle příjmení od A").append("\n").append("▶ 2. Žebříček hráčů seřažených podle příjmení od Z").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the player leader board by name menu, uses switch function to
     * direct the user based on their choice
     */
    private static void playerLeaderBoardByName() {
        int choicePlayerLeaderBoardMenuByName;
        boolean end = false;
        do {
            System.out.println(playerLeaderBoardByNameText());
            choicePlayerLeaderBoardMenuByName = sc.nextInt();
            switch (choicePlayerLeaderBoardMenuByName) {
                case 1 ->
                    playerLeaderBoardByNameFromA();
                case 2 ->
                    playerLeaderBoardByNameFromZ();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the sorted player leader board by name from A
     */
    private static void playerLeaderBoardByNameFromA() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersByName(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * displays the sorted player leader board by name from Z
     */
    private static void playerLeaderBoardByNameFromZ() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersByNameReverse(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * provides the string representation of the player leader board by age,
     * uses string builder
     *
     * @return string of the player leader board by age
     */
    private static String playerLeaderBoardByAgeText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček pro hráče seřazených podle věku si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříček hráčů seřažených podle věku od nejstaršího").append("\n").append("▶ 2. Žebříček hráčů seřažených podle věku od nejmladšího").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the player leader board by age menu, uses switch function to
     * direct the user based on their choice
     */
    private static void playerLeaderBoardByAge() {
        int choicePlayerLeaderBoardMenuByAge;
        boolean end = false;
        do {
            System.out.println(playerLeaderBoardByAgeText());
            choicePlayerLeaderBoardMenuByAge = sc.nextInt();
            switch (choicePlayerLeaderBoardMenuByAge) {
                case 1 ->
                    playerLeaderBoardByAgeFromOldest();
                case 2 ->
                    playerLeaderBoardByAgeFromYoungest();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the sorted player leader board by age from the oldest
     */
    private static void playerLeaderBoardByAgeFromOldest() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersByAgeFromOldest(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * displays the sorted player leader board by age from the youngest
     */
    private static void playerLeaderBoardByAgeFromYoungest() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        System.out.println(CheckerClassForAllMethods.checkSortPlayerByAgeFromYoungest(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * provides the string representation of the player leader board by success
     * rate, uses string builder
     */
    private static String playerLeaderBoardBySuccessRateText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n").append("\n").append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("Zde si můžete zvolit, který žebříček pro hráče seřazených podle věku si chcete zobrazit.").append("\n");
        builder.append("Zvolte jednu z následujících možností, odpovídající číslo napište do určité oblasti níže:").append("\n");
        builder.append("--------------------------------------------------------------------------------------------").append("\n");
        builder.append("▶ 1. Žebříček hráčů seřažených podle věku od nejstaršího").append("\n").append("▶ 2. Žebříček hráčů seřažených podle věku od nejmladšího").append("\n");
        builder.append("▶ 0. Vrátit se zpět ").append("\n").append("--------------------------------------------------------------------------------------------").append("\n").append("Vaši volbu napište níže ⬇⬇⬇:");
        return builder.toString();
    }

    /**
     * displays the leader board by success rate menu, uses switch function to
     * direct the user based on their choice
     */
    private static void playerLeaderBoardBySuccessRate() {
        int choicePlayerLeaderBoardMenuByAge;
        boolean end = false;
        do {
            System.out.println(playerLeaderBoardBySuccessRateText());
            choicePlayerLeaderBoardMenuByAge = sc.nextInt();
            switch (choicePlayerLeaderBoardMenuByAge) {
                case 1 ->
                    playerLeaderBoardBySuccessRateFromHighest();
                case 2 ->
                    playerLeaderBoardBySuccessRateFromLowest();
                case 0 ->
                    end = true;
                default ->
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n"
                            + "          ✗ Neplatná volba, neboť jste stiskli jinou klávesu než jste měli. Zkuste to znovu! ✗" + "\n"
                            + "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
            }
        } while (!end);
    }

    /**
     * displays the sorted player leader board by success rate from the highest
     */
    private static void playerLeaderBoardBySuccessRateFromHighest() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersBySuccessRate(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }

    /**
     * displays the sorted player leader board by success rate from the lowest
     */
    private static void playerLeaderBoardBySuccessRateFromLowest() {
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + "\n");
        System.out.println(CheckerClassForAllMethods.checkSortPlayersBySuccessRateReverse(DirManageClass.getDirSTR()));
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
