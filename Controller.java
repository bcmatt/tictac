import java.awt.*;
import javax.swing.*;

public class Controller extends JFrame {



private Tictacboard Board; //Board and Button
private Exitreset XOButtons; // Exit and Reset

Controller() {
	//sets up the game board
    setLayout(new BorderLayout());

    Board = new Tictacboard();
    XOButtons = new Exitreset();
    
    XOButtons.SetObject(Board);
    //Sets the positions of the exit/reset buttons
    add(Board, BorderLayout.CENTER);
    add(XOButtons, BorderLayout.SOUTH);

    setVisible(true);
    setSize(350, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}