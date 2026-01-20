import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giocatori {
    private List<Cartella> cartelle = new ArrayList<>();
    private int numeroGiocatori;

    public void aggiungiGiocatori() {  //è il metodo principale della classe: crea i giocatori e le loro cartelle.
        // leggi i numeri dei giocatori
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti giocatori vogliono partecipare? (min 2, max 8): ");
        numeroGiocatori = scanner.nextInt();

        // Verifica che ci siano giocatori tra 2 e 8
        if (numeroGiocatori < 2 || numeroGiocatori > 8) {
            System.out.println("Numero di giocatori non valido!");
            return;
        }

        // creo le cartelle
        for (int i = 0; i < numeroGiocatori; i++) {
            Cartella cartella = new Cartella();
            cartelle.add(cartella);
            System.out.println("Cartella del giocatore " + (i + 1) + ": " + cartella.getNumeri());
        }
    }

    // restituisce tutte le certelle
    public List<Cartella> getCartelle() {
        return cartelle;
    }

    // restituisce i giocatori inseriti
    public int getNumeroGiocatori() {
        return numeroGiocatori;
    }
}

