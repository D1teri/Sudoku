
/**
 * Author Dima K.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    private int num = 0;
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
    
    public void mapGen(){
        if(diff == 1){
            for(int y = 0; y >= Constants.BOARD_SIZE; y++){
                for(int x = 0; x >=Constants.BOARD_SIZE; x++){
                    board [y] [x] = (int)(Math.random() * 9);
                    System.out.print(board[y][x]);
                }
            }
        }
        else if(diff == 2){
        
        }
        else if(diff == 3){
        
        }
    }
}
