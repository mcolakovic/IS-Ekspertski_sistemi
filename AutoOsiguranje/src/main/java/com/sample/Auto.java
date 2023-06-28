package com.sample;

public class Auto {

	private double osnovnaCijena;
	private int snagaMotora;
	private int premijskiStepenPrethodnaGodina;
	private int premijskiStepenTekucaGodina;
	private int nezgode;
	private boolean novoVozilo;
	private double konacnaCijena;
	public double getOsnovnaCijena() {
		return osnovnaCijena;
	}
	public void setOsnovnaCijena(double osnovnaCijena) {
		this.osnovnaCijena = osnovnaCijena;
	}
	public int getSnagaMotora() {
		return snagaMotora;
	}
	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public int getPremijskiStepenPrethodnaGodina() {
		return premijskiStepenPrethodnaGodina;
	}
	public void setPremijskiStepenPrethodnaGodina(int premijskiStepenPrethodnaGodina) {
		this.premijskiStepenPrethodnaGodina = premijskiStepenPrethodnaGodina;
	}
	public int getPremijskiStepenTekucaGodina() {
		return premijskiStepenTekucaGodina;
	}
	public void setPremijskiStepenTekucaGodina(int premijskiStepenTekucaGodina) {
		this.premijskiStepenTekucaGodina = premijskiStepenTekucaGodina;
	}
	public int getNezgode() {
		return nezgode;
	}
	public void setNezgode(int nezgode) {
		this.nezgode = nezgode;
	}
	public boolean isNovoVozilo() {
		return novoVozilo;
	}
	public void setNovoVozilo(boolean novoVozilo) {
		this.novoVozilo = novoVozilo;
	}
	public double getKonacnaCijena() {
		return konacnaCijena;
	}
	public void setKonacnaCijena(double konacnaCijena) {
		this.konacnaCijena = konacnaCijena;
	}
	@Override
	public String toString() {
		return "Auto [osnovnaCijena=" + osnovnaCijena + ", snagaMotora=" + snagaMotora
				+ ", premijskiStepenPrethodnaGodina=" + premijskiStepenPrethodnaGodina
				+ ", premijskiStepenTekucaGodina=" + premijskiStepenTekucaGodina + ", nezgode=" + nezgode
				+ ", novoVozilo=" + novoVozilo + ", konacnaCijena=" + konacnaCijena + "]";
	}
	
	
}
