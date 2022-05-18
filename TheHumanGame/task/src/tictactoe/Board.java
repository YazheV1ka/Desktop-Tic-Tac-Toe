package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    private int countClick = 1;
    JPanel buttonsPanel = new JPanel();
    JPanel labelAndReset = new JPanel();
    Button[] buttons = new Button[9];
    Button reset = new Button("Reset");
    JLabel label = new JLabel();

    private void resetButtons() {
        for (Button button : buttons) {
            button.setText(" ");
            button.setEnabled(true);
        }
        this.label.setText("Game is not started");
        countClick = 1;
    }

    public void matchCheck() {
        if (isXEqual(0, 1, 2)) {
            xWins();
        } else if (isXEqual(3, 4, 5)) {
            xWins();
        } else if (isXEqual(6, 7, 8)) {
            xWins();
        } else if (isXEqual(0, 3, 6)) {
            xWins();
        } else if (isXEqual(1, 4, 7)) {
            xWins();
        } else if (isXEqual(2, 5, 8)) {
            xWins();
        } else if (isXEqual(0, 4, 8)) {
            xWins();
        } else if (isXEqual(2, 4, 6)) {
            xWins();
        } else if (isOEqual(0, 1, 2)) {
            oWins();
        } else if (isOEqual(3, 4, 5)) {
            oWins();
        } else if (isOEqual(6, 7, 8)) {
            oWins();
        } else if (isOEqual(0, 3, 6)) {
            oWins();
        } else if (isOEqual(1, 4, 7)) {
            oWins();
        } else if (isOEqual(2, 5, 8)) {
            oWins();
        } else if (isOEqual(0, 4, 8)) {
            oWins();
        } else if (isOEqual(2, 4, 6)) {
            oWins();
        } else if (countClick == 10){
            draw();
        }

    }

    public boolean isXEqual(int firstNum, int secondNum, int thirdNum) {
        return buttons[firstNum].getText().equals("X") && buttons[secondNum].getText().equals("X") && buttons[thirdNum].getText().equals("X");
    }

    public boolean isOEqual(int firstNum, int secondNum, int thirdNum) {
        return buttons[firstNum].getText().equals("O") && buttons[secondNum].getText().equals("O") && buttons[thirdNum].getText().equals("O");
    }

    public void draw() {
        for (Button button : buttons) {
            button.setEnabled(false);
        }
        label.setText("Draw");
    }
    public void xWins() {
        for (Button button : buttons) {
            button.setEnabled(false);
        }
        label.setText("X wins");
    }

    public void oWins() {
        for (Button button : buttons) {
            button.setEnabled(false);
        }
        label.setText("O wins");
    }

    public Board() {
        setLayout(new BorderLayout());
        this.buttonsPanel.setLayout(new GridLayout(3, 3));

        buttons[0] = new Button("A3");
        buttons[1] = new Button("B3");
        buttons[2] = new Button("C3");
        buttons[3] = new Button("A2");
        buttons[4] = new Button("B2");
        buttons[5] = new Button("C2");
        buttons[6] = new Button("A1");
        buttons[7] = new Button("B1");
        buttons[8] = new Button("C1");
        for (Button button : buttons) {
            button.addActionListener(this);
            this.buttonsPanel.add(button);
            button.setFont(new Font("Comic Sans MS", Font.BOLD, 95));
        }
        add(buttonsPanel, BorderLayout.CENTER);

        this.labelAndReset.setLayout(new BorderLayout());
        label.setName("LabelStatus");
        label.setFont(new Font("Arial", Font.BOLD, 22));
        labelAndReset.add(label, BorderLayout.WEST);
        labelAndReset.add(reset, BorderLayout.EAST);
        reset.addActionListener(this);
        reset.setFocusPainted(false);
        add(labelAndReset, BorderLayout.PAGE_END);

        matchStart();

    }

    private void matchStart() {
        for (Button button : buttons) {
            button.setText(" ");
        }
        reset.setText("Reset");
        reset.setFont(new Font("Courier", Font.BOLD, 20));

        label.setText("Game is not started");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (((JButton) actionEvent.getSource()).getText().equals("Reset")) {
            resetButtons();
        } else if (countClick % 2 != 0 && ((JButton) actionEvent.getSource()).getText().equals(" ")) {
            ((JButton) actionEvent.getSource()).setText("X");
            countClick++;
            label.setText("Game in progress");
            matchCheck();
        } else if (((JButton) actionEvent.getSource()).getText().equals(" ")) {
            ((JButton) actionEvent.getSource()).setText("O");
            countClick++;
            matchCheck();
        }
    }
}