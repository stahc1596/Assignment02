
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();
        
        //Cleaning robots
        Robot bonnie = new Robot(kw, 1, 3, Direction.SOUTH);
        Robot clyde = new Robot(kw, 1, 3, Direction.SOUTH);
        
        //Walls of the driveways and sidewalk
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 6, 1, Direction.WEST);
        new Wall(kw, 7, 1, Direction.WEST);
        new Wall(kw, 8, 1, Direction.WEST);
        new Wall(kw, 9, 1, Direction.WEST);
        new Wall(kw, 10, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 6, 2, Direction.EAST);
        new Wall(kw, 7, 2, Direction.EAST);
        new Wall(kw, 8, 2, Direction.EAST);
        new Wall(kw, 9, 2, Direction.EAST);
        new Wall(kw, 10, 2, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 5, 3, Direction.EAST);
        new Wall(kw, 7, 3, Direction.EAST);
        new Wall(kw, 10, 3, Direction.EAST);
        new Wall(kw, 3, 4, Direction.NORTH);
        new Wall(kw, 3, 5, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 7, Direction.NORTH);
        new Wall(kw, 3, 8, Direction.NORTH);
        new Wall(kw, 3, 8, Direction.EAST);
        new Wall(kw, 4, 8, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.SOUTH);
        new Wall(kw, 4, 8, Direction.SOUTH);
        new Wall(kw, 6, 4, Direction.NORTH);
        new Wall(kw, 6, 5, Direction.NORTH);
        new Wall(kw, 6, 6, Direction.NORTH);
        new Wall(kw, 6, 7, Direction.NORTH);
        new Wall(kw, 6, 7, Direction.EAST);
        new Wall(kw, 6, 4, Direction.SOUTH);
        new Wall(kw, 6, 5, Direction.SOUTH);
        new Wall(kw, 6, 6, Direction.SOUTH);
        new Wall(kw, 6, 7, Direction.SOUTH);
        new Wall(kw, 8, 4, Direction.NORTH);
        new Wall(kw, 8, 5, Direction.NORTH);
        new Wall(kw, 8, 6, Direction.NORTH);
        new Wall(kw, 8, 7, Direction.NORTH);
        new Wall(kw, 8, 8, Direction.NORTH);
        new Wall(kw, 8, 9, Direction.NORTH);
        new Wall(kw, 8, 10, Direction.NORTH);
        new Wall(kw, 8, 11, Direction.NORTH);
        new Wall(kw, 8, 11, Direction.EAST);
        new Wall(kw, 9, 11, Direction.EAST);
        new Wall(kw, 9, 11, Direction.SOUTH);
        new Wall(kw, 9, 10, Direction.SOUTH);
        new Wall(kw, 9, 9, Direction.SOUTH);
        new Wall(kw, 9, 8, Direction.SOUTH);
        new Wall(kw, 9, 7, Direction.SOUTH);
        new Wall(kw, 9, 6, Direction.SOUTH);
        new Wall(kw, 9, 5, Direction.SOUTH);
        new Wall(kw, 9, 4, Direction.SOUTH);
        new Wall(kw, 10, 3, Direction.SOUTH);
        
        //things = Garbage
        new Thing (kw, 3, 3);
        new Thing (kw, 3, 5);
        new Thing (kw, 3, 6);
        new Thing (kw, 3, 8);
        new Thing (kw, 4, 7);
        new Thing (kw, 4, 4);
        new Thing (kw, 5, 3);
        new Thing (kw, 6, 4);
        new Thing (kw, 6, 7);
        new Thing (kw, 8, 3);
        new Thing (kw, 8, 6);
        new Thing (kw, 8, 8);
        new Thing (kw, 8, 9);
        new Thing (kw, 8, 11);
        new Thing (kw, 9, 9);
        new Thing (kw, 9, 8);
        new Thing (kw, 9, 5);
        new Thing (kw, 9, 3);

        while (true) {
            
            
            if (bonnie.getStreet() == 10){
                break;
                //bonnie takes a rest at the end of the sidewalk while clyde
                //finishes.
            }
            
            if (bonnie.canPickThing()){
                bonnie.pickThing();
                //bonnie picks up all the garbage on the sidewalk
            }
            
            bonnie.turnLeft();
            
            if (bonnie.frontIsClear()){

            while (true) {
                
                if (bonnie.canPickThing()){
                    bonnie.pickThing();
                    //bonnie picks up all the garbage in the driveways.
                }
                
                if (bonnie.frontIsClear()) {
                    bonnie.move();}
                //bonnie asks herself if there is a driveway next to her. If she
                //is, then bonnie enters the driveway
                
                if (bonnie.getAvenue() == 3){
                    bonnie.turnLeft();
                    //bonnie exits the driveway on avenue 3.
                    
                    while (bonnie.countThingsInBackpack() > 0){
                        bonnie.putThing();}
                    //bonnie drops the garbage off at the end of the driveways
                        
                    bonnie.move();
                    
                    break;}

                if (!bonnie.frontIsClear()) {
                    bonnie.turnLeft();
                    bonnie.turnLeft();
                    bonnie.turnLeft();}
                
            }}else{
                bonnie.turnLeft();
                bonnie.turnLeft();
                bonnie.turnLeft();
                bonnie.move();
            }
            //bonnie sweeps around avenue 3 and in the driveways for all the
            //garbage and drops the garbage off at the end of the driveway for 
            //clyde to pick up.
                
                
                }
        
        while ( true ){
            
            while (clyde.getStreet() == 10 && clyde.countThingsInBackpack() > 0){
                clyde.putThing();
                //clyde drops of all the garbage at the end of the sidewalk.
                }
            
            if (clyde.getStreet() == 10){
                break;
            }
            
            while (clyde.canPickThing()){
                clyde.pickThing();
                //clyde picks up all the garbage bonnie left for him.
            }
            clyde.move();
            //clyde cleans up all the garbage in avenue 3.
            
            
            }
        }
                

                }
            

        
    

