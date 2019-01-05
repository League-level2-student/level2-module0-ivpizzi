package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args)
	{
		
		//2. create an array of 5 robots.
		//3. use a for loop to initialize the robots.
		//4. make each robot start at the bottom of the screen, side by side, facing up
		Robot[] robots = new Robot[4];
		for(int i = 0; i < robots.length; i++)
		{
			Robot r = new Robot();
			r.setX(i * 150 + 150);
			r.setSpeed(10);
			robots[i] = r;
		}

		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//7. declare that robot the winner and throw it a party!
		boolean atTop = false;
		while(atTop == false)
		{
			for(int i = 0; i < robots.length; i++)
			{
				Random rand = new Random();
				if(robots[i].getY() > 0)
				{
					int random = rand.nextInt(50);
					robots[i].move(random);
				}
				else
				{
					atTop = true;
					JOptionPane.showMessageDialog(null, "Robot number " + i + " won!");
					break;
				}
			}
		}
	
		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
	}
}
