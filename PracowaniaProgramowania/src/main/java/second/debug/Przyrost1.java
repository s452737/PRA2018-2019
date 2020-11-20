package second.debug;

import second.debug.hidden.check;
import second.debug.hidden.CreateFile;
import java.io.File;
import java.util.Scanner;

public class Przyrost1 {

    public static void main(final String... args) {

        int N = 10000;
        String[] doZapisu = new String[N];
        String dane;
        String nazwaPliku;

        System.out.print("Wpisz nazwe pliku: ");

        Scanner wejscie = new Scanner(System.in);
        nazwaPliku = wejscie.nextLine();

        int dotychczas = 0;

        for (int i = 0; i < N; i++) {

            dane = wejscie.nextLine();

            String Pesel = check.SprawdzCzyPoprawneWejscie(dane);

            if (Pesel.equals("koniec")) {
                break;
            } else if (Pesel.equals("error:zlailosccyfr")) {
                System.out.println("Błąd: wejście ma inną ilośc znaków niż 11!");
                dotychczas--;
            } else if (Pesel.equals("error:nieliczba")) {
                System.out.println("Błąd: wejście nie jest liczbą!");
                dotychczas--;
            } else if(check.SprawdzCyfreKontrolna(Pesel) == false) {
                System.out.println("Błąd: niezgodność cyfry kontrolnej");
                dotychczas--;
            } else {
                doZapisu[dotychczas] = Pesel;
            }
            dotychczas++;
        }

        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";

        CreateFile.StworzPlik(desktopPath, nazwaPliku, doZapisu, dotychczas);

    }

}