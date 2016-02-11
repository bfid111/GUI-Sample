import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/*
Generates Random Number of Stars
*/
	public class RandomStar extends JPanel {
		final int size = 10;
		int width = getSize().width;
		int height= getSize().height;
		int[] Radius = new int[10];
		int[][] Locations = new int[10][10];
		int[] xPoints = new int[size];
		int[] yPoints = new int[size];
		Random a = new Random();
	public RandomStar(){
		setBackground (Color.black);
		setSize(800,800);
		RandomNumberGenerator();
	} //end RandomStarpanel()
	public void RandomNumberGenerator() {
		Random generator = new Random();
		for(int i = 0; i < size; i++){
			xPoints[i] = generator.nextInt(100); 
			//	xPoints[i] = Math.abs(xPoints[i]);
		}
		for(int j = 0; j < size; j++){
			yPoints[j] = generator.nextInt(100); 
			//	yPoints[j] = Math.abs(yPoints[j]);
		}
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		page.setColor(Color.white);
		for (int xNumb = 0; xNumb < xPoints.length; xNumb++){
			for (int yNumb = 0; yNumb < yPoints.length; yNumb++){
				page.translate(xPoints[xNumb],yPoints[yNumb]); // 
				Polygon star = new Polygon(new int[]{0,6+xNumb,24,9,15,0,-15,-9,a.nextInt(10)-24,-6,0},new int[]{-25,-8,-8,3,20,9,20,3,-8,-8},10);
				page.fillPolygon(star);
					}
			}
	}
}
