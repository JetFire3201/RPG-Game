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
import java.util.Random;

public class Knight {

    public int strength;
    private int[] lowhistrength = {50, 100};

    public int health;
    private int[] lowhihealth = {100, 150};

    public int speed;
    private int[] lowhispeed = {20, 50};

    public int defense;
    private int[] lowhidefense = {20, 50};

    public int mana;
    private int[] lowhimana = {0, 1};

    public Random random = new Random();
    
    public String classWeakness;

    public Knight() {
 
      
     
        this.strength = random.nextInt(lowhistrength[1] -lowhistrength[0]) + lowhistrength[0];

        this.health = random.nextInt(lowhihealth[1] - lowhihealth[0]) + lowhihealth[0];

        this.speed = random.nextInt(lowhispeed[1] - lowhispeed[0]) + lowhispeed[0];

        this.defense = random.nextInt(lowhidefense[1] - lowhidefense[0]) + lowhidefense[0];
        this.mana = random.nextInt(lowhimana[1] - lowhimana[0]) + lowhimana[0];
    }
}
