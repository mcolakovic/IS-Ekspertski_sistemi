package com.sample;

public class Klima {

	private String tipKlime = "obicna";
	private int snagaKlime;
	private boolean inverter;
	private double kvadraturaStana;
	private boolean viseProstorija;
	private boolean mogucaUgradnja;
	private String koriscenje;
	private boolean malaTemperatura;
	public String getTipKlime() {
		return tipKlime;
	}
	public void setTipKlime(String tipKlime) {
		this.tipKlime = tipKlime;
	}
	public int getSnagaKlime() {
		return snagaKlime;
	}
	public void setSnagaKlime(int snagaKlime) {
		this.snagaKlime = snagaKlime;
	}
	public boolean isInverter() {
		return inverter;
	}
	public void setInverter(boolean inverter) {
		this.inverter = inverter;
	}
	public double getKvadraturaStana() {
		return kvadraturaStana;
	}
	public void setKvadraturaStana(double kvadraturaStana) {
		this.kvadraturaStana = kvadraturaStana;
	}
	public boolean isViseProstorija() {
		return viseProstorija;
	}
	public void setViseProstorija(boolean viseProstorija) {
		this.viseProstorija = viseProstorija;
	}
	public boolean isMogucaUgradnja() {
		return mogucaUgradnja;
	}
	public void setMogucaUgradnja(boolean mogucaUgradnja) {
		this.mogucaUgradnja = mogucaUgradnja;
	}
	public String getKoriscenje() {
		return koriscenje;
	}
	public void setKoriscenje(String koriscenje) {
		this.koriscenje = koriscenje;
	}
	public boolean isMalaTemperatura() {
		return malaTemperatura;
	}
	public void setMalaTemperatura(boolean malaTemperatura) {
		this.malaTemperatura = malaTemperatura;
	}
	@Override
	public String toString() {
		return "Klima [tipKlime=" + tipKlime + ", snagaKlime=" + snagaKlime + ", inverter=" + inverter
				+ ", kvadraturaStana=" + kvadraturaStana + ", viseProstorija=" + viseProstorija + ", mogucaUgradnja="
				+ mogucaUgradnja + ", koriscenje=" + koriscenje + ", malaTemperatura=" + malaTemperatura + "]";
	}
	
	
}
