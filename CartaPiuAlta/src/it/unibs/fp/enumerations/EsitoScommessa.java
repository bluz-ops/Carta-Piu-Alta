package it.unibs.fp.enumerations;

public enum EsitoScommessa {
	VINTA("Hai vinto la scommessa!"),
	PERSA("Ha vinto il banco"), 
	PATTA("Scommessa Patta");
	
	private String esito;
	
	//puo' essere solo private
	private EsitoScommessa(String esito) {
		this.esito = esito;
	}

	public String getEsito() {
		return esito;
	}
	
}
