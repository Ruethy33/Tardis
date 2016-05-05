import java.util.ArrayList;
import java.util.Scanner;
import java.text.*;

public class TardisItems
	{
	static 	ArrayList <Tardis> tardis = new ArrayList<Tardis>();
	static String name;
	
	public static void main(String[] args)
		{
		doAddItems();
		doIntro();
		}
	
	public static void doAddItems()
		{
		tardis.add(new Tardis("Raxacoricofallapatorius", "Mutter's Spiral", "Raxacoricofallapatorians", 125, 17000, 2380));
		tardis.add(new Tardis("Gallifrey", "Kasterborous Galaxy", "Time Lords", 12000, 25000000, 2016));
		tardis.add(new Tardis("Apalapucia", "Hubstrota Galaxy", "Apalapucians", 87, 752890, 5690));
		tardis.add(new Tardis("New Earth", "Galaxy m87", "Humans", 346, 854678, 500000023));
		}
	
	public static void doIntro()
		{
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Hello. I'm the Doctor. What's your name?");
			name = userInput.nextLine();
			System.out.println("Nice to meet you " + name);
			System.out.println("You are standing in the Tardis right now. It stands for Time and Relative Dimension in Space.");
			System.out.println("It's my time machine & spaceship. Would you like to fly away with me?");
			String answer = userInput.nextLine();
			if(answer.equalsIgnoreCase("yes"))
				{
					System.out.println("That's good to hear.");
					System.out.println("There are two buttons in front of you to control when we go, and two levers to control where.");
					System.out.println("There is a red and blue button and a left and right lever.");
					System.out.println("Push one and pull one of each and we'll see where we end up.");
					System.out.println("Say the color of button followed by which lever you would like to pull.");
					String answer2 = userInput.nextLine();
		
					if(answer2.equalsIgnoreCase("red left"))
						{
							doRedLeft();
						}
		
					else if(answer2.equalsIgnoreCase("red right"))
						{
							doRedLeft();
						}
		
					else if(answer2.equalsIgnoreCase("blue left"))
						{
							doRedLeft();
						}
					
					else if(answer2.equalsIgnoreCase("blue right"))
						{
							doRedLeft();
						}
				}
			else
				{
					System.out.println("That's sad to hear. You have a good life now. Because you are fantastic. Absolutely Fantastic.");
				}
		}
	
	public static void doRedLeft()
		{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Good coice.");
			int travel = (int)(Math.random()*4)+1;
			switch (travel)
			{
			case 1:
				{
				System.out.println("We have landed on " + tardis.get(0).getPlanet() + " in the " + tardis.get(0).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(0).getRace() + " With a population of " + tardis.get(0).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(0).getPlanetAge() + " years old. We are in the year " + tardis.get(0).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the sky... I've never seen it so dark and gloomy.");
				System.out.println("We have to go find out what the problem is here.");
			
				System.out.println("Should we go left or right? Type 1 or 2.");
				System.out.println("1) Left");
				System.out.println("2) right");

				int choice = userInput.nextInt();
				if(choice == 1)
					{
						
					}
				else if(choice == 2)
					{
						
					}
				
				break;
				}
			
			case 2:
				{
				System.out.println("We have landed on " + tardis.get(1).getPlanet() + " in the " + tardis.get(1).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(1).getRace() + " With a population of " + tardis.get(1).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(1).getPlanetAge() + " years old. We are in the year " + tardis.get(1).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the ground. It feels so angry.");
				System.out.println("We have to go find out what the problem is here.");
			
				System.out.println("Should we go left or right? Type 1 or 2.");
				System.out.println("1) Left");
				System.out.println("2) right");

				int choice = userInput.nextInt();
				if(choice == 1)
					{
						
					}
				else if(choice == 2)
					{
						
					}
				break;
				}
			
			case 3:
				{
				System.out.println("We have landed on " + tardis.get(2).getPlanet() + " in the " + tardis.get(2).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(2).getRace() + " With a population of " + tardis.get(2).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(2).getPlanetAge() + " years old. We are in the year " + tardis.get(2).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the city over there. I hear such chaos.");
				System.out.println("We have to go find out what the problem is here.");
			
				System.out.println("Should we go left or right? Type 1 or 2.");
				System.out.println("1) Left");
				System.out.println("2) right");

				int choice = userInput.nextInt();
				if(choice == 1)
					{
						
					}
				else if(choice == 2)
					{
						
					}
				break;
				}
			
			case 4:
				{
				System.out.println("We have landed on " + tardis.get(3).getPlanet() + " in the " + tardis.get(3).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(3).getRace() + " With a population of " + tardis.get(3).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(3).getPlanetAge() + " years old. We are in the year " + tardis.get(3).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the atmosphere. It has a deficiency of oxygen thatv is much needed to survive..");
				System.out.println("We have to go find out what the problem is here.");
			
				System.out.println("Should we go left or right? Type 1 or 2.");
				System.out.println("1) Left");
				System.out.println("2) right");

				int choice = userInput.nextInt();
				if(choice == 1)
					{
						
					}
				else if(choice == 2)
					{
						
					}
				break;
				}
			}
			
			}
		}
	
	
