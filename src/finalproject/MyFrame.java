package finalproject;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyPanal panal;
    MyFrame() {
          panal = new MyPanal();
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.add(panal);
          this.pack();
          this.setLocationRelativeTo(null);
          this.setVisible(true);
    }
}
