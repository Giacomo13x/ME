import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giocatori {
    private List<Cartella> cartelle = new ArrayList<>();
    private int numeroGiocatori;

    public void aggiungiGiocatori() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti giocatori vogliono partecipare? (min 2, max 8): ");
        numeroGiocatori = scanner.nextInt();

        // Verifica che ci siano giocatori tra 2 e 8
        if (numeroGiocatori < 2 || numeroGiocatori > 8) {
            System.out.println("Numero di giocatori non valido!");
            return;
        }

        for (int i = 0; i < numeroGiocatori; i++) {
            Cartella cartella = new Cartella();
            cartelle.add(cartella);
            System.out.println("Cartella del giocatore " + (i + 1) + ": " + cartella.getNumeri());
        }
    }

    public List<Cartella> getCartelle() {
        return cartelle;
    }

    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }
}
