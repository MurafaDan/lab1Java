import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] consoane = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "ș", "t", "ț", "v", "w", "x", "z"};

       inserareTastatura inserareTastatura = new inserareTastatura();
        System.out.println("Introduceti lungimea de cuvant dorita:");
       int lungimeCuvant = inserareTastatura.getInt();
        inserareTastatura.getString("");

       String text = inserareTastatura.getString("Introdu textul tau:");
       String[] words = text.split("\\s+");

       Verificare verificare = new Verificare();

        ArrayList<String> cuvinteValide = verificare.extractWords(words,lungimeCuvant, consoane);
        System.out.println("Cuvintele care incep cu o consoana si lungimea " + lungimeCuvant + " sunt:  ");
        for (String word:cuvinteValide) {
            System.out.print(word+" ");
        }

        System.out.println(" ");
        System.out.println("Textul introdus din cod : ");
        String text2 = "Astazi este o zi minunata pentru a sadi un copac in parc";
        System.out.println(text2);
        int lungimeCuvantManual=4;
        System.out.println("Lungimea cuvintelor v-a fi de "+lungimeCuvantManual+" litere");
        String[] words2 = text2.split("\\s+");

        Verificare verificareTextManual = new Verificare();

        ArrayList<String> cuvinteValideManual = verificareTextManual.extractWords(words2,lungimeCuvantManual,consoane);
        for (String word:cuvinteValideManual) {
            System.out.print(word+" ");
        }




    }
}
