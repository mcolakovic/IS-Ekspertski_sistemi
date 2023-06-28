package com.sample;

public class Laptop {

	private String koristiZa;
	private boolean noveIgrice;
	private boolean naTerenu;
	private String procesor = "";
	private int gbRam;
	private int gbSSD;
	private boolean integrisanaGraficka;
	private int velicinaEkranaInc;
	public String getKoristiZa() {
		return koristiZa;
	}
	public void setKoristiZa(String koristiZa) {
		this.koristiZa = koristiZa;
	}
	public boolean isNoveIgrice() {
		return noveIgrice;
	}
	public void setNoveIgrice(boolean noveIgrice) {
		this.noveIgrice = noveIgrice;
	}
	public boolean isNaTerenu() {
		return naTerenu;
	}
	public void setNaTerenu(boolean naTerenu) {
		this.naTerenu = naTerenu;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public int getGbRam() {
		return gbRam;
	}
	public void setGbRam(int gbRam) {
		this.gbRam = gbRam;
	}
	public int getGbSSD() {
		return gbSSD;
	}
	public void setGbSSD(int gbSSD) {
		this.gbSSD = gbSSD;
	}
	public boolean isIntegrisanaGraficka() {
		return integrisanaGraficka;
	}
	public void setIntegrisanaGraficka(boolean integrisanaGraficka) {
		this.integrisanaGraficka = integrisanaGraficka;
	}
	public int getVelicinaEkranaInc() {
		return velicinaEkranaInc;
	}
	public void setVelicinaEkranaInc(int velicinaEkranaInc) {
		this.velicinaEkranaInc = velicinaEkranaInc;
	}
	@Override
	public String toString() {
		return "Laptop [koristiZa=" + koristiZa + ", noveIgrice=" + noveIgrice + ", naTerenu=" + naTerenu
				+ ", procesor=" + procesor + ", gbRam=" + gbRam + ", gbSSD=" + gbSSD + ", integrisanaGraficka="
				+ integrisanaGraficka + ", velicinaEkranaInc=" + velicinaEkranaInc + "]";
	}
	
	
}
