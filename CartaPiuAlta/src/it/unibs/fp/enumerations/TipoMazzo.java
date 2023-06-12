package it.unibs.fp.enumerations;

import it.unibs.fp.interfaces.ISemeCarta;
import it.unibs.fp.interfaces.IValoreCarta;

public enum TipoMazzo {
	ITALIANO("ITALIANO", SemiItaliani.values(), ValoreCarteItaliane.values()),
	FRANCESE("FRANCESE", SemiFrancesi.values(), ValoreCarteFrancesi.values());
	//new String[]{"CUORI", "QUADRI", "PICCHE", "FIORI"}//
	//attributi
	private String name;
	private ISemeCarta[] semi;
	private IValoreCarta[] valori;
	
	

	private TipoMazzo(String nome, ISemeCarta[] semi, IValoreCarta[] valori) {
		this.name = nome;
		this.semi = semi;
		this.valori = valori;
	}

	public String getName() {
		return name;
	}

	public IValoreCarta[] getValori() {
		return valori;
	}
	public ISemeCarta[] getSemi() {
		return semi;
	}
}
