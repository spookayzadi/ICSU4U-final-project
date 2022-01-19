package finalproject;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanal extends JPanel {

    BufferedImage img = null;

    MyPanal() {
        this.setPreferredSize(new Dimension(128, 128));

        try {
            img = ImageIO.read(new File("src\\finalproject\\Merged_document.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img.getSubimage(20, 0, 32, 40), 0, 0, null);
    }
}
