package it.unibs.fp.cartapiualta;

import java.util.ArrayList;

import it.unibs.fp.enumerations.EsitoScommessa;
import it.unibs.fp.enumerations.TipoMazzo;

public class Partita {
	private String NomeGiocatore;
	private int credito;
	private Mazzo mazzo;
	
	public Partita(String giocatore, int soldi, TipoMazzo tipo) {
		//checkCredito(credito);
		this.NomeGiocatore = giocatore;
		this.credito = soldi;
		this.mazzo = tipo == TipoMazzo.ITALIANO ? new MazzoItaliano() : new MazzoFrancese();
		//operazione condizionale: condizione ? valore_se_vera : valore_se_falsa
	}
	
	/**
	 * La partita di default usa un mazzo italiano
	 * @param giocatore
	 * @param soldi
	 */
	public Partita(String giocatore, int soldi) {
		// checkCredito(soldi);
		this.NomeGiocatore = giocatore;
		this.credito = soldi;
		this.mazzo = new MazzoItaliano();
	}
	
	public void checkCredito(int soldi) {
		if (credito<=0) {
			throw new IllegalArgumentException ("ATTENZIONE: Il saldo deve essere positivo");
		}
	}
	public Carta estraiCarta() {
		 return this.mazzo.estrai();
	}
	
	public EsitoScommessa scommetti(int sommaScommessa, Carta cartaPlayer, Carta cartaPC) {
		int differenza = cartaPlayer.compareTo(cartaPC);
		EsitoScommessa risultato = calcolaEsito(differenza);
		aggiornaCredito(risultato, sommaScommessa);
		return risultato;
	}
	
	public EsitoScommessa calcolaEsito(int differenza) {
		if (differenza>0) 
			return EsitoScommessa.VINTA;
		else if (differenza<0) 
			return EsitoScommessa.PERSA;
		return EsitoScommessa.PATTA;
	}
	
	public void aggiornaCredito(EsitoScommessa esito, int sommaScommessa) {
		switch(esito) {
		case VINTA: this.credito = this.credito + sommaScommessa;
			break;
		case PERSA: this.credito = this.credito - sommaScommessa;
			break;
		default: break;
		}
	}
	
	public boolean isFinita() {
		return this.credito <= 0;
	}

	public String getNomeGiocatore() {
		return NomeGiocatore;
	}

	public int getCredito() {
		return this.credito;
	}
	
	public void setCredito(int credito) {
		this.credito = credito;
	}

	public void setMazzo(ArrayList<Carta> carte) {
		this.mazzo.setListaCarte(carte);
	}
	
	
	
}
