package it.unibs.fp.enumerations;

import it.unibs.fp.interfaces.ISemeCarta;

public enum SemiFrancesi implements ISemeCarta{
	CUORI("CUORI"),
	QUADRI("QUADRI"),
	PICCHE("PICCHE"),
	FIORI("FIORI");
	private String seme;

	private SemiFrancesi(String seme) {
		this.seme = seme;
	}

	public String getSeme() {
		return seme;
	}
	
}
