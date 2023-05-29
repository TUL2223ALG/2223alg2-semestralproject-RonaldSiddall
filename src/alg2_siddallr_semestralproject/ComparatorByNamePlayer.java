package alg2_siddallr_semestralproject;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 * this class implements the comparator that sorts the players by their name it
 * also uses the collator, so that it works with czech names
 *
 * @author Ronald Ch. Siddall
 */
public class ComparatorByNamePlayer implements Comparator<Player> {

    private Collator collator = Collator.getInstance(new Locale("cs", "CZ"));

    /**
     * Compares two 'Player' objects based on their names in czech
     *
     * @param p1 The first Player
     * @param p2 The second Player
     * @return a negative integer if player p1´s name is sooner than p2´s name,
     * a positive integer if player p1´s name is after p2´s name, or 0 if both
     * players have the same name.
     */
    @Override
    public int compare(Player p1, Player p2) {
        return collator.compare(p1.getNameOfPlayer(), p2.getNameOfPlayer());
    }
}
