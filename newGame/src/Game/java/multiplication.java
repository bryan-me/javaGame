package Game.java;

import java.util.Random;

import javax.swing.JOptionPane;

public class multiplication {
	
	Random random = new Random();
	int option;
	
	
	void mul() {
		do {
			try{
			int num = random.nextInt(5)+1;
			int num2 = random.nextInt(11)+1;
		int ans = Integer.parseInt(JOptionPane.showInputDialog("What is " + num + " x " + num2));
		
		//int ans = scanner.nextInt();
		int result = num * num2;
		if(ans != result) {
			JOptionPane.showMessageDialog(null, "Aww :( , Wrong Answer"+"\n"+ "The Right Answer Is " + result);
		}else {
			JOptionPane.showMessageDialog(null, "Yaaaaay, Your Answer Is Right :) ");
		}
		option = Integer.parseInt(JOptionPane.showInputDialog("Would you like to continue playing? "+ "\n"+ 
				"1) Yes" +"\n"+
				"0) No"
		));
		if(option == 0 ) {
			JOptionPane.showMessageDialog(null, "We hope you enjoyed the game :) ");
		}else if(option > 1){
			JOptionPane.showMessageDialog(null, "Input not recognized ");
		}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Wrong Input ");
			}
	}while(option != 0 );
		
//		System.out.println();
//		int mul = scanner.nextInt();
//		int result = num * num2;
//		if(mul != result) {
//			System.out.println("Aww :( , Wrong Answer"+"\n"+ "The Right Answer Is " + result);
//		}else {
//			System.out.println("Yaaaaay, Your Answer Is Right :) ");
//		}
}
}
