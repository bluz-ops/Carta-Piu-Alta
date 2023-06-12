package it.unibs.fp.enumerations;

import it.unibs.fp.interfaces.IValoreCarta;

public enum ValoreCarteItaliane implements IValoreCarta{
	ASSO(14, "asso"),
	DUE(2, "DUE"),
	TRE(3, "TRE"),
	QUATTRO(4, "QUATTRO"),
	CINQUE(5, "CINQUE"),
	SEI(6,"SEI"),
	SETTE(7, "SETTE"),
	FANTE(8,"FANTE"),
	CAVALLO(9,"CAVALLO"),
	RE(10,"RE");
	
	//attributi
	private int valore;
	private String nome;
	
	//costruttore
	private ValoreCarteItaliane(int valore, String nome) {
		this.valore = valore;
		this.nome = nome;
	}
	
	//metodi implementati dall'interfaccia
	@Override
	public int getValore() {
		return valore;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
}
