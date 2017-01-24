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
public enum Classes {
    WIZARD("Wizard"), KNIGHT("Knight");
    
    public String value;
    public int strength;
    
    private Classes(String value){
        this.value = value;
        strength = 100;
    }
    @Override
    public String toString() { 
        return this.value;
        /* this is just a backup just in case
        switch (this) { 
            case WIZARD:
                return "Wizard";
            case KNIGHT:
                return "Knight"; 
        }
         return super.toString();
*/
    }
