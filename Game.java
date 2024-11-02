import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    private char[][] gameBoard;

    private String stringInput;
    public Game() {
        gameBoard = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }
    public void initGame(String stringInput){
        this.stringInput = stringInput;
    }

    public int updateGame(int row, int col, char a){

        // Copy the answer into an ArrayList
        ArrayList inputArr = new ArrayList<Character>(5);
        for(int i = 0; i < 5; i++) {
            inputArr.add(stringInput.charAt(i));
        }

        // copy the char into the row,col of GameBoard
        gameBoard[row][col] = a;

        // yellow: check if char is same char as in word
        if(inputArr.contains(gameBoard[row][col])){
            //green: check if char is same char and same position
            if(gameBoard[row][col] == stringInput.charAt(col)){
                return 0; //green
            }
            return 1; //yellow
        }

        return 2; // else grey
    }

    public boolean checkWin(String userInput){
        if(userInput.equals(stringInput)){
            return true;
        }
        return false;
    }


    public int getCell(int x, int y){
        if (x < 0 || x >= 5 || y < 0 || y >= 5) {
            throw new IllegalArgumentException("Cell indices are out of bounds.");
        }
        return gameBoard[x][y];
    }
}
