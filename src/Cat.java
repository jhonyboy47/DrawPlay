/*
 * Daniel Sanchez and Jhonathan Malagon
 * C11A1
 * 
 * Changes Made:
 * 1. Daniel - Changed the color of the cat to red, and the eye color to blue
 * 2. Jhon   - Changed what the meow to a woof sound
 * 3. Daniel - Changed the x dimensions of the mouth
 * 4. Jhon   - Changed the left eye dimension 
 * 5. Daniel - Changed the head dimension
 * 6. Jhon   - Changed head color to white 
 */

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 250;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 4;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.white);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.blue);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, 40, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.red);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("WOOF", catX, catY+HEAD_DIMENSION+10);	
	}
}
