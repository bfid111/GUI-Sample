
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */
class BrowserModel {
    
    BrowserView panel;
    Stack<Integer> back; 
    Stack<Integer> forward;
    int pos;

    BrowserModel(BrowserView view) {
        this.panel = view;
        back = new Stack(); // stack for previous position 
        forward = new Stack(); // stack for forward position 
        pos = 0; // default number 
        
       
    }

    boolean hasBack() {
        if(back.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }

    boolean hasForward() {
        if(forward.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    void followLink(int n) {
        panel.update(n);
        back.push(pos); // push current position into stack
        pos = n;
        forward.clear();
    }

    void home() {
        panel.update(0); // update panel with position line 0 
        back.push(pos);
        pos = 0;
        forward.clear(); // clear forward stack => button disabled 
    }
    // temp 
    /*
    void goback()
    {
        panel.update(1);
        // back.push(pos);
        pos = 0;
    }
    */

    void back() {
        int temp = (int) back.pop(); // take out previous position
        forward.push(pos); // push current position 
        pos = temp; 
        panel.update(temp); 
    }

    void forward() {
        int temp = (int) forward.pop(); // take out previous position 
        back.push(pos); // push current position to back stack 
        pos = temp; 
        panel.update(temp); // go to line temp;
    }
    
}
