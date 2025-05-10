/**
 * Author Dima K.
 */
public class EventLoop
{
    State state = new State();
    UI ui = new UI();
    int row, col, num;
    
    public static void main (String[] args){
        EventLoop eventLoop = new EventLoop();
        eventLoop.run();
    }
    
    public void run(){
        while (state.getGameState() != Constants.QUIT_PROGRAM) {
            int gameState = state.getGameState();
            if (gameState == Constants.STANDBY) {
                state.resetLives();
                state.setGameState(Constants.DIFF);
            } else if (gameState == Constants.DIFF) {
                state.setDiff(ui.getDiff());
                state.setGameState(Constants.GEN);
            } else if (gameState == Constants.GEN){
                state.boardGen();
                state.delofNum();
                ui.printBoard(state);
                state.setGameState(Constants.GET_MOVE);
            } else if (gameState == Constants.GET_MOVE){
                ui.livesLeft(state);
                
                row = ui.getMoveRow();
                col = ui.getMoveCol();
                num = ui.getMoveNum();
                if (ui.isLegalMove(state, row, col, num)) {
                    state.setGameState(Constants.MAKE_MOVE);
                } else { 
                    state.setLives();
                    ui.invalMove(row,col);
                    ui.printBoard(state);
                    state.setGameState(Constants.CHECK_IF_LOSE);
                }
            } else if (gameState == Constants.MAKE_MOVE) {
                state.setBoardCell(row-1, col-1, num);
                ui.printBoard(state);
                state.setGameState(Constants.CHECK_IF_WINNER);
            } else if (gameState == Constants.CHECK_IF_WINNER) {
                if(state.isWinner()){
                    System.out.println(Constants.VICTORY);
                    state.setGameState(Constants.GAME_OVER);
                } else {
                    state.setGameState(Constants.GET_MOVE);
                }
            } else if (gameState == Constants.CHECK_IF_LOSE) {
                if(state.isLoser()){
                    System.out.println(Constants.DEFEAT);
                    state.setGameState(Constants.GAME_OVER);
                } else {
                    state.setGameState(Constants.GET_MOVE);
                }
            }else if (gameState == Constants.GAME_OVER) {
                if (ui.startNewGame()) {
                    state.setGameState(Constants.STANDBY);
                } else {
                    state.setGameState(Constants.QUIT_PROGRAM);
                }
            }
        }
    }
}