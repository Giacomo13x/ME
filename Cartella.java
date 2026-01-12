import java.util.HashSet;
import java.util.Set;

public class Cartella {
    private Set<Integer> numeri;
    private static final int NUMERI_CARTELLA = 15;

    public Cartella() {
        numeri = new HashSet<>();
        while (numeri.size() < NUMERI_CARTELLA) {
            numeri.add((int) (Math.random() * 90) + 1);  // Genera numeri casuali da 1 a 90
        }
    }

    public Set<Integer> getNumeri() {
        return numeri;
    }

    public boolean contieneNumero(int numero) {
        return numeri.contains(numero);
    }

    public static double getCosto() {
        return 1.0;  // Costo fisso per ogni cartella
    }
}
