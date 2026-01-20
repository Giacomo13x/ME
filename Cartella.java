import java.util.HashSet;
import java.util.Set;

public class Cartella {
    private Set<Integer> numeri;
    private static final int NUMERI_CARTELLA = 15;

    //costruttore che crea un hashset vuoto
    public Cartella() {
        numeri = new HashSet<>();
        while (numeri.size() < NUMERI_CARTELLA) {
            numeri.add((int) (Math.random() * 90) + 1);  
        }
    }

    //metodo getter che restituisce l'insieme dei numeri della cartella
    public Set<Integer> getNumeri() {
        return numeri;
    }

    //controlla se un numero è presente nella cartella(true se cè,false se non cè
    public boolean contieneNumero(int numero) {
        return numeri.contains(numero);
    }

    public static double getCosto() {
        return 1.0;  // Costo fisso per ogni cartella
    }
}

