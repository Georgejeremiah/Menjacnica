package interfejszamenjacnicu;

public interface MenjacnicaInterface {
	public void dodajKursValute(int prodajni, int kupovni, int srednji, int dan);
	public void obrisiKursValute(int dan);
	public String kursValuteJe(int dan);

}
