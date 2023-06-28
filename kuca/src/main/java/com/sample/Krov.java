package com.sample;

import java.util.ArrayList;

public class Krov {
	private ArrayList<String> prokisnjava = new ArrayList<>();
	private int crepoviNedostaju = 0;
	private double kvadratura;
	private boolean ulegaoKrov;
	private boolean drvoIznadKrova;
	private boolean oluciZardjali;
	private double cijena;
	private ArrayList<String> potrebniRadovi = new ArrayList<>();
	
	public ArrayList<String> getPotrebniRadovi() {
		return potrebniRadovi;
	}
	public void setPotrebniRadovi(ArrayList<String> potrebniRadovi) {
		this.potrebniRadovi = potrebniRadovi;
	}
	public ArrayList<String> getProkisnjava() {
		return prokisnjava;
	}
	public void setProkisnjava(ArrayList<String> prokisnjava) {
		this.prokisnjava = prokisnjava;
	}
	public int getCrepoviNedostaju() {
		return crepoviNedostaju;
	}
	public void setCrepoviNedostaju(int crepoviNedostaju) {
		this.crepoviNedostaju = crepoviNedostaju;
	}
	public double getKvadratura() {
		return kvadratura;
	}
	public void setKvadratura(double kvadratura) {
		this.kvadratura = kvadratura;
	}
	public boolean isUlegaoKrov() {
		return ulegaoKrov;
	}
	public void setUlegaoKrov(boolean ulegaoKrov) {
		this.ulegaoKrov = ulegaoKrov;
	}
	public boolean isDrvoIznadKrova() {
		return drvoIznadKrova;
	}
	public void setDrvoIznadKrova(boolean drvoIznadKrova) {
		this.drvoIznadKrova = drvoIznadKrova;
	}
	public boolean isOluciZardjali() {
		return oluciZardjali;
	}
	public void setOluciZardjali(boolean oluciZardjali) {
		this.oluciZardjali = oluciZardjali;
	}
	
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	@Override
	public String toString() {
		return "Krov [prokisnjava=" + prokisnjava + ", crepoviNedostaju=" + crepoviNedostaju + ", kvadratura="
				+ kvadratura + ", ulegaoKrov=" + ulegaoKrov + ", drvoIznadKrova=" + drvoIznadKrova + ", oluciZardjali="
				+ oluciZardjali + ", cijena=" + cijena + ", potrebniRadovi=" + potrebniRadovi + "]";
	}
}
