import javax.swing.JFrame;


public class Frame extends JFrame {

        Frame(){
            this.setTitle("SnakeGame");
//            Panel class is called;
            this.add(new Panel());
            this.setVisible(true);
        }



}
