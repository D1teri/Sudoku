
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
    
    public String getBoardNum(int num) {
        if (num == 0) {
            return " ";
        } else{
            String strnum = String.valueOf(num);  
            return strnum;
        }
    }
    
    public boolean isLegalMove(State state, int row, int col) {
        if(1 <= row && row <= Constants.BOARD_SIZE &&
        1 <= col && col <= Constants.BOARD_SIZE &&
        state.getBoardCell(row-1, col-1) == 0){
            return true;
        } else{
            System.out.printf(Constants.INVALID_MOVE_ERROR, row, col);
            System.out.println();
            return false;
        }
    }
    
    public int getMoveRow(int whoseMove, String xName, String oName) {
        int row = 0;
        while (row <= 0 || row >= 4) {
            try {
                System.out.printf(Constants.GET_ROW_MOVE, getBoardNum(getNum(num)));
                row = scanner.nextInt();
                if(row >= 4 || row <= 0){
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                }
            } catch (Exception e) {
                System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                String skip = scanner.nextLine();
            }
        }
        return row;
    }
    
    public void printBoard(State state) {
        System.out.println(Constants.DIVIDER_STRING);
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            for(int col = 0; col < Constants.BOARD_SIZE; col++){
                System.out.printf(Constants.BOARD_STRING, getBoardNum(state.getBoardCell(row, col)));
            }
            System.out.println();
            System.out.println(Constants.DIVIDER_STRING);
        }
    }
        
}
