//label
//TextField
//Button
//TextArea

import java.awt.*;
// import java.awt.event.*;

class StudentRegister extends Frame 
{
    GridBagConstraints gbc = new GridBagConstraints(); 
    TextField TextInput, TextList;
    StudentRegister()
    {
        TextInput = new TextField("Input student Name");
        TextInput.setBounds(100,100,200,100);
        TextList = new TextField("The list of the student");
        TextList.setBounds(100,200,200,100);
        add(TextList);
        add(TextInput);
        setVisible(true);
        setSize(500,500);
    }   
    public static void main(String[] args) {
        new StudentRegister();
    }
}
