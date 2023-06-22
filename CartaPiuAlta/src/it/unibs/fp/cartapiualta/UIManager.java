package it.unibs.fp.cartapiualta;

import it.unibs.fp.enumerations.TipoMazzo;
import it.unibs.fp.mylib.InputDati;

/**
 * 
 * @author Molla Blen Zena
 * user interface manager
 * gestisce tutte le interazioni da tastiera e su schermo con l'utente
 * contiene il menu per gestire la partita
 * 
 */

public class UIManager {
	
	public static final String MSG_INIZIO = "INIZIO PARTITA' CARTA PIU' ALTA";

	public static void gioca(TipoMazzo tipo) {
		INIZIO();
		String nome = InputDati.leggiStringa("Inserire nome giocatore: ");
		int denaro = InputDati.leggiIntero("Inserire disponibilita' denaro: ");
		// creazione partita
		Partita partita = new Partita(nome, denaro, tipo);
		// condizione di terminazione
		boolean continua= true;
		do {
		// estrazione carta utente	
		Carta cartaUtente = partita.estraiCarta();
		System.out.println(cartaUtente.toString());
		//scommessa denaro
		int sommaScommessa = InputDati.leggiIntero("Inserire ammontare da scommettere");
		// estrazione carta pc
		Carta cartaPC = partita.estraiCarta();
		System.out.println(cartaPC.toString());
		// calcolo e stampa esito scommessa
		// partita.scommessaERisultato(sommaScommessa, cartaUtente, cartaPC);
		partita.stampaEsito(partita.scommessaERisultato(sommaScommessa, cartaUtente, cartaPC));
		if (partita.isFinita()) {
			System.out.println("PARTITA TERMINATA: " +nome+ " hai finito i soldi");
			break;
		}
		continua=InputDati.yesOrNo("Vuoi proseguire?");
		} while(continua);
		}

	public static void INIZIO() {
		System.out.println(MSG_INIZIO);
	}
}
