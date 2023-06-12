package it.unibs.fp.cartapiualta;

import it.unibs.fp.interfaces.ISemeCarta;
import it.unibs.fp.interfaces.IValoreCarta;

public class Carta {
	private ISemeCarta semeCarta;
	private IValoreCarta valoreCarta;
	
	public Carta(ISemeCarta semeCarta, IValoreCarta valoreCarta) {
		this.semeCarta = semeCarta;
		this.valoreCarta = valoreCarta;
	}
	
	public int getValore() {
		return valoreCarta.getValore();
	}
	
	public String getSeme() {
		return semeCarta.getSeme();
	}
	
	public int compareTo (Carta altra) {
		return (this.getValore()- altra.getValore());
	}
	
	public String toString() {
		StringBuffer descrizione = new StringBuffer();
		descrizione.append("[" + this.getSeme() + "]:");
		descrizione.append(+ this.getValore() + " ("+ this.valoreCarta.getNome()+ ")");
		return descrizione.toString();
	}
}
