package com.sample;

import java.util.ArrayList;

public class Klijent {

	private boolean vozackaB;
	private int godine;
	private double godineVozacke;
	private boolean izdavanje = true;
	private boolean depozit;
	private double iznosDepozita;
	private ArrayList<String> kategorije = new ArrayList<String>();
	
	public boolean isVozackaB() {
		return vozackaB;
	}
	public void setVozackaB(boolean vozackaB) {
		this.vozackaB = vozackaB;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	public double getGodineVozacke() {
		return godineVozacke;
	}
	public void setGodineVozacke(double godineVozacke) {
		this.godineVozacke = godineVozacke;
	}
	public boolean isIzdavanje() {
		return izdavanje;
	}
	public void setIzdavanje(boolean izdavanje) {
		this.izdavanje = izdavanje;
	}
	public boolean isDepozit() {
		return depozit;
	}
	public void setDepozit(boolean depozit) {
		this.depozit = depozit;
	}
	public double getIznosDepozita() {
		return iznosDepozita;
	}
	public void setIznosDepozita(double iznosDepozita) {
		this.iznosDepozita = iznosDepozita;
	}
	public ArrayList<String> getKategorije() {
		return kategorije;
	}
	public void setKategorije(ArrayList<String> kategorije) {
		this.kategorije = kategorije;
	}
	@Override
	public String toString() {
		return "Klijent [vozackaB=" + vozackaB + ", godine=" + godine + ", godineVozacke=" + godineVozacke
				+ ", izdavanje=" + izdavanje + ", depozit=" + depozit + ", iznosDepozita=" + iznosDepozita
				+ ", kategorije=" + kategorije + "]";
	}
	
	
}
