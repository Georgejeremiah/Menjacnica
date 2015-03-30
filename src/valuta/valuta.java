package valuta;

import java.util.GregorianCalendar;

public class valuta {
private String naziv;
private String skraceniNaziv;
private GregorianCalendar datumValute;
private int prodajni;
private int kupovni;
private String srednji;
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public String getSkraceniNaziv() {
	return skraceniNaziv;
}
public void setSkraceniNaziv(String skraceniNaziv) {
	this.skraceniNaziv = skraceniNaziv;
}
public GregorianCalendar getDatumValute() {
	return datumValute;
}
public void setDatumValute(GregorianCalendar datumValute) {
	this.datumValute = datumValute;
}
public int getProdajni() {
	return prodajni;
}
public void setProdajni(int prodajni) {
	this.prodajni = prodajni;
}
public int getKupovni() {
	return kupovni;
}
public void setKupovni(int kupovni) {
	this.kupovni = kupovni;
}
public String getSrednji() {
	return srednji;
}
public void setSrednji(String srednji) {
	this.srednji = srednji;
}


}
