package finalproject;

import javax.swing.JFrame;

public class Display {
//declare jframe for the window

    private JFrame frame;
//decalre varribles for windows properties 
    private String title;
    private int width, hieght;

    /**
     * Consturctor for the Display
     *
     * @param title
     * @param width
     * @param hieght
     */
    public Display(String title, int width, int hieght) {
        this.title = title;
        this.width = width;
        this.hieght = hieght;
        creatDisplay();
    }

    private void creatDisplay() {
        frame = new JFrame(title);
        frame.setSize(width, hieght);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
