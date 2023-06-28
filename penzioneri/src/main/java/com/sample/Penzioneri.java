package com.sample;

public class Penzioneri {

	private int godine;
	private int godine_staza;
	private char pol;
	private boolean invaliditet;
	
	private int starosna_granica;
	private String penzija;
	private double procenat_penzije;

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public int getGodine_staza() {
		return godine_staza;
	}

	public void setGodine_staza(int godine_staza) {
		this.godine_staza = godine_staza;
	}

	public char getPol() {
		return pol;
	}

	public void setPol(char pol) {
		this.pol = pol;
	}

	public boolean isInvaliditet() {
		return invaliditet;
	}

	public void setInvaliditet(boolean invaliditet) {
		this.invaliditet = invaliditet;
	}

	public int getStarosna_granica() {
		return starosna_granica;
	}

	public void setStarosna_granica(int starosna_granica) {
		this.starosna_granica = starosna_granica;
	}

	public String getPenzija() {
		return penzija;
	}

	public void setPenzija(String penzija) {
		this.penzija = penzija;
	}

	public double getProcenat_penzije() {
		return procenat_penzije;
	}

	public void setProcenat_penzije(double procenat_penzije) {
		this.procenat_penzije = procenat_penzije;
	}

	@Override
	public String toString() {
		return "Penzioneri [godine=" + godine + ", godine_staza=" + godine_staza + ", pol=" + pol + ", invaliditet="
				+ invaliditet + ", starosna_granica=" + starosna_granica + ", penzija=" + penzija
				+ ", procenat_penzije=" + procenat_penzije + "]";
	}
}
