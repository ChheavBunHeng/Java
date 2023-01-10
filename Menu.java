import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 class SmallCalculator extends Frame implements ActionListener{
    Label lbtitle,lbfirst,lbsecond,lbresult;
    TextField txtvalue1,txtvalue2,txtresult;
    Button btnsum,btnclear;
    public SmallCalculator(){
        lbtitle = new Label(" Calculator", Label.CENTER);
        lbtitle.setBounds(0, 40, 400, 60);
        add(lbtitle);
        
        lbfirst = new Label("First value :");
        lbfirst.setBounds(30, 140, 120, 30);
        add(lbfirst);
        txtvalue1 = new TextField();
        txtvalue1.setBounds(160, 140, 200, 30);
        add(txtvalue1);
        
        lbsecond = new Label("Second value :");
        lbsecond.setBounds(30, 200, 120, 30);
        add(lbsecond);
        txtvalue2= new TextField();
        txtvalue2.setBounds(160, 200, 200, 30);
        add(txtvalue2);
        
        btnsum = new Button("Sum");
        btnsum.setBounds(30, 260, 100, 30);
        add(btnsum);
        
        btnclear = new Button("Clear");
        btnclear.setBounds(260, 260, 100, 30);
        add(btnclear);
        
        lbresult = new Label("Result :");
        lbresult.setBounds(30, 310, 120, 30);
        add(lbresult);
        txtresult= new TextField();
        txtresult.setBounds(160, 310, 200, 30);
        add(txtresult);
       
        btnsum.addActionListener(this);  
        btnclear.addActionListener(this);
        
        setLayout(null);
        setSize(400, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new SmallCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double value1 = Double.parseDouble(txtvalue1.getText());
        double value2 = Double.parseDouble(txtvalue2.getText());
       if(e.getSource() == btnsum){ 
           double result = value1+value2;
           txtresult.setText(String.valueOf(result));
       }else{
           txtvalue1.setText("");
           txtvalue2.setText("");
           txtresult.setText("");
       }
    }

  
}