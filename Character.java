/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;

/**
 *
 * @author cymmm1
 */
public class Character {

    private String name;
    private int strength;
    private int health;
    private int speed;
    // fightType can be Knight, Magician, Fencer, Bandit.
    private String fightType;
    private int defense;

    /**
     *Makes a new Character Object
     * 
     * But this will not be used in conjunction to an assignment, simply as a argument in party class
     * 
     * @param name name of character
     * @param strength strength of character
     * @param health health of character
     * @param speed speed of character
     * @param fighType Class of character
     * @param fightType Character Class
     */

    public Character(String name, int strength, int health, int speed, String fightclass, int defense) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.speed = speed;
        this.fightType = fightclass;
        this.defense = defense;

    }

    /**
     *This is a class used for a dummy class.
     */
    public Character() {
        this.name = "";
        this.strength = 0;
        this.health = 0;
        this.speed = 0;
        this.defense = 0;
        this.fightType = "";

    }

    public String getFightType() {
        return fightType;
    }

    private void setFightType(String fightType) {
        this.fightType = fightType;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

}
