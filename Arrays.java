import javax.swing.*;
public class Arrays {
//Array for board and buttons
private Tictacboard BBrd;
private int GameArray[][];


Arrays(Tictacboard B) {
    GameArray = new int[3][3];
    BBrd = B;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            GameArray[i][j] = 0;
        }
    }
}
public void ArrayInitialize(int i, int j, int Marker) {
    //Set Data sent by Action listener in Board
    GameArray[i][j] = Marker;
    WinCheck(Marker);
}
public void WinCheck(int Marker) {
	//Win checker from http://www.javascriptkit.com/script/script2/tactoe.shtml
    //If the array contains a certain marker then the player will be declared winner
if ((GameArray[0][0] == Marker && GameArray[0][1] == Marker && GameArray[0][2] == Marker) || (GameArray[1][0] == Marker && GameArray[1][1] == Marker && GameArray[1][2] == Marker) || (GameArray[2][0] == Marker && GameArray[2][1] == Marker && GameArray[2][2] == Marker)) {
        if (Marker == 1) {
            JOptionPane.showMessageDialog(BBrd, "Player 1 (Wins)");
        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(BBrd, "Player 2 (Wins)");
        }
        BBrd.Disablebuttons(false);
} else if ((GameArray[0][0] == Marker && GameArray[1][0] == Marker && GameArray[2][0] == Marker) || (GameArray[0][1] == Marker && GameArray[1][1] == Marker && GameArray[2][1] == Marker) || (GameArray[0][2] == Marker && GameArray[1][2] == Marker && GameArray[2][2] == Marker)) {
        if (Marker == 1) {
            JOptionPane.showMessageDialog(BBrd, "Player 1 (Wins)");
        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(BBrd, "Player 2 (Wins)");
        }
        BBrd.Disablebuttons(false);
} else if ((GameArray[0][0] == Marker && GameArray[1][1] == Marker && GameArray[2][2] == Marker) || (GameArray[2][0] == Marker && GameArray[1][1] == Marker && GameArray[0][2] == Marker)) {
        if (Marker == 1) {
            JOptionPane.showMessageDialog(BBrd, "Player 1 (Wins)");
        } else if (Marker == 2) {
            JOptionPane.showMessageDialog(BBrd, "Player 2 (Wins)");
        }
        BBrd.Disablebuttons(false);
    	}
	}
}