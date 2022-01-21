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

    private String place;

    public GameSound(String place) {
        if (place.equals("Title")) {

            File titleLoop = new File("src/Separated Files/Title Theme/xDeviruchi - Title Theme (Loop).wav");
            File titleEnd = new File("src/Separated Files/Title Theme/xDeviruchi - Title Theme (End).wav");
            PlaySound(titleLoop);
            PlaySound(titleEnd);
        } else if (place.equals("Icy Cave")) {
            File icyCaveLoop = new File("src/Separated Files/The Icy Cave/xDeviruchi - Title Icy Cave (Loop).wav");
            File icyCaveEnd = new File("src/Separated Files/The Icy Cave/xDeviruchi - Title Icy Cave (End).wav");
            PlaySound(icyCaveLoop);
            PlaySound(icyCaveEnd);
        } else if (place.equals("Food")) {
            File foodLoop = new File("src/Separated Files/Take some rest and eat some food!/xDeviruchi - Take some rest and eat some food! (Loop).wav");
            File foodIntro = new File("src/Separated Files/Take some rest and eat some food!/xDeviruchi - Take some rest and eat some food! (Intro).wav");
            File foodEnd = new File("src/Separated Files/Take some rest and eat some food!/xDeviruchi - Take some rest and eat some food! (End).wav");
            PlaySound(foodLoop);
            PlaySound(foodIntro);
            PlaySound(foodEnd);
        } else if (place.equals("Begin")) {
            File beginIntro = new File("src/Separated Files/And The Journey Begins/xDeviruchi - And The Journey Begins (Intro).wav");
            File beginLoop = new File("src/Separated Files/And The Journey Begins/xDeviruchi - And The Journey Begins (Loop).wav");
            File beginEnd = new File("src/Separated Files/And The Journey Begins/xDeviruchi - And The Journey Begins (Loop).wav");
            PlaySound(beginIntro);
            PlaySound(beginLoop);
            PlaySound(beginEnd);
        } else if (place.equals("Icy Cave")) {
            File icyCaveLoop = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (Loop).wav");
            File icyCaveEnd = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (End).wav");
            PlaySound(icyCaveLoop);
            PlaySound(icyCaveEnd);
        } else if (place.equals("Icy Cave")) {
            File icyCaveLoop = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (Loop).wav");
            File icyCaveEnd = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (End).wav");
            PlaySound(icyCaveLoop);
            PlaySound(icyCaveEnd);
        } else if (place.equals("Icy Cave")) {
            File icyCaveLoop = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (Loop).wav");
            File icyCaveEnd = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (End).wav");
            PlaySound(icyCaveLoop);
            PlaySound(icyCaveEnd);
        } else if (place.equals("Icy Cave")) {
            File icyCaveLoop = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (Loop).wav");
            File icyCaveEnd = new File("src/Separated Files/Title Theme/xDeviruchi - Title Icy Cave (End).wav");
            PlaySound(icyCaveLoop);
            PlaySound(icyCaveEnd);
        }

    }

    /**
     *
     * @param Sound
     */
    public void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
