package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evidencija {

    private ArrayList<Student> listaStudenata;

    private ArrayList<Profesor> listaProfesora;

    public List<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public ArrayList<Profesor> getListaProfesora() {
        return listaProfesora;
    }

    public void setListaProfesora(ArrayList<Profesor> listaProfesora) {
        this.listaProfesora = listaProfesora;
    }

    public Student dodajStudenta(Scanner scanner) {
        Student stud = new Student(null, null, 0, null);

        System.out.println("NOVI STUDENT....");

        System.out.print("Unesite ime studenta: ");
        String ime = scanner.next();
        stud.setIme(ime);

        System.out.print("Unesite prezima studenta: ");
        String prezime = scanner.next();
        stud.setPrezime(prezime);

        System.out.print("Unesite godinu studija studenta: ");
        int godStudija = scanner.nextInt();
        scanner.nextLine();
        stud.setGodinaStudija(godStudija);

        System.out.print("Unesite broj indexa studenta: ");
        String brIndexa = scanner.next();
        stud.setBrojIndexa(brIndexa);

        return stud;

    }

    public void pretraziStudenta(String brojTrazenogIndexa) {
        for (Student jedanStudent : listaStudenata) {
            if (brojTrazenogIndexa.equals(jedanStudent.getBrojIndexa())) {
                System.out.println("Student pronađen: " + jedanStudent.getIme() + " " + jedanStudent.getPrezime());
            }
        }

    }

    public void ispisSvihStudenata() {

        System.out.println("Popis svih studenata: ");
        for (Student jedanStudent : listaStudenata) {
            System.out.println(jedanStudent.getIme() + " " + jedanStudent.getPrezime());
        }

    }

    public Profesor dodajProfesora(Scanner scanner) {
        Profesor prof = new Profesor(null, null, null);

        System.out.println("NOVI PROFESOR....");

        System.out.println("Unesite ime profesora: ");
        String ime = scanner.next();
        prof.setIme(ime);

        System.out.println("Unesite prezime profesora: ");
        String prezime = scanner.next();
        prof.setPrezime(prezime);

        System.out.println("Unesite šifru profesora: ");
        String sifra = scanner.nextLine();
        prof.setSifraProfesora(sifra);

        return prof;

    }

}
