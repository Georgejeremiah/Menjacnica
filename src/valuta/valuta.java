package valuta;

import java.util.GregorianCalendar;

public class valuta {
private String naziv;
private String skraceniNaziv;
private GregorianCalendar datumValute;
private int prodajni;
private int kupovni;
private String srednji;
public void setDatumValute(int dan,int Mesec,int Godina){
	datumValute.set(Godina, Mesec-1, dan);}
public GregorianCalendar getDatumValute(){
	return datumValute;
	}
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
@Override
	public String toString() {
		return "Naziv valute: "+naziv+" prodajni kurs: "+prodajni+" kupovni kurs: "+kupovni+" srednji kurs: "+srednji+" dan valute: "+datumValute.get(GregorianCalendar.DAY_OF_WEEK)+" mesec valute: "+datumValute.get(GregorianCalendar.MONTH)+"godina valute: "+datumValute.get(GregorianCalendar.YEAR); 
	}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	valuta other = (valuta) obj;
	if (datumValute == null) {
		if (other.datumValute != null)
			return false;
	} else if (!datumValute.equals(other.datumValute))
		return false;
	if (kupovni != other.kupovni)
		return false;
	if (naziv == null) {
		if (other.naziv != null)
			return false;
	} else if (!naziv.equals(other.naziv))
		return false;
	if (prodajni != other.prodajni)
		return false;
	if (skraceniNaziv == null) {
		if (other.skraceniNaziv != null)
			return false;
	} else if (!skraceniNaziv.equals(other.skraceniNaziv))
		return false;
	if (srednji == null) {
		if (other.srednji != null)
			return false;
	} else if (!srednji.equals(other.srednji))
		return false;
	return true;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((datumValute == null) ? 0 : datumValute.hashCode());
	result = prime * result + kupovni;
	result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
	result = prime * result + prodajni;
	result = prime * result
			+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
	result = prime * result + ((srednji == null) ? 0 : srednji.hashCode());
	return result;
}

}
