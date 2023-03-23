package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int odabir = 0;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> studenti = new ArrayList<>();
        ArrayList<Profesor> profesori = new ArrayList<>();

        Evidencija evidencija = new Evidencija();

        evidencija.setListaStudenata(studenti);

        do {
            System.out.println("------------IZBORNIK--------------");
            System.out.println("Odaberite opciju");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Pretraga po indexu");
            System.out.println("3. Ispisi sve studente");
            System.out.println("4. Izlaz");
            System.out.println("5. Dodaj profesora");

            odabir = scanner.nextInt();
            System.out.println("Odabir: " + odabir);

            switch (odabir) {
                case 1: {
                    System.out.println("----------------------------------");
                    System.out.println("DODAVANJE STUDENTA");
                    Student noviStudent = evidencija.dodajStudenta(scanner);
//                    Student noviStudent = unosStudenta(scanner);
                    studenti.add(noviStudent);
                    break;
                }
                case 2: {
                    System.out.println("----------------------------------");
                    System.out.println("PRETRAGA STUDENTA");
                    System.out.print("Unesi broj indexa: ");
                    String brojTrazenogIndexa = scanner.next();

                    evidencija.pretraziStudenta(brojTrazenogIndexa);
                    break;
                }
                case 3: {
                    System.out.println("----------------------------------");
                    System.out.println("ISPIS STUDENATA");
//                    System.out.println("Broj studenata: " + studenti.size());
                    System.out.println("Broj studenata: " + evidencija.getListaStudenata().size());

                    evidencija.ispisSvihStudenata();
                    break;
                }
                case 4: {
                    System.out.println("----------------------------------");
                    System.out.println("IZLAZ");
                    break;
                }
                case 5: {
                    System.out.println("----------------------------------");
                    System.out.println("DODAJ PROFESORA");
                    Profesor noviProfesor = evidencija.dodajProfesora(scanner);
                    profesori.add(noviProfesor);
                }
            }
        } while (odabir != 4);

        System.out.println("Doviđenja!");

    }
}
