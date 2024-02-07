
/**
 * Author Dima K.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    private int num = 0;
    
    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int num) {
        this.board[row][col] = num;
    }
    
}
