/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cymmm1
 */
public class RPG {

    Scanner scanner = new Scanner(System.in);
/**
 * 
 * @param args 
 */
    public static void main(String[] args) {
        boolean running = false;
        //Creates a new party for members. Will add a function to have multiple parties and be able to switch between them.
        Party party = new Party();
        
        //The reason we do not make a new object is because we do not need to create
        //useless objects. We can make those objects when we need to.
        party.AddToParty(new Character("Matthew", 10, 100, 5, "Soldier", 10));
        //Adds Character to party
        party.DisplayParty();

        party.AddToParty(new Character("John", 10, 100, 5, "Soldier", 10));
        party.DisplayParty();

        String name = "Matthw";
        // below is just a test function to get names of the members in the party
        String gotname = (party.getCharacter(name).getName());
        if (gotname == "") {

        } else {
            System.out.println("Got " + party.getCharacter(name).getName() + " from the party.");
        }

    }

}
