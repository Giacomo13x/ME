import java.util.ArrayList;
import java.util.Collections;

public class Tombola {
    private ArrayList<Integer> numeri;

    public Tombola() {
        numeri = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {
            numeri.add(i);
        }
        Collections.shuffle(numeri);  // Mischia i numeri
    }

    public int estraiNumero() {
        if (numeri.size() > 0) {
            return numeri.remove(0);  // Estrae e rimuove il primo numero
        }
        return -1;  // Se non ci sono più numeri da estrarre
    }
}
