
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
    
    public String getNum(int num){
        if (num != 0) return ""+num;
        else return " ";
    }
    
    public void invalMove(int row, int col){
        System.out.printf(Constants.INVALID_MOVE_ERROR, row, col);
        System.out.println();
    }
    
    public int getDiff(){
        int diff = 0;
        while (diff <= 0 || diff > 60){
            System.out.println(Constants.DIFFICULTY);
            String strdiff = scanner.next();
            if(strdiff.equals("Easy") || strdiff.equals("easy")){
                diff = 20;
            } else if(strdiff.equals("Med") || strdiff.equals("med")
            || strdiff.equals("Medium") || strdiff.equals("medium")){
                diff = 40;
            } else if(strdiff.equals("Hard") || strdiff.equals("hard")){
                diff = 50;
            } else if(strdiff.equals("Epic") || strdiff.equals("epic")){
                diff = 60;
            } else {
                System.out.println(Constants.INVALID_DIFF);
                System.out.println();
            }
        }
        return diff;
    }
    
    public void printBoard(State state){
        System.out.println();
        System.out.println(Constants.DIVIDER_BLOCK_STRING);
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            for (int col = 0; col < Constants.BOARD_SIZE; col++){
                if(col % 3 == 0){
                System.out.printf(Constants.BOARD_BLOCK_STRING, getNum(state.getBoardCell(row,col)));
                }
                else System.out.printf(Constants.BOARD_STRING, getNum(state.getBoardCell(row,col)));
            }
            
            System.out.println("l");
            if(row % 3 == 2){
                System.out.println(Constants.DIVIDER_BLOCK_STRING);
            }
            else System.out.println(Constants.DIVIDER_STRING);
        }
    }
    
    public int getMoveRow(){
        int row = 0;
        while (row <= 0 || row > 9) {
            try {
                System.out.print(Constants.GET_ROW_MOVE);
                row = scanner.nextInt();
                if(row > 9 || row < 0){
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                }
            } catch (Exception e) {
                System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                String skip = scanner.nextLine();
            }
        }
        return row;
    }
    
    public int getMoveCol(){
        int col = 0;
        while (col <= 0 || col > 9) {
            try {
                System.out.printf(Constants.GET_COL_MOVE);
                col = scanner.nextInt();
                if(col > 9 || col < 0){
                    System.out.println(Constants.INVALID_ROW_OR_COLUMN);
                }
            } catch (Exception e) {
                System.out.println(Constants.INVALID_ROW_OR_COLUMN);
            }
        }
        return col;
    }
    
    public int getMoveNum(){
        int num = 0;
        while (num <=0 || num > 9) {
            try {
                System.out.printf(Constants.GET_NUM_MOVE);
                num = scanner.nextInt();
                if(num > 9 || num < 0){
                    System.out.println(Constants.INVALID_NUMBER);
                }
            } catch (Exception e) {
                System.out.println(Constants.INVALID_NUMBER);
            }
        }
        return num;
    }
    
    public boolean isLegalMove(State state, int row, int col, int num){
        boolean check = true;
        if(row <= 0 || row > 9) check = false;
        if (col <= 0 || col > 9) check = false;
        if (num <= 0 || num > 9) check = false;
        if (state.getBoardCell(row-1, col-1) != 0) check = false;
        if (state.checkBoardCell(row-1, col-1, num)) check = true;
        else check = false;
        return check;
    }
    
    public void livesLeft(State state){
        int lives = state.getLives();
        System.out.printf(Constants.LIVES, lives);
        System.out.println();
    }
    
    public boolean startNewGame() {
        System.out.println(Constants.START_NEW_GAME);
        String yesOrNo = scanner.next();
        return yesOrNo.equals("Y") || yesOrNo.equals("y");
    }
}