import java.util.ArrayList;
import java.util.Scanner;
import java.text.*;import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TardisItems extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static 	ArrayList <Tardis> tardis = new ArrayList<Tardis>();
	static String name;
	static JFrame frame = new JFrame();
	static int className;

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
		tardis.add(new Tardis("Earth", "Milky Galaxy", "Humans", 300000, 3, 345));
		}
	
	public static void doIntro()
		{
		Scanner userInput = new Scanner(System.in);
		name = JOptionPane.showInputDialog("Hello there. I'm the Doctor. What is your name?");  
		JOptionPane.showMessageDialog(frame, "Nice to meet you, " + name);
			System.out.println("You are standing in the Tardis right now. It stands for Time and Relative Dimension in Space.");
			System.out.println("It's my time machine & spaceship.");
			
			Object[] options = {"Yes", "No"};
			className = JOptionPane.showOptionDialog(frame, "Would you like to fly away with me?",
					"Your Answer",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options[0]);
			 
			
			switch(className)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "I'm so happy to hear that.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(frame, "That's sad to hear. You have a good life now because you are fantastic. Absolutely fantastic.");
					System.exit(0);
					}
				}
		System.out.println();
		System.out.println("There are two buttons and two levers in front of you.");
		System.out.println("The right and left levers control when we go.");
		System.out.println("The red and blue buttons control where we go.");
		Object[] leversAndButtons = {"Left/Red", "Right/Red", "Left/Blue", "Right/Red"};
		className = JOptionPane.showOptionDialog(frame, "Pick a combination of a lever and a button to pull and press.",
				"Levers and Buttons",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, leversAndButtons, leversAndButtons[0]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			case 3:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			}
			
		}
	
	public static void doRedLeft()
		{
		Scanner userInput = new Scanner(System.in);
		
			int travel = (int)(Math.random()*4)+1;
			switch (travel)
			{
			case 1:
				{
				System.out.println();
				System.out.println("We have landed on " + tardis.get(0).getPlanet() + " in the " + tardis.get(0).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(0).getRace() + " With a population of " + tardis.get(0).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(0).getPlanetAge() + " years old. We are in the year " + tardis.get(0).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the sky... I've never seen it so dark and gloomy.");
				System.out.println("We have to go find out what the problem is here.");
			
				final String[] genre = { "Left", "Right"};

					{
					final JFrame frame = new JFrame();
				    String decicion = (String) JOptionPane.showInputDialog(frame, 
				            "Should we go Left or Right?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            genre, 
				            genre[0]);
				    JOptionPane.showMessageDialog(frame, "Good choice. Let's go.");	
					}
				
				System.out.println("Look what I found! It seems to be a Vortex Manipulator... Why would it be here?");
				System.out.println("This must be what is messing with the sky!!!");
				System.out.println("You see, this vortex manipulator is continuously sending messages to the clouds wanted to get out of this time zone.");
				System.out.println("If I can just find a way to cut off this signal, I think I would be able to fix the sky!");
				
				final String[] choice = { "OH HECK YES!!", "You should try again"};

					{
					final JFrame frame = new JFrame();
				    String decision = (String) JOptionPane.showInputDialog(frame, 
				            "I can't find a way to stop it, would you like to try?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            choice, 
				            choice[0]);
				    
				    switch(decision)
				    	{
				    	case "OH HECK YES!!":
				    		{
							    JOptionPane.showMessageDialog(frame, "Wow! look at that! you cut off the signal!");
				    		}
				    	
				    	case "You should try again":
				    		{
							    JOptionPane.showMessageDialog(frame, "Okay. I think I got it!");		
				    		}
				    		
				    	}
					}
				
				System.out.println();
				System.out.println("And look at that. The sky is going back to normal.");
				System.out.println("Thank you for coming with me, I'll take you back home now.");
				
				doRepeat();
				break;
				
				}
			
			case 2:
				{
				System.out.println();
				System.out.println("We have landed on " + tardis.get(1).getPlanet() + " in the " + tardis.get(1).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(1).getRace() + " With a population of " + tardis.get(1).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(1).getPlanetAge() + " years old. We are in the year " + tardis.get(1).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the ground. It feels so angry.");
				System.out.println("We have to go find out what the problem is here.");
			
				final String[] genre = { "Left", "Right"};

					{
					final JFrame frame = new JFrame();
				    String decicion = (String) JOptionPane.showInputDialog(frame, 
				            "Should we go Left or Right?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            genre, 
				            genre[0]);
				    JOptionPane.showMessageDialog(frame, "Good choice. Let's go.");
					}
				
				System.out.println("Look! Over there! It seems to be slime of some sort... tastes like Nestene Slime.");
				System.out.println("I fought this species once. They were trying to control all of the plastic in London. I destroyed them.");
				System.out.println("Lets go underground, that's usually where they live.");
				System.out.println();
				System.out.println("Look! Over there! It's the Nestene Monster! We have to talk him into leaving, and that will make the ground much happier..");
				
				final String[] choice = { "Yeah, sure.", "Nah, i'll let you take this one"};

					{
					final JFrame frame = new JFrame();
				    String decision = (String) JOptionPane.showInputDialog(frame, 
				            "Would you like to try and convince him?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            choice, 
				            choice[0]);
				    
				    switch(decision)
			    	{
			    	case "Yeah, sure.":
			    		{
						    JOptionPane.showMessageDialog(frame, "Wow! look at that! you convinced him to leave!");
			    		}
			    	
			    	case "Nah, i'll let you take this one":
			    		{
						    JOptionPane.showMessageDialog(frame, "Okay. I'll do it");		
						    JOptionPane.showMessageDialog(frame, "I convinved him to leave!");		
			    		}
			    		
			    	}
					}
				
				System.out.println();
				System.out.println("And look at that. The ground is going back to normal.");
				System.out.println("Thank you for coming with me, I'll take you back home now.");
				
				doRepeat();	
				break;
				}
				
			
			case 3:
				{
				System.out.println();
				System.out.println("We have landed on " + tardis.get(2).getPlanet() + " in the " + tardis.get(2).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(2).getRace() + " With a population of " + tardis.get(2).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(2).getPlanetAge() + " years old. We are in the year " + tardis.get(2).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the city over there. I hear such chaos.");
				System.out.println("We have to go find out what the problem is here.");
			
				final String[] genre = { "Left", "Right"};

					{
					final JFrame frame = new JFrame();
				    String decicion = (String) JOptionPane.showInputDialog(frame, 
				            "Should we go Left or Right?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            genre, 
				            genre[0]);
				    JOptionPane.showMessageDialog(frame, "Good choice. Let's go.");
					}
				
				System.out.println("Look! Over there! There seems to be a riot! Let's go find out why!");
				System.out.println("Excuse me sir! What's with all the chaos?");
				System.out.println("Townsman: \"The mayor has declared that we will no longer be free, but enslaved!!\"");
				System.out.println("What?! That's crazy! He can't do that!");
				System.out.println("Come on, " + name + " we have to go fix this.");
				System.out.println();
				System.out.println("I think the mayor is under someone else's control, because why else would he enslave his own people?!");
				System.out.println("Let's go back to the TARDIS and see if there are any other aliens besides us here.");
				System.out.println();
				System.out.println("And look at that. There is. It says there is a Sontaran ship in the atmosphere.");
				System.out.println("Would you lke to try and convice them to leave, or would you like me to?");
			
				final String[] choice = { "You convince them", "I'll convince them"};

					{
					final JFrame frame = new JFrame();
				    String decision = (String) JOptionPane.showInputDialog(frame, 
				            "Would you lke to try and convice them to leave, or would you like me to?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            choice, 
				            choice[0]);
				    
				    switch(decision)
			    	{
			    	case "You convinve them":
			    		{
						    JOptionPane.showMessageDialog(frame, "Wow! look at that! you convinced them to leave!");
			    		}
			    	
			    	case "I'll convince them":
			    		{
						    JOptionPane.showMessageDialog(frame, "Okay. I'll do it");		
						    JOptionPane.showMessageDialog(frame, "I convinved them to leave!");		
			    		}
			    		
			    	}
					}
					
				System.out.println("And look at that! they're leaving!");
				
				System.out.println();
				System.out.println("Thank you for coming with me, I'll take you back home now.");
				
				doRepeat();
				break;
				}
			
			case 4:
				{
				System.out.println();
				System.out.println("We have landed on " + tardis.get(3).getPlanet() + " in the " + tardis.get(3).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(3).getRace() + " With a population of " + tardis.get(3).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(3).getPlanetAge() + " years old. We are in the year " + tardis.get(3).getTime() + ".");
				System.out.println();
				
				System.out.println("There seems to be something wrong with the atmosphere. It has a deficiency of oxygen.");
				System.out.println("We have to go find out what the problem is here.");
			
				final String[] genre = { "Left", "Right"};

					{
					final JFrame frame = new JFrame();
				    String decicion = (String) JOptionPane.showInputDialog(frame, 
				            "Should we go Left or Right?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            genre, 
				            genre[0]);
				    JOptionPane.showMessageDialog(frame, "Good choice. Let's go.");
					}				
				
				System.out.println("Look! Up There! It looks like a giant spaceship!!");
				System.out.println("Let's go up there to see what the problem is here.");
				System.out.println();
				System.out.println("Hello. I'm the Doctor. What is your name?");
				System.out.println("Alien: \"My name is General Duchestard of the Galactic Empire.\"");
				System.out.println("I believe your engines are disrupting the air flow of this planet. Can I ask you to leave?");
				System.out.println("General: \"No. I am well needed here and I will never leave this planet.\"");
				System.out.println();
				System.out.println("We have to destroy his ship's engines or this planet will die of oxygen starvation.");
				System.out.println("One of us needs to distract him while the other destroyes the engine.");
				
				final String[] choice = { "Distract him", "Destroy the ship"};

					{
					final JFrame frame = new JFrame();
				    String decision = (String) JOptionPane.showInputDialog(frame, 
				            "Which would you like to do?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            choice, 
				            choice[0]);
				    
				    switch(decision)
			    	{
			    	case "Distract him":
			    		{
						    JOptionPane.showMessageDialog(frame, "Okay, Keep him busy. Run when you hear a bang!");
			    		}
			    	
			    	case "Destroy the ship":
			    		{
						    JOptionPane.showMessageDialog(frame, "Okay. Go Bang on things and hope for the best. That's what I do.");
			    		}
			    		
			    	}
					}
				
				System.out.println("The ship blew up. This planet will now live a long and happy life.");
				
				System.out.println();
				System.out.println("Thank you for coming with me, I'll take you back home now.");
				
				doRepeat();
				break;
				}
			case 5:
				{
				System.out.println();
				System.out.println("We have landed on " + tardis.get(4).getPlanet() + " in the " + tardis.get(4).getLocation() + ".");
				System.out.println("The race is the " + tardis.get(4).getRace() + " With a population of " + tardis.get(4).getPopulation() + ".");
				System.out.println("This planet is " + tardis.get(4).getPlanetAge() + " years old. We are in the year " + tardis.get(4).getTime() + ".");
				System.out.println();
				
				System.out.println("There is a problem here. there should only be a population of 2... us");
				System.out.println("But there is one other life form here that shouldn't even be existing yet.");
				System.out.println("There must be something wrong with the time vortex.. it must've pulled a life form to here by accident.");
				System.out.println("We have to find it and return it to it's natural place in time.");
				
				final String[] genre = { "Left", "Right"};

					{
					final JFrame frame = new JFrame();
				    String decicion = (String) JOptionPane.showInputDialog(frame, 
				            "Should we go Left or Right?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            genre, 
				            genre[0]);
				    JOptionPane.showMessageDialog(frame, "Good choice. Let's go.");
					}
				
				System.out.println();
				System.out.println("Look!! That's a cow... but why is it in the 3rd year of Earth's existence? it's still forming.");
				System.out.println("We have to capture the cow and get it to the TARDIS before it suffocates in this atmosphere.");
				
				final String[] choice = { "You", "me"};

					{
					final JFrame frame = new JFrame();
				    String decision = (String) JOptionPane.showInputDialog(frame, 
				            "Would you like to corral him, or should I?",
				            "Your Choice",
				            JOptionPane.QUESTION_MESSAGE, 
				            null, 
				            choice, 
				            choice[1]);
				    
				    switch(decision)
			    	{
			    	case "You":
			    		{
						    JOptionPane.showMessageDialog(frame, "Okay, Distract him and I will grab him.");
			    		}
			    	
			    	case "Me":
			    		{
						    JOptionPane.showMessageDialog(frame, "Okay. I'll distract him and you just grab him.");
			    		}
			    		
			    	}
					}
					
				System.out.println();
				System.out.println("Wow, I can't believe we actually pulled this off. Lets get him home.");
				
				System.out.println();
				System.out.println("Thank you for coming with me, I'll take you back home now.");
				
				doRepeat();
				break;
				}
			}
		
			}
	
	public static void doRepeat()
		{
			System.out.println("We are back where we first left, 3 minutes after we left.");
			System.out.println("I had fun with you. Would you like to come on another adventure?");
			System.out.println();
			
			Object[] options = {"Yes", "No"};
			className = JOptionPane.showOptionDialog(frame, "Would you like to fly away with me?",
					"Your Answer",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options[0]);
			 
			
			switch(className)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(frame, "I'm so happy to hear that.");
					break;
					}
				case 1:
					{					
					Object[] choice = {"Yeah, why not?", "Nah, I'm good"};
					className = JOptionPane.showOptionDialog(frame, "Would you like to play a game with me before you go??",
							"Your Answer",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.QUESTION_MESSAGE,
							null, choice, choice[0]);
					 
					switch(className)
						{
						case 0:
							{
							JOptionPane.showMessageDialog(frame, "I'm so happy to hear that.");
							TardisGame.gameIntro();
							break;
							}
						case 1:
							{
							JOptionPane.showMessageDialog(frame, "That's sad to hear. You have a good life now because you are fantastic. Absolutely fantastic.");
							System.exit(0);
							}
						}
					
					System.exit(0);
					}
				}
		
		System.out.println("There are two buttons and two levers in front of you.");
		System.out.println("The right and left levers control when we go.");
		System.out.println("The red and blue buttons control where we go.");
		Object[] leversAndButtons = {"Left/Red", "Right/Red", "Left/Blue", "Right/Red"};
		className = JOptionPane.showOptionDialog(frame, "Pick a combination of a lever and a button to pull and press.",
				"Levers and Buttons",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, leversAndButtons, leversAndButtons[0]);
		 
		
		switch(className)
			{
			case 0:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			case 1:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			case 2:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			case 3:
				{
				JOptionPane.showMessageDialog(frame, "That's a good choice.");
				doRedLeft();
				break;
				}
			}
		}
	}
	
	
