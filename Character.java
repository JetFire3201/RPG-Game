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
    // fightType can be Knight, Magician, Fencer, Bandit
    private int defense;
    private Enum classType;
    
    

    /**
     * Makes a new Character Object
     * 
     * But this will not be used in conjunction to an assignment, simply as a argument in party class
     * 
     * @param name name of character
     * @param strength strength of character
     * @param health health of character
     * @param speed speed of character
     * @param fightType Character Class
     */

    public Character(String name, int strength, int health, int speed,Enum Class, int defense) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.speed = speed;
        this.classType = Class;
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
        

    }

    

    public Enum getFightType() {
        return classType;
    }

    public void setFightType(String type) {
        
            boolean possible =false;
            Classes[] ar = Classes.values(); //gets all the classes values
            for(Enum ct : ar){
                if(type == ct.toString()){//to string is an overwritten method.
                 classType = Classes.valueOf(ct.name());
                 possible = true;
                
                }
            }
            if(possible == false){
                System.out.println("Could not change Class Type to "+type);
            }else{
                System.out.println("Class changed to " +type);
            }
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
