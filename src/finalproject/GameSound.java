/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * if challange
 */
package finalproject;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author danny
 */
public class GameSound {
    public GameSound()throws UnsupportedAudioFileException, IOException, LineUnavailableException{ 
        Scanner scanner = new Scanner(System.in);
    File file = new File("src/finalproject/Separated Files/Title Theme/xDeviruchi - Title Theme (Loop).wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    clip.start();
    
    
   
}
}
