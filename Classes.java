
package rpg;

/**
 *
 * @author cymmm1
 */
public enum Classes {
    WIZARD("Wizard", 10), KNIGHT("Knight", 20);
    
    public String value;
    public int strength;
    
    private Classes(String value, int strength){
        this.value = value;
        this.strength = strength;
    }
   
    public int returnStrength(){
        return strength;
    }
    public String returnValue(){
        return value;
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
   

};

