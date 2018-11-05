import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame
	{
		public static void main (String[] args)
		{
			//Name assumption
			Scanner userInput = new Scanner(System.in);
			System.out.println("Well hello there, I bet I can guess your name.");
			Random generate = new Random();
		    String[] randomName = {"John", "Tim", "Susan", "Henry", "Sarah", "Amy"};
		    System.out.println("Is your name " + randomName[generate.nextInt(4)]);
		    String nameRan = userInput.nextLine();
		    System.out.println("Oh. Are you sure?");
		    String nameRando = userInput.nextLine();

		    //Actually asking name
		    System.out.println("What is your name then?");
			String userName = userInput.nextLine();
			System.out.println("Fine. Hi '" + userName + "'.");
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
			//Guessing Game
			boolean playingGuessingGame = true;
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
									System.out.println("Too High! Maybe set your sights a little lower");
									System.out.println("Pick another number");
								}
							else if (guess==secretNumber)
								{
									isStillGuessing = false;
									if (counter==1)
										{
											System.out.println("You guessed the number in " + counter + " attempt. *Slow clap like I'm impressed*");
										}
									else if (counter>7)
										{
											System.out.println("Really? It took you " + counter + " attempts. That's mildly dissapointing.");
										}
									else if (counter<5)
										{
											System.out.println(counter + " attempts! Impressive, I suppose.");
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
												System.out.println("Thanks for playing " + userName + ". Go do something more entertaining, I guess.");
											}
										else 
											{
												playingGuessingGame = true;
											}
								}
							else 
								{
									System.out.println("Too Low! You can set your goals a little higher");
									System.out.println("Pick another number");
								}
						}
				}
		}
		
	}
