import java.util.Scanner;

public class inserareTastatura {
    private Scanner scanner;

    public inserareTastatura(){
        scanner = new Scanner(System.in);
    }

    public String getString(String propozitie){
        System.out.println(propozitie);
        return scanner.nextLine();
    }

    public int getInt(){
        while(!scanner.hasNext()){
            scanner.next();
        }
        return  scanner.nextInt();
    }
}
