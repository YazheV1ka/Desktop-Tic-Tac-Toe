package tictactoe;

import javax.swing.*;
import java.awt.*;

public class Board extends JButton {
    GridLayout gridLayout =  new GridLayout(3,3);

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    JButton buttonA1 = new JButton("A1");
    JButton buttonA2 = new JButton("A2");
    JButton buttonA3 = new JButton("A3");
    JButton buttonB1 = new JButton("B1");
    JButton buttonB2 = new JButton("B2");
    JButton buttonB3 = new JButton("B3");
    JButton buttonC1 = new JButton("C1");
    JButton buttonC2 = new JButton("C2");
    JButton buttonC3 = new JButton("C3");

}
