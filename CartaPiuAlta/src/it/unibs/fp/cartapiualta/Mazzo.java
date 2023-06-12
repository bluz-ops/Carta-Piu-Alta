package it.unibs.fp.cartapiualta;

import java.util.ArrayList;
import it.unibs.fp.enumerations.TipoMazzo;
import it.unibs.fp.interfaces.ISemeCarta;
import it.unibs.fp.interfaces.IValoreCarta;
import it.unibs.fp.mylib.EstrazioniCasuali;

public abstract class Mazzo {
	
	// ArrayList contenente una lista completa di carte da gioco
	private ArrayList <Carta> listaCarte = new ArrayList<Carta>();
	
	 public Mazzo(TipoMazzo tipo) {
		 listaCarte = costruisciMazzo(tipo.getSemi() , tipo.getValori()) ;
	 }

	public void setListaCarte(ArrayList<Carta> listaCarte) {
		this.listaCarte = listaCarte;
	}


	public ArrayList<Carta> costruisciMazzo( ISemeCarta[] semi, IValoreCarta[] valori) {
		 ArrayList<Carta> lista = new ArrayList<Carta>();
		 for(ISemeCarta seme: semi) {
			 for (IValoreCarta valore: valori) {
				 Carta carta = new Carta(seme, valore);
				 lista.add(carta);
			 }
		 }
		 return lista;
	 }
	 
	 public Carta estrai() {
		 int estrazione = EstrazioniCasuali.estraiIntero(0, listaCarte.size());
			return listaCarte.get(estrazione);
	 }
	 
}
