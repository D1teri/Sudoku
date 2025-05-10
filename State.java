
/**
 * Author Dima K.
 */

import java.util.Arrays; 

public class State
{
    private int gameState = Constants.STANDBY;
    private int[][] board = {
            {1,2,3,4,5,6,7,8,9},
            {4,5,6,7,8,9,1,2,3},
            {7,8,9,1,2,3,4,5,6},
            {2,3,4,5,6,7,8,9,1},
            {5,6,7,8,9,1,2,3,4},
            {8,9,1,2,3,4,5,6,7},
            {3,4,5,6,7,8,9,1,2},
            {6,7,8,9,1,2,3,4,5},
            {9,1,2,3,4,5,6,7,8},
        };
    int [][] playerBoard = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    public int pocket; 
    private int lives = 5;
    private int num;
    private int diff = 0;

    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getDiff (){
        return diff;
    }

    public int setDiff(int diff){
        this.diff = diff;
        return diff;
    }

    public int getBoardCell(int row, int col) {
        return this.playerBoard[row][col];
    }
    
    public boolean checkBoardCell(int row, int col, int num) {
        if(board[row][col] == num) return true;
        else return false;
    }
    
    public void setBoardCell(int row, int col, int num){
        playerBoard[row][col] = num;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    public int resetLives(){
        return lives = 5;
    }
    
    public int setLives(){
        return lives--;
    }

    public void boardGen(){
        int rand ;
        for(int i = 0; i <= 24; i++){
            rand = (int)(Math.random() * 24);
            if(rand == 0 || rand == 1 || rand == 3 || 
            rand == 4 || rand == 6 || rand == 7){
                for(int j = 0; j < 9; j++){
                    pocket = board[j][rand];
                    pocket++;
                    board[j][rand] = board[j][rand + 1];
                    pocket--;
                    board[j][rand + 1] = pocket;
                }
            }
            if(rand == 2 || rand == 5 || rand == 8 ){
                for(int j = 0; j < 9; j++){
                    pocket = board[j][rand];
                    pocket++;
                    board[j][rand] = board[j][rand - 2];
                    pocket--;
                    board[j][rand - 2] = pocket;
                }
            }
            if(rand == 9 || rand == 10 || rand == 12 || 
            rand == 13 || rand == 15 || rand == 16){
                rand = rand - 9;
                for(int j = 0; j < 9; j++){
                    pocket = board[rand][j];
                    pocket++;
                    board[rand][j] = board[rand + 1][j];
                    pocket--;
                    board[rand + 1][j] = pocket;
                }
            }
            if(rand == 11 || rand == 14 || rand == 17 ){
                rand = rand - 9;
                for(int j = 0; j < 9; j++){
                    pocket = board[rand][j];
                    pocket++;
                    board[rand][j] = board[rand - 2][j];
                    pocket--;
                    board[rand - 2][j] = pocket;
                }
            }
            if(rand == 18 || rand == 21){
                rand = rand - 18;
                for(int k = 0; k < 3; k++){
                    for(int j = 0; j < 9; j++){
                        pocket = board[j][rand + k];
                        pocket++;
                        board[j][rand + k] = board[j][rand + k + 3];
                        pocket--;
                        board[j][rand + k + 3] = pocket;
                    }
                }
            }
            if(rand == 19 || rand == 22){
                rand = rand - 19; 
                for(int k = 0; k < 3; k++){
                    for(int j = 0; j < 9; j++){
                        pocket = board[rand + k][j];
                        pocket++;
                        board[rand + k][j] = board[rand + k + 3][j];
                        pocket--;
                        board[rand + k + 3][j] = pocket;
                    }
                }
            }
            if(rand == 20){
                rand = rand - 14; 
                for(int k = 0; k < 3; k++){
                    for(int j = 0; j < 9; j++){
                        pocket = board[rand + k][j];
                        pocket++;
                        board[rand + k][j] = board[rand + k - 3][j];
                        pocket--;
                        board[rand + k - 3][j] = pocket;
                    }
                }
            }
            if(rand == 23){
                rand = rand - 17; 
                for(int k = 0; k < 3; k++){
                    for(int j = 0; j < 9; j++){
                        pocket = board[rand + k][j];
                        pocket++;
                        board[rand + k][j] = board[rand + k - 3][j];
                        pocket--;
                        board[rand + k - 3][j] = pocket;
                    }
                }
            }
        }
    }

    public void delofNum(){
        for(int i = 0; i < board.length; i++){
            int[] aBoard = board[i];
            int   aLength = aBoard.length;
            playerBoard[i] = new int[aLength];
            System.arraycopy(aBoard, 0, playerBoard[i], 0, aLength);
        }
        
        int row;
        int col;
        
        for(int g = 0; g < diff; g++){
            do{
                row = (int)(Math.random() * Constants.BOARD_SIZE);
                col = (int)(Math.random() * Constants.BOARD_SIZE);
            }while(playerBoard[row][col] == 0);
            playerBoard[row][col] = 0;
        }
    }
    
    public boolean isWinner(){
        int check = 0;
        for(int y = 0; y < 9; y++){
            for(int x = 0; x < 9; x++){
                if(board[y][x] == playerBoard[y][x]) check++;
            }
        }
        if(check == 81) return true;
        else return false;
    }
    
    public boolean isLoser(){
        if(lives == 0) return true;
        else return false;
    }
}


