import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TardisGame extends JFrame implements KeyListener
	{
	static int bet;
	static int money;
	static boolean play = true;
	
	JLabel label;
	
	 public TardisGame(String s)
		 {
			super(s);
			JPanel p = new JPanel();
			label = new JLabel("Key Listener!");
			p.add(label);
	        add(p);
	        addKeyListener(this);
	        setSize(200, 100);
	        setVisible(true);	 
		 }
    	
	 public void keyReleased(KeyEvent e) 
		 {
	        if (e.getKeyCode() == KeyEvent.VK_1) 
	        	{
	            System.out.println("1 key released");
	        	}
	        if (e.getKeyCode() == KeyEvent.VK_2) 
	        	{
	            System.out.println("2 key released");
	        	}
            if(e.getKeyCode()== KeyEvent.VK_3)
            	{
            	System.out.println("3 Key released.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_4)
            	{
            	System.out.println("4 Key released.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_5)
            	{
            	System.out.println("5 Key released.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_6)
            	{
            	System.out.println("6 Key released.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_7)
            	{
            	System.out.println("7 Key released.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_8)
            	{
            	System.out.println("8 Key released.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_9)
            	{
            	System.out.println("9 Key released.");
            	}
	    }
        
        public void keyPressed(KeyEvent e) 
        	{

            if (e.getKeyCode() == KeyEvent.VK_1) 
            	{
                System.out.println("1 key pressed");
            	}
            if (e.getKeyCode() == KeyEvent.VK_2) 
            	{
                System.out.println("2 key pressed");
            	}
            if(e.getKeyCode()== KeyEvent.VK_3)
            	{
            	System.out.println("3 Key pressed.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_4)
            	{
            	System.out.println("4 Key pressed.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_5)
            	{
            	System.out.println("5 Key pressed.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_6)
            	{
            	System.out.println("6 Key pressed.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_7)
            	{
            	System.out.println("7 Key pressed.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_8)
            	{
            	System.out.println("8 Key pressed.");
            	}
            if(e.getKeyCode()== KeyEvent.VK_9)
            	{
            	System.out.println("9 Key pressed.");
            	}
            

        	}
        
        public void keyTyped(KeyEvent e) 
        	{
        		if(e.getKeyCode()== KeyEvent.VK_1)
                	{
                	System.out.println("1 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_2)
                	{
                	System.out.println("2 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_3)
                	{
                	System.out.println("3 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_4)
                	{
                	System.out.println("4 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_5)
                	{
                	System.out.println("5 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_6)
                	{
                	System.out.println("6 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_7)
                	{
                	System.out.println("7 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_8)
                	{
                	System.out.println("8 Key typed.");
                	}
        		if(e.getKeyCode()== KeyEvent.VK_9)
                	{
                	System.out.println("9 Key typed.");
                	}
        		
        		
        	}
        
        public static void something()
        {
        new TardisGame("Key Listener Tester");
        }
        
    
	public static void gameIntro()
		{
		money = 100;

		takeBet();
		boolean play = true;
		while (play==true)
			{
			System.out.println("You can walk away right now with your money and never see me again...");
			System.out.println("But if you can guess the number I am thinking of between 1 & 9 I will double your money.");
			System.out.println("Which would you like to do?");
			
			final String[] choice = { "Play game", "Leave now"};

				{
				final JFrame frame = new JFrame();
			    String decision = (String) JOptionPane.showInputDialog(frame, 
			            "Would you like to play, or leave with your money?",
			            "Your Choice",
			            JOptionPane.QUESTION_MESSAGE, 
			            null, 
			            choice, 
			            choice[0]);
			    
			    switch(decision)
		    	{
		    	case "Play game":
		    		{
					JOptionPane.showMessageDialog(frame, "Good choice.");
					playGame();
		    		}
		    	
		    	case "Leave now":
		    		{
					JOptionPane.showMessageDialog(frame, "Okay. Your funeral... Goodbye.");
					System.exit(0);
		    		}
		    	}
		    	}
			}
		}
			
	public static void playGame()
		{
			Scanner userInput = new Scanner(System.in);
			int randomNumber = (int)(Math.random()*15)+1;
			System.out.println("Alright, now guess the number I'm thinking of between 1 & 9");
			int guess = userInput.nextInt();
			int count = 1;
			int counter = 1;
			
			while (guess != randomNumber && counter <= 3)
				{
				if (guess < randomNumber)
					{
					System.out.println("Nope, not quite");
					counter++;
					}
				else if (guess > randomNumber)
					{
					System.out.println("You're a little off...");
					counter++;
					}
				else
					{
					play=false;
					}
				System.out.println("Guess again");
				guess = userInput.nextInt();
				}
			
			if (counter > 3)
				{
				money = 0;
				System.out.println("Sorry, but you lose. I'll take your money now.");
				System.out.println("You now have " + money + " dollars");
				System.out.println("Goodbye, " + TardisItems.name + " I'll miss you.");
				}
			if (guess == randomNumber)
				{
				System.out.println("Congrats! you got it! I'll double your money now.");
				money = money * 2;
				System.out.println("You now have " + money + " dollars");
				System.out.println("Goodbye, " + TardisItems.name + " I'll miss you.");
				}
			System.exit(0);
			}
			
		
	public static void takeBet()
		{
		System.out.println("You have $ " + money);
		Scanner userInput = new Scanner(System.in);
		boolean play = true;
		if (bet== -1)
			{
			System.out.println("Goodbye.");
			play=false;
			}
		if (bet > money)
			{
			takeBet();
			}
		if (bet <= -2)
			{
			takeBet();
			}
		}
    
	

	}	