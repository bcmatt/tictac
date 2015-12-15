import java.awt.*;
import javax.swing.*;

public class Controller extends JFrame {
	//Board and Button
	private Tictacboard Board; 
	// Exits and resets board
	private Exitreset XOButtons; 
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