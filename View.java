import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JButton[][] buttons;

    private int n = 5;

    public View() {

        frame = new JFrame("Magic Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(n, n));

        buttons = new JButton[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 20));
                buttons[i][j].setBackground(Color.white);
                frame.add(buttons[i][j]);
            }
        }
        frame.setVisible(true);
    }

    public JButton[][] getButtons() {
        return buttons;
    }
}
