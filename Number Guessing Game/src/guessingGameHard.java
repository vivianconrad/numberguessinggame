import java.util.Scanner;

public class guessingGameHard
	{
		public static void main (String[] args)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! What's your name?");
			String userName = userInput.nextLine();
			System.out.println("Hi " + userName + "!");
			System.out.println("Do you want to play a guessing game?");
			String answer = userInput.nextLine();
			if (answer.equals ("yes"))
				{
					System.out.println("Okay! Let's begin");
				}
			else if (answer.equals("no"))
				{
					System.out.println("Too bad! Let's begin!");
				}
			else if (answer.equals("okay"))
				{
					System.out.println("Awesome!");
				}
			else
				{
					System.out.println("Let's get started.");
				}
			boolean playingGuessingGame = true;
			System.out.println("Would you like to play easy medium or hard?");
			String level = userInput.nextLine();
			if (level.equals("easy"))
				{
					
				}
			while (playingGuessingGame)
				{
					System.out.println("Pick a number from 1-10");
					int secretNumber = (int)(Math.random()*10) +3;
					boolean isStillGuessing = true;
					int counter = 0;
					while (isStillGuessing)
						{
							int guess = userInput.nextInt();
							counter++;
							if (guess>secretNumber)
								{
									System.out.println("Too High!");
									System.out.println("Pick another number");
								}
							else if (guess==secretNumber)
								{
									isStillGuessing = false;
									if (counter==1)
										{
											System.out.println("Wow! You guessed the number in " + counter + " attempt.");
										}
									else if (counter>5)
										{
											System.out.println("Really? It took you " + counter + " attempts. That's mildly dissapointing.");
										}
									else
										{
											System.out.println("You guessed the number in " + counter + " attempts.");
										}
									System.out.println("Play again?");
									Scanner userInput2 = new Scanner (System.in);
									String playAgain = userInput2.nextLine();
										if (playAgain.equals("yes"))
											{
												playingGuessingGame = true;
											}
										else if (playAgain.equals("no"))
											{
												playingGuessingGame=false;
												System.out.println("Thanks for playing " + userName + "!");
											}
										else 
											{
												playingGuessingGame = true;
											}
								}
							else 
								{
									System.out.println("Too Low!");
									System.out.println("Pick another number");
								}
						}
				}
		}
		
	}

