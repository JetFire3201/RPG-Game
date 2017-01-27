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
public class Races {

    private String[] raceTypes = {"Knight"};
    public String classType;
    public Knight knight;
    
    
    public Races(String Race) {
        classType = "No class";
        boolean found = false;
        for (String race : raceTypes) {
            if (Race == race) {
               System.out.println("Class Type found, changing class");
               classType = Race;
               found  =true;
            }else{
               
            }
            
            
        }
if(found){
    
}
    }

    public void getKnightStats() {
        knight =  new Knight();
    }

}
