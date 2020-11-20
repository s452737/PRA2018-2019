package second.debug.hidden;

public class check {

    //////////////////////////////////////////////////////////
    //metoda sprawdzająca czy wejście jest liczbą i ma 11 cyfr
    //i zwracająca odpowiedni błąd

    public static String SprawdzCzyPoprawneWejscie(String s) {

        if(s.equals("koniec")) {

        } else if(s.length() != 11) {

            s = "error:zlailosccyfr";

        } else if(s.matches("[0-9]+") == false) {

            s = "error:nieliczba";

        } else {

        }

        return s;
    }

    ///////////////////////////////////////////////////////////
    //metoda sprawdzająca poprawność cyfry kontrolnej

    public static boolean SprawdzCyfreKontrolna(String s) {

        int suma = 0;
        int[] cyfra = new int[11];

        for(int k = 0; k < 11; k++) {

            cyfra[k] = Character.getNumericValue(s.charAt(k));

        }

        suma = cyfra[0] + cyfra[1] * 3 + cyfra[2] * 7 + cyfra[3] * 9 + cyfra[4];
        suma += cyfra[5] * 3 + cyfra[6] * 7 + cyfra[7] * 9 + cyfra[8] + cyfra[9] * 3;

        if( ( 10 - (suma % 10) ) == cyfra[10]) {

            return true;

        } else {
            return false;
        }

    }

}
