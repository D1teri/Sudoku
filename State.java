
/**
 * Author Dima K.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    private int num = 0;
    private int diffnum = 0;
    private String diff = "";
    
    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    
    public int getDiff (){
        return diffnum;
    }
    
    public int setDiff(String diff){
        this.diff = diff;
        if(diff.equals("Easy") || diff.equals("easy")){
            diffnum = 1;
        } else if(diff.equals("Med") || diff.equals("med")
        || diff.equals("Medium") || diff.equals("medium")){
            diffnum = 2;
        } else if(diff.equals("Hard") || diff.equals("hard")){
            diffnum = 3;
        }
        return diffnum;
    }
}
