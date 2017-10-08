import problema1.Student;
import problema2.Angajat;
import problema2.Copil;
import problema2.dateFixe.Post;
import problema2.dateFixe.Sex;

import java.io.File;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import static problema2.dateFixe.Post.INGINER;
import static problema2.dateFixe.Post.PROGRAMATOR;
import static problema2.dateFixe.Sex.FEMININ;
import static problema2.dateFixe.Sex.MASCULIN;

public class Main {

    public static void main(String[] args) throws Throwable {

        //probleme simple
//        Problems.demoProblems();

        //problema1
//        Student student = new Student("Nume1", "Prenume1", "12345", Year.of(2015),
//                "TI-141", 8.7, 4.0, 7.0, 10.0, 5.0);
//
//        Student student2 = new Student("Nume2", "Prenume2", "12344", Year.of(2015),
//                "TI-141", 10.0, 7.0, 5.5, 7.0, 5.0);
//
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(student2);
//        File file = new File("studenti.txt");
//        Student.salveazaInFisier(file, students);

        //problema2
        Angajat angajat1 = new Angajat("Nume1Angajat", "Prenume1Angajat",
                "08090233", MASCULIN, INGINER, LocalDate.of(2010, 10, 10), 2000.0);
        Angajat angajat2 = new Angajat("Nume2Angajat", "Prenume2Angajat",
                "08090237", FEMININ, INGINER, LocalDate.of(2015, 8, 10), 2000.0);
        Angajat angajat3 = new Angajat("Nume3Angajat", "Prenume3Angajat",
                "08090235", MASCULIN, PROGRAMATOR, LocalDate.of(2000, 11, 10), 2000.0);
        Angajat angajat4 = new Angajat("Nume4Angajat", "Prenume4Angajat",
                "08090236", FEMININ, PROGRAMATOR, LocalDate.of(2007, 5, 10), 2000.0);
        Angajat angajat5 = new Angajat("Nume5Angajat", "Prenume5Angajat",
                "08090234", MASCULIN, INGINER, LocalDate.of(2013, 10, 10), 3000.0);

        angajat1.adaugaCopil(new Copil(LocalDate.of(2017, 5, 4), FEMININ));
        angajat2.adaugaCopil(new Copil(LocalDate.of(2017, 5, 4), FEMININ));
        angajat4.adaugaCopil(new Copil(LocalDate.of(2010, 8, 4), MASCULIN));

        System.out.println(angajat1);
        System.out.println(angajat2);
        System.out.println(angajat3);
        System.out.println(angajat4);
        System.out.println(angajat5);


    }
}
