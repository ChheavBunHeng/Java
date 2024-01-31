import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;

class TextAreaH1 extends Frame implements ActionListener
{
   TextArea T1,T2;
   Button Copy;
   TextAreaH1()
   {
      setLayout(new BorderLayout());
      //Button
      Copy = new Button("Test1");
      Copy.setPreferredSize(new Dimension(50,50));   
      Copy.addActionListener(this);

      //TextArea
      T1 = new TextArea("");
      Copy.setPreferredSize(new Dimension(50,50));   
      T2 = new TextArea("");
      Copy.setPreferredSize(new Dimension(50,50));   
      

      add(T1,BorderLayout.WEST);
      add(T2,BorderLayout.EAST);
      add(Copy,BorderLayout.CENTER);
      setSize(1000,1000);
      setVisible(true);
   }
   public static void main(String[] args) {
       new TextAreaH1();
   }
   @Override
   public void actionPerformed(ActionEvent arg0) 
   {
      // TODO Auto-generated method stub
      T2.setText(T1.getSelectedText());
      
   }
}