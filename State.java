
/**
 * Author Dima K.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    private int num = 0;
    private String diff;
    
    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    
    public int setDiff(String diff){
        if(this.diff.equals("Easy") || this.diff.equals("easy")){
            return 1;
        } else return 2;
    }
}
