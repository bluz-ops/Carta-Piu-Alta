package it.unibs.fp.enumerations;

import it.unibs.fp.interfaces.ISemeCarta;

public enum SemiItaliani implements ISemeCarta{
	
	SPADE("SPADE"), BASTONI("BASTONI"), COPPE("COPPE"), DENARI("DENARI");
	private String seme;

	private SemiItaliani(String seme) {
		this.seme = seme;
	}

	public String getSeme() {
		return seme;
	}
	
	
}
