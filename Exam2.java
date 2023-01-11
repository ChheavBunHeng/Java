import java.awt.*;
import java.awt.event.*;
        
class Exam2 extends Frame
{
    Exam2()
    {
        add(new Button("Hello world"));
        add(new Button("World"));

        setLayout(new GridLayout());  

        setVisible(true);
        setSize(500,500);
        
        


    }
    public static void main(String[] args) {
        new Exam2();
    }
}
