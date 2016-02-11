
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
/**
 *
 * @author 15yson
 */
public class Smiley extends Applet{
   @Override
   public void paint( Graphics page)
   {
      final int MID = 150;
      final int TOP = 50;
      setSize(500,300);
      setBackground (Color.yellow); 
      page.setColor(Color.BLUE);
      page.fillOval(TOP, TOP, TOP, TOP);
      page.fillOval(TOP+180, TOP, TOP, TOP);
      page.setColor(Color.BLUE);
      page.fillArc(TOP+90, TOP+50, TOP-30, TOP, TOP, TOP);
      page.drawArc (TOP+80, TOP+80, 120, 10, 190, 160);   // smile
      page.drawOval(TOP-10,TOP-60,TOP+200,TOP+200);

      /*
      page.fillOval (MID-20, TOP, 40, 40);      // head
      page.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
      page.fillOval (MID-50, TOP+80, 100, 60);  // lower torso

      page.setColor (Color.black);
      page.fillOval (MID-10, TOP+10, 5, 5);   // left eye
      page.fillOval (MID+5, TOP+10, 5, 5);    // right eye

      
      page.drawArc (MID-10, TOP+20, 20, 10, 190, 160);   // smile
      page.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
      page.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

      page.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect (MID-15, TOP-20, 30, 25);        // top of hat
              */
   }
    
    
}
