
/**
 * Author Dima K.
 */
public class Constants
{
    // Board size
    public static final int BOARD_SIZE = 9;
    
    // Game state
    public static final int STANDBY = 0;
    public static final int DIFF = 1;
    public static final int GEN = 2;
    public static final int GET_MOVE = 3;
    public static final int MAKE_MOVE = 4;
    public static final int CHECK_IF_WINNER = 5;
    public static final int GAME_OVER = 6;
    public static final int QUIT_PROGRAM = 7;
    
    // Strings
    
    public static final String DIVIDER_STRING = "|---|---|---|---|---|---|---|---|---|";
    public static final String BOARD_STRING = "| %s | %s | %s | %s | %s | %s | %s | %s | %s |";
    public static final String TITLE = "Thanks for playing sudoku!";
    public static final String DIFFICULTY = "What difficulty you want to play? (Hard, Med, Easy)";
    public static final String GET_ROW_MOVE = "Enter the row for your next move --> ";
    public static final String GET_COL_MOVE = "Enter the column for your next move --> ";
    public static final String GET_CHART_MOVE = "Enter the number to put in for your move -->";
    public static final String INVALID_ROW_OR_COLUMN = "Your row and column must be from 1 to 9";
    public static final String INVALID_MOVE_ERROR = "Row %d column %d is not a valid move. Please try again";
    public static final String INVALID_NUMBER = "Your number must be from 1 to 9";
    public static final String INVALID_DIFF = "Your difficulty of th egame should be one out of the before listed, please try again";
    public static final String VICTORY = "Good job, you won!";
    public static final String START_NEW_GAME = "Start a new game (Y or N)? --> ";
    
}
