package app.model;

import java.io.Serializable;

public class Vastaukset implements Serializable{
	private int ehdokas_id;
	private int kysymys_id;
	private int vastaus;
	private String kommentti;
	public Vastaukset(String ehdokas_id, String kysymys_id, String vastaus, String kommentti) {
		// TODO Auto-generated constructor stub
		setEhdokas_id(ehdokas_id);
		setKysymys_id(kysymys_id);
		setVastaus(vastaus);
		this.kommentti = kommentti;
		
	}
	public Vastaukset() {
		// TODO Auto-generated constructor stub
	}
	public int getEhdokas_id() {
		return ehdokas_id;
	}
	public void setEhdokas_id(int ehdokas_id) {
		this.ehdokas_id = ehdokas_id;
	}
	public void setEhdokas_id(String ehdokas_id) {
		try {
			this.ehdokas_id = Integer.parseInt(ehdokas_id);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public int getKysymys_id() {
		return kysymys_id;
	}
	public void setKysymys_id(int kysymys_id) {
		this.kysymys_id = kysymys_id;
	}
	public void setKysymys_id(String kysymys_id) {
		try {
			this.kysymys_id = Integer.parseInt(kysymys_id);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public int getVastaus() {
		return vastaus;
	}
	public void setVastaus(int vastaus) {
		this.vastaus = vastaus;
	}
	public void setVastaus(String vastaus) {
		try {
			this.vastaus = Integer.parseInt(vastaus);
		}
		catch(NumberFormatException | NullPointerException e) {
			//Do nothing - the value of id won't be changed
		}
	}
	public String getKommentti() {
		return kommentti;
	}
	public void setKommentti(String kommentti) {
		this.kommentti = kommentti;
	}
}