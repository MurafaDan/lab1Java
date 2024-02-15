import java.util.ArrayList;
import java.util.Arrays;

public class Verificare {
    public ArrayList<String> extractWords(String[] words , int length , String[] consoane){

        ArrayList<String> cuvinteValide = new ArrayList<>();
        for (String word:words) {
            if(word.length()==length){
                String primaLitera = word.substring(0,1).toLowerCase();
                for (String consoana:consoane) {
                    if(primaLitera.equals(consoana)){
                        cuvinteValide.add(word);
                    }
                }
            }
        }
        return cuvinteValide;
    }
}
