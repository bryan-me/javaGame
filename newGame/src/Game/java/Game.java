package Game.java;

import javax.swing.JOptionPane;

public class Game{
	public static void main(String[] args) {
		int game;
		addition add = new addition();
		subtraction sub = new subtraction();
		mathGuess guess = new mathGuess();
		multiplication mul = new multiplication();
		
		JOptionPane.showMessageDialog(null, "GROUP B ARITHMETIC GAME" + "\n" + "This game helps build the arithmetic skils of kids");
		try {
		game = Integer.parseInt(JOptionPane.showInputDialog(
						"SELECT A GAME" +"\n" +
						"1) Guess The Next Number" +"\n"+
						"2) Addition" +"\n"+
						"3) Subtraction" +"\n"+
						"4) Multiplication" 
		));	
		//NUMBER GUESS METHOD 
		if (game == 1) {
			guess.guess();
			//ADDITION 
		}else if(game == 2) {
			add.add();
		}
		//SUBTRACTION
		else if(game == 3) {
			sub.sub();
		}
		//MULTIPLICATION
		else if(game == 4) {
			mul.mul();
		}else {
			JOptionPane.showMessageDialog(null, "Input Not Recognized");
		}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Wrong Input ");
		}

}
}
