import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tictacboard extends JPanel implements ActionListener {

private JButton B1, B2, B3, B4, B5, B6, B7, B8, B9; // Buttons
private Arrays GArray; // Class with Array
//This determines current players turn if it is false it is player ones turn 
//if true it is player twos turn
private boolean Player = false;
private int PlayerMark = 1;
//board from http://p5js.org/examples/examples/Simulate_Game_of_Life.php
Tictacboard() {
    // creates the panel
    setLayout(new GridLayout(3, 3));
    //creates buttons
    JButton[] buttons = new JButton[9];
    for (int i=0; i < buttons.length; i++) {
        buttons[i] = new JButton("");
    }
    for (int i=0; i < buttons.length; i++) {
        add(buttons[i]);    
        buttons[i].addActionListener(this);
    }    
}
public void SetGame() {
	//Sets the game
    GArray = new Arrays(this);   
    Disablebuttons(true);
    Player = false; // default Value
    PlayerMark = 1; // default Value
}
public void Reset() {
//resets game
    SetGame(); 
}
public void actionPerformed(ActionEvent E) {

    JButton Pressed = (JButton) E.getSource();
    //Button pressed goes to the Array class
    //changes turn when a JButton is pressed
 for (int button = 0; button <= 8; button++) {
        JButton[] buttons = null;
		if (Pressed == buttons[button]) {
            GArray.ArrayInitialize(button / 3, button % 3, PlayerMark);
            SetText(Pressed, Player);
            PlayerMark = SwitchTurn(Player);
            ButtonDisabler(Pressed);
        }
    }
}
//switches the boolean to control the turns
public int SwitchTurn(boolean last) {
    Player = !last;
    if (last) {
        return 1;
    } else {
        return 2;
    }
}
public void ButtonDisabler(JButton Btn) {
    Btn.setEnabled(false); // Disable Button
}
public void Disablebuttons(boolean Opp) {

    // Disable Buttons
    B1.setEnabled(Opp);
    B2.setEnabled(Opp);
    B3.setEnabled(Opp);
    B4.setEnabled(Opp);
    B5.setEnabled(Opp);
    B6.setEnabled(Opp);
    B7.setEnabled(Opp);
    B8.setEnabled(Opp);
    B9.setEnabled(Opp);
}
public void SetText(JButton Btn, boolean Play) {

    if (Play == true) {
        Btn.setText("O");
    } else if (Play == false) {
        Btn.setText("X");
    	}
	}
}