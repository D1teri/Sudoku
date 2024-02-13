
import java.util.Scanner;

/**
 * Author Dima K.
 */


public class UI
{
    
    Scanner scanner;
    
    public UI() {
        scanner = new Scanner(System.in);         
    }
    
    public String getDiff(){
        System.out.println(Constants.DIFFICULTY);
        String diff = scanner.nextLine();
        System.out.println();
        return diff;
    }
    
    
}
