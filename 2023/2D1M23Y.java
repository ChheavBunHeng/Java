// Demonstrate BorderLayout.
import java.awt.*;

class MyBorderLayoutDemo extends Frame {

  MyBorderLayoutDemo() {
    super("My BorderLayout Demo");
    setSize(400, 200);
    setVisible(true);

    setLayout(new BorderLayout());

    add(new Button("This is across the top."),
        BorderLayout.NORTH);
    add(new Label("This is the test button"),
        BorderLayout.SOUTH);
    // add(new Label("The footer message might go here."),
    //     BorderLayout.SOUTH);
    add(new Button("Right"), BorderLayout.EAST);
    // add(new Button("Left"), BorderLayout.WEST);
    add(new TextField("Hello world"),
    BorderLayout.WEST);
    String msg = "The reasonable man adapts " +
      "himself to the world;\n" +
      "the unreasonable one persists in " +
      "trying to adapt the world to himself.\n" +
      "Therefore all progress depends " +
      "on the unreasonable man.\n\n" +
      "        - George Bernard Shaw\n\n";
    add(new TextArea(msg), BorderLayout.CENTER);
    setVisible(true); 
  }
  public static void main(String args[]){
    new MyBorderLayoutDemo();
  }
}