/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */

    import java.awt.*;
    import java.applet.*;
   /*@Author Youngmin
    * Sample Illustration of GUI with Colors and shapes
    */
    public class CheckerBoard extends Applet {

       public void paint(Graphics g) {
          int row;   // Row number, from 0 to 7
          int col;   // Column number, from 0 to 7
          int x,y;   // Top-left corner of square
          int redcount =0;
          int blackcount = 0;
          for ( row = 0;  row < 8;  row++ ) {
             for ( col = 0;  col < 8;  col++) {
                x = col * 20;
                y = row * 20;
                if ( (row % 2) == (col % 2) ) {
                    g.setColor(Color.red); // place red checker
                }
                else{
                    g.setColor(Color.black); // place black checker
                }
                g.fillRect(x, y, 20, 20);
                if(redcount < 5){
                    g.setColor(Color.white);
                    g.fillOval(x,y,13,13);
                    redcount++;
                }
                if(col > 5){
                if ( blackcount < 8){
                    g.setColor(Color.GREEN);
                    g.fillOval(x, y, 13, 13);
                    blackcount++;      
                }
                }
             }   
          } // end for row
       }  // end paint()
    }  // end class
    