import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		int a;
		a = (int) (Math.random() * 100);
		System.out.println("Secret number is: "+ a);
		
		
		Scanner keyboard = new Scanner(System.in);
		int guess = 0;
		int count = 0;
		
		System.out.println("Im thinking of a number, can you guess it?");
		
		while (guess != a){
			guess = keyboard.nextInt();
			count++;
			if (guess > a){
				System.out.println("Lower!");
				}else if (guess < a){
					System.out.println("higher!");
					
				}
		}
		System.out.println("Congrats!  You got the number with " + count + " tries");
		
		

		
			
	}

}
