package tictactoe;

import javax.swing.*;
import java.awt.*;


public class Board extends JPanel {

    public final int SCREEN_WIDTH = 450;
    public final int SCREEN_HEIGHT = 450;

    public Board() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.DARK_GRAY);
        this.setDoubleBuffered(true);
        this.setFocusable(true);
        this.setLayout(new GridLayout(3, 3));
        setButtons();
    }

    private void setButtons() {
        for (int r = 3; r > 0; r--) {
            for (char c = 'A'; c <= 'C'; c++) {
                JButton button = new JButton("" + c + r);
                button.setName("Button" + c + r);
                button.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
                add(button);
            }
        }
    }


}
