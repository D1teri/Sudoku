
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
            for(int i = 0; i >= Constants.BOARD_SIZE; i++){
            
            }
        }
    }
}
