

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentForm1 extends Frame implements Itemlistener
{
    Checkbox Male, Female;
    StudentForm1()
    {
        super("Hello world");
        setLayout(new BorderLayout());
        setVisible(true);
        setSize(400,400);
        add(new Button("Male"));
        add(new Checkbox("Male"),setBounds(120,50,100,20));
        add(new Checkbox("Female"),BorderLayout.WEST);
        add(new TextArea("Male"),BorderLayout.SOUTH);


        
    }
    public static void main(String[] args) {
        new StudentForm1();
    }
}