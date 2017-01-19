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
public class Party {

    static ArrayList<Character> party = new ArrayList<Character>();

    public void AddToParty(Character character) {
        party.add(character);
    }

    public void DisplayParty() {
        for (Character members : party) {
            System.out.println(members.getName() + ": \n"+ 
                    "Stregth: "+members.getStrength() +"\n" +
                    "Health: "+members.getHealth() +"\n" +
                    "Speed: "+members.getSpeed() +"\n" +
                    "Fight Type: "+members.getFightType() +"\n");
        }
    }

    public Character getCharacter(String name) {
        boolean gotname = false;
      Character member = null;
        for (Character members : party) {
            if (members.getName() == name) {
                gotname = true;
                member = members;
                    
               break;
               
            } else {
                
            }
        }
        if(member == null){
            return (new Character(" Sorry, \""+name +"\" does not exist",0,0,0,""));
        }else{return member;}
    }
}
