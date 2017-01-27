package rpg;

import java.util.ArrayList;



/**
 *
 * @author cymmm1
 */
public class Party {

    public ArrayList<Character> party = new ArrayList<Character>();
    public String Name;
    /**
 * 
 * @param character Character is added to party
 */
    public void AddToParty(Character character) {
        party.add(character);
    }
    public void RemoveFromParty(String character){
        for(Character characters : party){
            if(characters.getName() == character){
                party.remove(characters);
            }
        }
    }
/**
 *Just displays party members.
 * 
 */
    public void DisplayParty() {
        if(this.Name != "" ){
        for (Character members : party) {
            System.out.println(members.getName() + ": \n"+ 
                    "Strength: "+members.getStrength() +"\n" +
                    "Health: "+members.getHealth() +"\n" +
                    "Speed: "+members.getSpeed() +"\n" +
                    "Fight Type: "+members.getFightType() +"\n");
        }
        System.out.println("=======================================================");
        } else{
            System.out.println("Could not display Party: \""+this.Name+"\"");
                }
                
        }
    public Party(String Name){
        this.Name = Name;
    }
    
    
    /**
     * 
     * @param name
     * @return Returns the Character your looking for or returns null.
     */
    public Character getCharacter(String name) {
        boolean gotname = false;
      Character member = null;
        for (Character members : party) {
            if (members.getName().equals(name)) {
                gotname = true;
                member = members;
                    
               break;
               
            } else {
                
            }
        }
        if(member == null){
            System.out.println("Sorry Character: "+name+" does not exist.");
            return (new Character());
        }else{return member;}
    }
}
