package Game.java;

import java.util.Random;
import javax.swing.JOptionPane;

public class mathGuess {
	Random random = new Random();
	int option;
	
	void guess(){
		//JOptionPane.showMessageDialog(null, "Welcome to Our Game");
		Random random = new Random();
		int num = 0;
		

		do {
			try {
		
			num = random.nextInt(20);
		int guessNum = Integer.parseInt(JOptionPane.showInputDialog("What is the next number after " + num));
		
		if(guessNum != ++num) {
			JOptionPane.showMessageDialog(null, "Aww :( , Wrong Answer"+"\n"+ "The Right Answer Is " + num++);
		}else {
			JOptionPane.showMessageDialog(null, "Yaaaaay, Your Answer Is Right :) ");
		}
		option = Integer.parseInt(JOptionPane.showInputDialog("Would you like to continue playing? "+ "\n"+ 
				"1) Yes" +"\n"+
				"0) No"
		));	if(option == 0 ) {
			JOptionPane.showMessageDialog(null, "We hope you enjoyed the game :) ");
		}else if(option > 1){
			JOptionPane.showMessageDialog(null, "Input not recognized ");
		}}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Wrong Input ");
		}

	}while(option != 0 );
	}
}
