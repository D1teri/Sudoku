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
                state.setGameState(Constants.DIFF);

            } else if (gameState == Constants.DIFF) {
                state.setDiff(ui.getDiff());
                state.setGameState(Constants.GEN);
            } else if (gameState == Constants.GEN){
                state.mapGen();
            }
        }
    }
}
