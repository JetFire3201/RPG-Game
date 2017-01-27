package rpg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cymmm1
 */
public class RPG {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        partyGroup parties = new partyGroup();

        parties.makeParty("Active");
        parties.AddToParty("Active", "Matthew", "Knight");
        //breaking it on purpose to make sure people dont be stupid.
        parties.AddToParty("Jony", "Jon", "knight");
        Party jon = parties.getParty("John Cena");
        jon.DisplayParty();

        /* while (true){
           System.out.println("what do you want to do? \n"+
                   "1: Make a party \n" +
                    "2: add Members \n" +
                    "1: Make a party \n" +
                   
                   );
           
       } */
    }

}

class partyGroup {

    public ArrayList<Party> partyGroups = new ArrayList<Party>();

    public void makeParty(String name) {
        (this.partyGroups).add(new Party(name));

    }

    /**
     *
     * @param name name of the party you want to add members
     */
    public void AddToParty(String name, String characterName, String classType) {
        boolean found = false;
        if (partyGroups.isEmpty()) {
            System.out.println("There are no parties in the partygroup");
        } else {
            for (Party party : partyGroups) {
                if (party.Name == name) {
                    party.AddToParty(new Character(characterName, classType));
                    found = true;
                } else {
                    System.out.println("Looking for party...");
                }
            }
            if (found) {
                System.out.println("Successfully added: " + characterName + " to the party: " + name);
            } else {
                System.out.println("Could not add " + characterName + " to the party: " + name);
            }
        }
    }

    public void RemoveFromParty(String name, String characterName) {

        for (Party party : partyGroups) {
            if (party.Name == name) {

                party.RemoveFromParty(characterName);

            }

        }

    }

    public Party getParty(String name) {
        Party temp = null;
        boolean got = false;
        if (partyGroups.isEmpty()) {
            makeParty("");
            System.out.println("There were no parties by the name of " + name);
            return getParty("");
        } else {
            for (Party party : partyGroups) {
                if (party.Name == name) {
                    temp = party;
                    got = true;
                }

            }

        }
        
        if(got){//if there was a party by the arg name
          
        }else{
            //make a dummy temp.
            temp = new Party("");
            temp.AddToParty(new Character("",""));
        }
        
        
        return temp;
    }
}
