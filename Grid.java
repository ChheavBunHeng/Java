import java.awt.*;
import javax.swing.*;

class Grid extends Frame{

    Grid()
    {

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        
        setSize(300,300);
        add(b1);
        setLayout(new GridLayout(2,2)); 
        setVisible(true);
    }
    public static void main(String[] args) {
        new Grid();
    }
}
