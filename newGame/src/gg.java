import java.util.Random;
import java.util.Scanner;

public class gg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int num = random.nextInt(10);
		int num2 = random.nextInt(5);
		int result = num - num2;
		System.out.println("Fill in the missing number");
		System.out.println(num + " - ___ = " + result);
		int ans;
		ans = scanner.nextInt();
		if(ans != num2) {
			System.out.println("Wrong answer" + "\n" + "The right answer is " + num2);
		}else {
			System.out.println("Answer is right!!");
		}
	
	}
}
