import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Introduceti datele unei noi calatorii:");
        System.out.println("Date sofer:");
        System.out.println("Id permis: ");
        Sofer sofer = new Sofer(bufferedReader.readLine());
        System.out.println("Nume: ");
        sofer.setNume(bufferedReader.readLine());
        System.out.println("Prenume: ");
        sofer.setPrenume(bufferedReader.readLine());
        System.out.println("Varsta: ");
        try {
            sofer.setVarsta(Integer.parseInt(bufferedReader.readLine()));
        } catch (NumberFormatException e) {
            System.out.println("Varsta trebuie sa fie un numar intreg!");
        }


    }
}
