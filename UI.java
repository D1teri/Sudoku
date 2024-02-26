
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
    
    public int getDiff(){
        int diff = 0;
        while (diff <= 0 || diff >= 4){
            System.out.println(Constants.DIFFICULTY);
            String strdiff = scanner.nextLine();
            if(strdiff.equals("Easy") || strdiff.equals("easy")){
                diff = 1;
            } else if(strdiff.equals("Med") || strdiff.equals("med")
            || strdiff.equals("Medium") || strdiff.equals("medium")){
                diff = 2;
            } else if(strdiff.equals("Hard") || strdiff.equals("hard")){
                diff = 3;
            } else {
                System.out.println(Constants.INVALID_DIFF);
                System.out.println();
            }
        }
        return diff;
    }
    
    public void printBoard(State state){
        System.out.println(Constants.DIVIDER_STRING);
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            for (int col = 0; col < Constants.BOARD_SIZE; col++){
                System.out.printf(Constants.BOARD_STRING, state.getBoardCell(row,col));
            }
            System.out.println();
            System.out.println(Constants.DIVIDER_STRING);
        }
    }
}
