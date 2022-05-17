package tictactoe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame {
    public TicTacToe() {
        Board board =  new Board();
        JFrame frameObj = new JFrame();
        frameObj.add(board.buttonA3);
        frameObj.add(board.buttonB3);
        frameObj.add(board.buttonC3);
        frameObj.add(board.buttonA2);
        frameObj.add(board.buttonB2);
        frameObj.add(board.buttonC2);
        frameObj.add(board.buttonA1);
        frameObj.add(board.buttonB1);
        frameObj.add(board.buttonC1);


        frameObj.setLayout(new GridLayout(3,3));
        frameObj.setSize(300,300);
        frameObj.setVisible(true);
        frameObj.setTitle("Tic Tac Toe");

    }
}

