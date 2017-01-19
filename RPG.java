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

    public static void main(String[] args) {
        boolean running = false;

        Party party = new Party();

        party.AddToParty(new Character("Matthew", 10, 100, 5, "Soldier"));
        party.DisplayParty();

        Character temp = new Character("John", 10, 100, 5, "Soldier");
        party.AddToParty(temp);
        party.DisplayParty();
// below is just a test function to get names of the members in the party
        System.out.println("got the name: " + (party.getCharacter("Matthe").getName()));
       
    }

    

}
