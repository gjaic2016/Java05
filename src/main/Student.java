package main;

public class Student {

    private String ime;
    private String prezime;
    private int godinaStudija;
    private String brojIndexa;

    public Student(String ime, String prezime, int godinaStudija, String brojIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaStudija = godinaStudija;
        this.brojIndexa = brojIndexa;
    }

    public Student(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }


}
