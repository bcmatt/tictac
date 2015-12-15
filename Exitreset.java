import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Exitreset extends JPanel {

private JButton Exit, Reset;
private Tictacboard BBrd;

Exitreset() {
 setLayout(new FlowLayout());
    Exit = new JButton("Exit");
    Reset = new JButton("Reset");
    //exits the program if exit button is pressed
   
Exit.addActionListener(new ActionListener() {
//resets the board if reset button is pressed
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
});
//resets the board if reset button is pressed
 Reset.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent ae) {
            BBrd.Reset();
        }
});
    add(Exit);
    add(Reset);
}
public void SetObject(Tictacboard B) {
    BBrd = B;
		}
}