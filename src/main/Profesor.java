package main;

public class Profesor extends Osoba{

    String sifraProfesora;

    public Profesor(String ime, String prezime, String sifraProfesora) {
        super(ime, prezime);
        this.sifraProfesora = sifraProfesora;
    }

    public String getSifraProfesora() {
        return sifraProfesora;
    }

    public void setSifraProfesora(String sifraProfesora) {
        this.sifraProfesora = sifraProfesora;
    }
}
