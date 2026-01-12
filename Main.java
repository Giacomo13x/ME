import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tombola tombola = new Tombola();  // Crea il gioco della tombola
        Giocatori giocatori = new Giocatori();  // Crea il gestore dei giocatori
        giocatori.aggiungiGiocatori();  // Chiede e aggiunge i giocatori
        Vincite vincite = new Vincite();  // Gestisce le vincite

        boolean vittoria = false;
        List<Cartella> cartelle = giocatori.getCartelle();  // Ottiene le cartelle dei giocatori

        // Estrazione dei numeri fino a quando non ci sono più numeri
        while (!vittoria) {
            int numeroEstratto = tombola.estraiNumero();
            if (numeroEstratto == -1) {
                break;  // Nessun numero da estrarre
            }

            System.out.println("Numero estratto: " + numeroEstratto);

            // Controlla se qualcuno ha il numero estratto
            for (int i = 0; i < giocatori.getNumeroGiocatori(); i++) {
                Cartella cartella = cartelle.get(i);
                if (cartella.contieneNumero(numeroEstratto)) {
                    System.out.println("Giocatore " + (i + 1) + " ha il numero " + numeroEstratto);
                    // Puoi aggiungere qui una logica per determinare se il giocatore ha vinto
                }
            }

            // fermasi ad un certo numero
            if (numeroEstratto == 90) {
                vittoria = true;
                System.out.println("Il numero 90 è stato estratto! Il gioco è finito.");
            }
        }

        // Distribuisce le vincite
        vincite.distribuisciVincite(giocatori.getNumeroGiocatori());
    }
}
