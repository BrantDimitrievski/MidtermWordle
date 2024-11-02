import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller {

    private Game model;
    private View view;
    private String stringInput;
    private static int atRow = -1;

    public Controller(Game model, View view){
        this.model = model;
        this.view = view;
        init();
    }
    public void enterWordToBeGuessed(){
        String stringInput = JOptionPane.showInputDialog("Enter the 5 letter word to be guessed: ").toLowerCase();
        if (stringInput != null && !stringInput.isEmpty() && stringInput.length() == 5) {
            this.stringInput = stringInput;
            model.initGame(stringInput);
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid 5 letter word.");
            enterWordToBeGuessed();
        }
    }

    private void init() {
        enterWordToBeGuessed();

        JButton[][] buttons = view.getButtons();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int row = i;
                int col = j;
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String input = JOptionPane.showInputDialog("Enter a 5 letter word: ").toLowerCase();

                        if (input != null && !input.isEmpty() && input.length() == 5) {
                            atRow += 1;
                                for (int i = 0; i < 5; i++) {
                                    buttons[atRow][i].setText(String.valueOf(input.charAt(i)));
                                    int color = model.updateGame(atRow, i, input.charAt(i));
                                    // set color
                                    if (color == 0) {
                                        buttons[atRow][i].setBackground(Color.green);
                                    }
                                    if (color == 1) {
                                        buttons[atRow][i].setBackground(Color.yellow);
                                    }
                                    if (color == 2) {
                                        buttons[atRow][i].setBackground(Color.darkGray);
                                    }

                                }
                            if (model.checkWin(input)) {
                                // Win game logic
                                JOptionPane.showMessageDialog(null, "You win!");

                            }
                            if (atRow == 4 && !model.checkWin(input)){
                                JOptionPane.showMessageDialog(null, "You lost. Try again :)");
                            }


                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter a valid 5 letter word.");
                        }
                    }
                });
            }
        }
    }
}
