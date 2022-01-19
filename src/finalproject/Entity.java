/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author anbah7012
 */
public interface Entity {
    
    
    
     public int getXPos();
     
     public int getYPos();
     
     public String getStatus();
     
     public void doDamage(AbstractEntity e);
     
     public int getHealth();
     
     public int getDamage();
     
     public int getSpeed();
     
     public String toString();
}
