package tictactoe;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStatus extends JPanel implements ActionListener{
    JButton reset = new JButton("Reset");
    JLabel label = new JLabel("Im a label");
    public GameStatus() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        add(label);
        add(Box.createHorizontalGlue());
        reset.addActionListener(this);
        add(reset);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (((JButton) actionEvent.getSource()).getText().equals("Reset")) {

        }
    }
}
