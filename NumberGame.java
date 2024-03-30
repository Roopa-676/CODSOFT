import java.util.Scanner;
public class NumberGame {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			boolean status=false;
			System.out.println("                             --------------------------------------------");
			System.out.println();
			System.out.println("                                         NUMBER GUESSING GAME            ");
			System.out.println();
			System.out.println("                              -------------------------------------------");
			System.out.println();
			System.out.println(" Instructions:");
			System.out.println();
			System.out.println("    1) A Random numbercan be created by the System that should be in hide.");
			System.out.println("    2) You are asked to enter number from 1 to 100.");
			System.out.println("    3) If you entered number or guess is correct your score will be displayed with the number of attempts.");
			System.out.println("    4) If you guessed wrong either it will show Too high or Too low.");
			System.out.println("    5) Initial score will be given.");
			System.out.println("    6) Keep track of your score. For each incorrect guess, points will be deducted.");
			System.out.println("    7) You have 7 (seven) attempts to guess the number.");
			System.out.println();
			System.out.println("     Are you Ready ? Let's dive in and have some fun !");
			System.out.println();
			boolean exit=false;
			boolean enter=true;
			while(!exit) {
				System.out.println("   1) Guess ");
				System.out.println("   2) Exit ");
				System.out.println();
				System.out.print("   Enter your choice :");
				int choice=sc.nextInt();
				System.out.println();
			
				switch(choice) { 
				case 1:
					while(enter) {
						int secretnumber=(int)(Math.random()*100)+1;
						int option=0;
						int guess=0;
						int attempts=0;
						int initialscore=100;
						System.out.println("     Try to Guess the Number between 1 and 100.");
						System.out.println("     Intial Score : "+initialscore);
						System.out.println();
						while(attempts<7) {
							System.out.print("     Guess the Number : ");
							guess=sc.nextInt();
							attempts++;
							if(0>guess || 100<guess) {
								System.out.println("     Invalid Guess.Please enter a number between 1 and 100.");
								continue;
							}
							if(guess > secretnumber) {
								System.out.println("    Too High! But don't give up, you're getting closer! ");
								initialscore-=5;
								System.out.println("    Updated score : "+initialscore+" points");
								System.out.println();
							}
							else if(secretnumber>guess) {
								System.out.println("    Little Low! Keep pushing, you're on the right track!");
								initialscore-=3;
								System.out.println("    Updated score : "+initialscore+" points");
								System.out.println();
							}
							else {
								System.out.println("    Congratulations! You did it! You guessed the number!");
								status=true;
								System.out.println("    Attempts = "+attempts);
								System.out.println("    Your Overall Score = "+initialscore+" points");
								System.out.println();
								break;
							}
						}
						if(attempts==7 || status==true) {
							if(attempts==7) {
								System.out.println("\n      The Secret number is "+secretnumber);
								System.out.println("       You are failed!\n");
							}

							attempts=0;
							System.out.println("     1) Play Again\n"+"     2)Exit\n");
							option=sc.nextInt();

							if(option==1) {
								break;
							}
							if(option==2) {
								exit=true;
								break;
							}
						}
					}
						break;
				case 2:
				   exit=true;
				   break;
				default:
					System.out.println("    Invalid choice.Please enter the correct choice!");
					System.out.println();
					}
				}
			}
			
		System.out.println("                                 !!! GAME OVER !!!");
	}

}
