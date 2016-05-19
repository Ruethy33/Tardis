import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.Scanner;

public class TardisGame extends JFrame implements KeyListener
{

	private static final long serialVersionUID = 1L;
	static int randomNumber = (int)(Math.random()*2)+1;
	static int guess;
	static JLabel label;
	static boolean setVisible;
	static boolean play;
	static int bet;
	static JFrame frame = new JFrame();
	static String choice;
	static Scanner userInput = new Scanner(System.in);

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
	

	public void keyPressed(KeyEvent e)
		{
		switch(e.getKeyCode())
			{
			case KeyEvent.VK_1:
				guess = 1;				
				break;
			case KeyEvent.VK_2:
				guess = 2;
				break;
			}
		if(guess == randomNumber)
			{
			JOptionPane.showMessageDialog(frame, "Congrats you won!! I'll double you money now. \n You now have $200.");
			JOptionPane.showMessageDialog(frame, "Goodbye. I'll miss you.");

			}
		else 
			{
			JOptionPane.showMessageDialog(frame, "I'm sorry. You got it wrong. I'll take your money now. /n You now have $0.");
			JOptionPane.showMessageDialog(frame, "Goodbye. I'll miss you.");
			}
		System.exit(0);
		}
	


	public static void main(String[] args)
		{
		new TardisGame("KeyListenerTester");
		}

		
	 public static void playGame()
			{
			JOptionPane.showMessageDialog(frame, "Alright, now guess Whether the coin will be heads or tails. \n Please input 1 for heads and 2 for tails.");
			something();
			}
			
        
        public static void something()
        {
        new TardisGame("KeyListenerTester");
        }
        
    
	public static void gameIntro()
		{
		JOptionPane.showMessageDialog(frame, "You have $100.");

		boolean play = true;
		while (play==true)
			{
				
			JOptionPane.showMessageDialog(frame, "You can walk away right now with your money and never see me again... \n But if you can guess how this coin will land, I will double your money. \n Which would you like to do?");

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
					System.exit(0);
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


	@Override
	public void keyReleased(KeyEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}


	@Override
	public void keyTyped(KeyEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	

			