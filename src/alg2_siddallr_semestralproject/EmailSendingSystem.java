package alg2_siddallr_semestralproject;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.mail.*;
import javax.mail.internet.*;

/**
 * this class is used to send automatic emails about the results of the match a
 * external library has been in this class: javax.mail.jar
 *
 * @author Ronald Ch. Siddall
 */
public class EmailSendingSystem {

    /**
     * this method is a short test that uses regex to quick check if a email is
     * valid (it cannot check if the email is active)
     *
     * @param recipientEmail - an email to be checked
     * @return boolean value if the email is valid - true for an valid email,
     * false otherwise
     */
    public static boolean isRecipientEmailValidQuickTest(String recipientEmail) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        if (recipientEmail == null) {
            return false;
        }
        return pattern.matcher(recipientEmail).matches();
    }

    /**
     * this method implements a string builder that is used to make a "nice"
     * text representation of the analysis of the match between two specific
     * players that is later sent via email
     *
     * @param winnerName - name of the winner
     * @param looserName - name of the looser
     * @param pathToFile - path to the source file, where the information about
     * the players are stored
     * @return a String representing the results of the match
     * @throws IOException
     */
    public static String convertStatsAfterMatchToString(String winnerName, String looserName, String pathToFile) throws IOException {
        long[] timeSinceCreationOfData = CheckerClassForAllMethods.checkTimeSinceCreationOfLeaderBoardSTR(pathToFile);
        int[] tempAfterMatchSTR = Player.computeWinnerAndLooserSTRAfterMatch(winnerName, looserName, pathToFile);
        double[] tempAfterMatchSTRstabil = Player.computeWinnerAndLooserSTRstabilAfterMatch(winnerName, looserName, pathToFile);
        String timeOfCreationOfUsedData = FileUtility.getTimeOfCreationOfLeaderBoardSTR(pathToFile);
        if (CheckerClassForAllMethods.checkStatsForMatchStatistics(winnerName, looserName, pathToFile)) {
            String winnerSTRbefore = Integer.toString(Player.checkedWinnerSTRBeforeMatch(winnerName, pathToFile));
            String looserSTRbefore = Integer.toString(Player.checkedLooserSTRBeforeMatch(looserName, pathToFile));
            String winnerSTRstabilBefore = Double.toString(Player.checkedWinnerSTRstabilBeforeMatch(winnerName, pathToFile));
            String looserSTRstabilBefore = Double.toString(Player.checkedLooserSTRstabilBeforeMatch(looserName, pathToFile));
            String winnerSTRafter = Integer.toString(tempAfterMatchSTR[0]);
            String looserSTRafter = Integer.toString(tempAfterMatchSTR[1]);
            String winnerSTRstabilAfter = Double.toString(tempAfterMatchSTRstabil[0]);
            String looserSTRstabilAfter = Double.toString(tempAfterMatchSTRstabil[1]);

            StringBuilder builder = new StringBuilder();
            builder.append("\n");
            builder.append("Data použitá k simulaci zápasu byla stažena z oficiální stránky STIS v tento čas: ").append(timeOfCreationOfUsedData).append(".").append("\n");
            builder.append("Takže data jsou ").append(timeSinceCreationOfData[0]).append(" dní ").append(timeSinceCreationOfData[1]).append(" hodin ");
            builder.append(timeSinceCreationOfData[2]).append(" minut a ").append(timeSinceCreationOfData[3]).append(" sekund stará.").append("\n").append("\n");
            builder.append("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
            builder.append("Toto je kompletní statistický rozbor teoretického zápasu mezi těmito hráči: ").append("\n");
            builder.append(winnerName).append(" VS ").append(looserName).append("\n");
            builder.append("----------------------------------------------------------------------------------------------------------------------------").append("\n");
            builder.append("Vítěz: ").append(winnerName).append("\n");
            builder.append("Poražený: ").append(looserName).append("\n");
            builder.append("----------------------------------------------------------------------------------------------------------------------------").append("\n");
            builder.append("Statistika o hráčích před odehraním zápasu: ").append("\n").append("  ").append(winnerName);
            builder.append(" STR: ").append(winnerSTRbefore).append(", STRstabil: ").append(winnerSTRstabilBefore).append("\n");
            builder.append("  ").append(looserName).append(" STR: ").append(looserSTRbefore).append(", STRstabil: ").append(looserSTRstabilBefore).append("\n");
            builder.append("----------------------------------------------------------------------------------------------------------------------------").append("\n");
            builder.append("Statistika o hráčích po odehraní zápasu: ").append("\n").append("  ").append(winnerName);
            builder.append(" STR: ").append(winnerSTRafter).append(", STRstabil: ").append(winnerSTRstabilAfter).append("\n");
            builder.append("  ").append(looserName).append(" STR: ").append(looserSTRafter).append(", STRstabil: ").append(looserSTRstabilAfter).append("\n");
            builder.append("----------------------------------------------------------------------------------------------------------------------------").append("\n");
            builder.append("Mějte prosím na paměti, že se jedná o model, který určuje změnu hodnocení STR a STRstabil na základě matematických modelů. ").append("\n");
            builder.append("Je proto možné, že skutečné výsledky po odehraní reálného zápasu mezi těmito hráči se mohou trochu lišit. Děkujeme.").append("\n");
            builder.append("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔");
            return builder.toString();
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("\n").append("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔").append("\n");
            builder.append("Nastala chyba při zpracování údajů hráčů.").append("\n").append("\n");
            builder.append("Někdo z hráčů (případně oba) nebyli nalezeni v tabulce: ").append("\n").append("   '").append(winnerName).append("' nebo '").append(looserName).append("'").append("\n").append("\n");
            builder.append("Ujistěte se prosím, že oba hráči přesně s těmito jmény existují v tabulce a zkuste to znovu.").append("\n");
            builder.append("▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔");
            return builder.toString();
        }
    }

    /**
     * this method sends an email that has non problematic source data - both
     * players exist and the email is valid
     *
     * @param recipientEmail - email of recipient
     * @param winnerName - name of winner
     * @param looserName - name of looser
     * @param attachmentPath - the path of where the attachment of the email
     * will be created
     * @param nameOfFile - name of the attachment of the email
     */
    public static void sendNonProblematicEmailWithAttachment(String recipientEmail, String winnerName, String looserName, String attachmentPath, String nameOfFile) {
        String senderEmail = "vygenerovane.vysledky.zapasu@seznam.cz";
        String senderPassword = "MtU8Q!pV2..Ng8t";
        String subjectOfEmail = "Výsledky simulovaného zápasu: " + winnerName + " VS " + looserName + "!";
        String textInsideEmail = "Toto je automaticky vygenerovaný email, na tuto zprávu neodpovídejte!"
                + "\n" + "\n" + "V příloze tohoto emailu je textový soubor s názvem: " + nameOfFile + ".txt" + "\n" + "\n"
                + "Tam je zobrazeno kompletní statistické zhodnocení zápasu."
                + "\n" + "\n" + "\n" + "Pokud jste tento email neočekávali, tak ho prosím ignorujte.";

        if (isRecipientEmailValidQuickTest(recipientEmail)) {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.seznam.cz");
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.ssl.enable", "true");

            // Authenticate sender's email address and password
            Authenticator authenticator = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, senderPassword);
                }
            };

            // Create a session with the SMTP server
            Session session = Session.getInstance(properties, authenticator);

            try {
                // Create a message object
                Message message = new MimeMessage(session);

                // Set the sender's email address
                message.setFrom(new InternetAddress(senderEmail));

                // Set the recipient's email address
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

                // Set the email subject
                message.setSubject(subjectOfEmail);

                // Create the message body part for the text
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(textInsideEmail);

                // Create the message body part for the attachment
                MimeBodyPart attachmentPart = new MimeBodyPart();
                attachmentPart.attachFile(attachmentPath);

                // Create a multipart message and add the message body parts to it
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                multipart.addBodyPart(attachmentPart);

                // Set the content of the message to the multipart message
                message.setContent(multipart);

                // Send the message
                Transport.send(message);
                System.out.println("\n" + "➜ Email byl poslán úspěšně. Měli byste ho obdržet během několika vteřin.");
            } catch (MessagingException | IOException e) {
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("\n" + "Při odesílání emailu došlo k chybě");
                System.out.println("Zkontrolujte,že emailová adresa '" + recipientEmail + "', kam chcete zprávu poslat, existuje." + "\n");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            }
        } else {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("\n" + "Při odesílání emailu došlo k chybě");
            System.out.println("Zkontrolujte,že emailová adresa '" + recipientEmail + "', kam chcete zprávu poslat, existuje." + "\n");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }

    /**
     * this method sends an email that has problematic source data
     *
     * @param recipientEmail - email of recipient
     * @param winnerName - name of winner
     * @param looserName - name of looser
     * @param attachmentPath - the path of where the attachment of the email
     * will be created
     * @param nameOfAttachment - name of the attachment of the email
     */
    public static void sendEmailWithAttachmentAboutProblem(String recipientEmail, String winnerName, String looserName, String attachmentPath, String nameOfAttachment) {
        String senderEmail = "vygenerovane.vysledky.zapasu@seznam.cz";
        String senderPassword = "MtU8Q!pV2..Ng8t";
        String subjectOfEmail = "Došlo k chybě při zpracování zápasu: " + winnerName + " VS " + looserName + ".";
        String textInsideEmail = "Toto je automaticky vygenerovaný email, na tuto zprávu neodpovídejte!"
                + "\n" + "\n" + "V příloze tohoto emailu je textový soubor s názvem: " + nameOfAttachment + ".txt" + "\n" + "\n "
                + "Tam je zobrazena chybová zpráva, která vznikla při generování simulace tohoto zápasu."
                + "\n" + "\n" + "\n" + "Pokud jste tento email neočekávali, tak ho prosím ignorujte.";

        if (isRecipientEmailValidQuickTest(recipientEmail)) {
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.seznam.cz");
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.ssl.enable", "true");

            // Authenticate sender's email address and password
            Authenticator authenticator = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, senderPassword);
                }
            };

            // Create a session with the SMTP server
            Session session = Session.getInstance(properties, authenticator);

            try {
                // Create a message object
                Message message = new MimeMessage(session);

                // Set the sender's email address
                message.setFrom(new InternetAddress(senderEmail));

                // Set the recipient's email address
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

                // Set the email subject
                message.setSubject(subjectOfEmail);

                // Create the message body part for the text
                BodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setText(textInsideEmail);

                // Create the message body part for the attachment
                MimeBodyPart attachmentPart = new MimeBodyPart();
                attachmentPart.attachFile(attachmentPath);

                // Create a multipart message and add the message body parts to it
                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart);
                multipart.addBodyPart(attachmentPart);

                // Set the content of the message to the multipart message
                message.setContent(multipart);

                // Send the message
                Transport.send(message);

                System.out.println("\n" + "➜ Email byl poslán úspěšně. Měli byste ho obdržet během několika vteřin.");

            } catch (MessagingException | IOException e) {
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("\n" + "Při odesílání emailu došlo k chybě");
                System.out.println("Zkontrolujte,že emailová adresa '" + recipientEmail + "', kam chcete zprávu poslat, existuje.");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            }
        } else {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("\n" + "Při odesílání emailu došlo k chybě");
            System.out.println("Zkontrolujte,že emailová adresa '" + recipientEmail + "', kam chcete zprávu poslat, existuje.");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        }
    }
}
