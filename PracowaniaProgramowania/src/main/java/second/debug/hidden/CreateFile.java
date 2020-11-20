package second.debug.hidden;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {

    public static void StworzPlik(String nazwaDir, String nazwaPliku, String[] dane, int ilosc) {

        //File plik = new File(nazwaDir + "\\Pesele" + "\\" + nazwaPliku + ".txt");

        try {
            File plik = new File(/*nazwaDir + File.separator + "Pesele" + File.separator + nazwaPliku + ".txt"*/ "filename678.txt");
            if (plik.createNewFile()) {
                System.out.println("Utworzono plik: " + plik.getName());
            } else {
                System.out.println("Plik o podanej nazwie już  istnieje.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred. " + nazwaDir);
            e.printStackTrace();
        }

        try {
            FileWriter zapis = new FileWriter(/*nazwaDir + "\\Pesele" + "\\" + nazwaPliku + ".txt"*/ "filename678.txt");
            for(int i = 0; i < ilosc; i++) {
                zapis.write(dane[i] + "\n");
            }
            zapis.close();
            System.out.println("Zapisano do pliku " + nazwaPliku + ".");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


}
