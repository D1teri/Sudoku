/**
 * Author Dima K.
 */
public class EventLoop
{
    State state = new State();
    UI ui = new UI();
    mapGen mp = new mapGen();
    int row, col, num;
    
    public static void main (String[] args){
        EventLoop eventLoop = new EventLoop();
        eventLoop.run();
    }
    
    public void run(){
        ui.printBoard(state);
    }
}
