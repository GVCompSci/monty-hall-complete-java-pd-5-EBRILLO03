import java.util.Random;
import java.util.Scanner;

public class MontyHallPart3  {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int answerDoor;
		int userDoor;
		int goatDoor;
		int  switchDoor;
		int numOfWins;
		answerDoor = rand.nextInt(3) + 1;
		goatDoor = 0;
		switchDoor = 0;
		numOfWins = 0;
		userDoor = rand.nextInt(3) + 1;
		System.out.println("How many rounds of the game should be simulated: ");
		int numTimes = input.nextInt();
		while (numTimes < 10 || numTimes > 10000) 
		{
			System.out.println("Must enter a number between 10 and 10000");
			System.out.println("How many rounds of the game should be simulated: ");
			numTimes = input.nextInt();
		}
		System.out.println("Should the player switch or stay? ");
		String answer = input.next();
		while (!(answer.equals("switch") || answer.equals("stay")))
		{
			System.out.println("Must enter either switch or stay");
			System.out.println("Should the player switch or stay? ");
			answer = input.next();
		}
	


		for (int i = 0; i < numTimes; i ++)
		{
			if (userDoor == answerDoor && answer.equals("switch"))
			{
				if (userDoor == 1)
				{
					goatDoor = 2;
					switchDoor = 3;
					userDoor = switchDoor;
					if (userDoor == answerDoor) 
					{
						
						numOfWins += 1;
					}
					
					
				}
				else if (userDoor ==2)
				{
					goatDoor = 3;
					switchDoor = 1;
					userDoor = switchDoor;
					if (userDoor == answerDoor) 
					{
						numOfWins += 1;
					}
					
				}
				else 
				{
					goatDoor = 1;
					switchDoor = 2;
					userDoor = switchDoor;
					if (userDoor == answerDoor) 
					{
						numOfWins += 1;
					}
					
				}
			}
			else if (userDoor == answerDoor && answer.equals("stay"))
			{
				if (userDoor == 1)
				{
					goatDoor = 2;
					switchDoor = 3;
					userDoor = switchDoor;
					if (userDoor == answerDoor) 
					{
						numOfWins += 1;
					}
			}
					
				}
				else if (userDoor ==2)
				{
					goatDoor = 3;
					switchDoor = 1;
					userDoor = switchDoor;
					if (userDoor == answerDoor) 
					{
						numOfWins += 1;
					}
					
				}
				else 
				{
					goatDoor = 1;
					switchDoor = 2;
					userDoor = switchDoor;
					if (userDoor == answerDoor) 
					{
						numOfWins += 1;
					}
					
				}
			}
			 if (userDoor != answerDoor && answer.equals("switch"))
				if (userDoor == 1 && answerDoor == 2)
				{
					goatDoor = 3;
					switchDoor = 2;
					
				}
				else if (userDoor == 1 && answerDoor == 3)
				{
					goatDoor = 2;
					switchDoor = 3;
				
				}
				else if (userDoor == 2 && answerDoor == 1)
				{
					goatDoor = 3;
					switchDoor = 1;
					
				}
				else if (userDoor == 2 && answerDoor == 3)
				{
					goatDoor = 1;
					switchDoor = 3;
					
				}
				else if (userDoor == 3 && answerDoor == 1)
				{
					goatDoor = 2;
					switchDoor = 1;
				
				}
				else if (userDoor == 3 && answerDoor == 2)
				{
					goatDoor = 1;
					switchDoor = 2;
					
				}

			}
		
		{
			
		}
		
		}

	

		
