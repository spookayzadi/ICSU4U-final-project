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
abstract public class AbstractEntity implements Entity {
    
    protected int x; 
    protected int y;
    protected String status;
    protected int health;
    protected int damage;
    protected int speed;
    
    
    public AbstractEntity(int x, int y, String status, int health, int damage, int speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.status = status;
        this.damage = damage;
        this.health = health;
    }
    
    
    //gets the x position
    public int getXPos(){
        return x;
    }
    //gets the y position
    public int getYPos(){
        return y;
    }
    // gets the damage an entity does
    public int getDamage(){
        return damage;
    }
    // gets the health value of an entity
    public int getHealth(){
        return health;
    }
    // gets the status of the entity
    public String getStatus(){
        return status;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void doDamage(AbstractEntity e){
      e.health = (e.health - getDamage());
   
    }
 
    public String toString(){
        String out;
        return "Entity created";
    }
}
