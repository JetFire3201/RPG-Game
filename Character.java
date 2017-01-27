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
    private int defense;
    private int mana;
    
    private String Class;
    

    /**
     * Makes a new Character Object
     * 
     * But this will not be used in conjunction to an assignment, simply as a argument in party class
     * @param name name of character.
     * @param Class type of class the character will have.
     */
    public Character returnCharacter(){
    return this;
}
    
    
    public Character(String name, String Class) {
        this.name = name;
        setFightType(Class);
             
        
        //first you must set the fightType to be able to get the stats of that enum
        
        //do health
        //do speed
        //do defense
    }
    
    private void setKnightStats(){
        Knight ct = new Knight();
        
        this.strength = ct.strength;
        this.speed = ct.speed;
        this.defense = ct.defense;
        this.health = ct.health;
        this.mana = ct.mana;
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


    public String getFightType() {
       return Class;
    }

    public void setFightType(String type) {
        
        Races temp = new Races(type);
        
        switch(temp.classType){
            case ("Knight"):
                this.Class = type;
                setKnightStats();
            default:
                if(Class != type ){
                this.Class= Class;}
        }
        
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        
         return this.strength;
    }

    private void setStrength(int strength) {
        //so valueof returns the class of the name, and then you get the strength of it.
        this.strength=strength;

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
