/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author cymmm1
 */
public class Character {
    private String name;
    private int strength;
    private int health;
    private int speed;
    
    public Character(String name){
        this.name = name;
        strength = 5;
        health = 100;
        speed = 10;
        
    }
    public Character(String name, int strength, int health,int speed){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.speed = speed;
        
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
