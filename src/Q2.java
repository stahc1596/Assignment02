
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
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        new Wall (kw, 1, 1, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.SOUTH);
        new Wall (kw, 1, 3, Direction.SOUTH);
        new Wall (kw, 1, 4, Direction.SOUTH);
        new Wall (kw, 1, 5, Direction.SOUTH);
        new Wall (kw, 1, 6, Direction.SOUTH);
        new Wall (kw, 1, 7, Direction.SOUTH);
        new Wall (kw, 1, 8, Direction.SOUTH);
        new Wall (kw, 1, 9, Direction.SOUTH);
        new Wall (kw, 1, 10, Direction.SOUTH);
        new Wall (kw, 1, 11, Direction.SOUTH);
        new Wall (kw, 1, 12, Direction.SOUTH);
        new Wall (kw, 1, 13, Direction.SOUTH);
        new Wall (kw, 1, 3, Direction.EAST);
        new Wall (kw, 1, 5, Direction.EAST);
        new Wall (kw, 1, 7, Direction.EAST);
        new Wall (kw, 1, 9, Direction.EAST);
        new Wall (kw, 1, 12, Direction.EAST);
        
        new Thing (kw, 1, 13);
        
        Robot Monty = new Robot (kw, 1, 1, Direction.EAST);
        
        while (Monty.frontIsClear()){
            Monty.move();
            
            if (Monty.canPickThing()){
                Monty.pickThing();
            }
                                      
            if (!Monty.frontIsClear()){
        Monty.turnLeft();
        Monty.move();
        Monty.turnLeft();
        Monty.turnLeft();
        Monty.turnLeft();
        Monty.move();
        Monty.turnLeft();
        Monty.turnLeft();
        Monty.turnLeft();
        Monty.move();
        Monty.turnLeft();
            }
        if (Monty.canPickThing()){
        Monty.pickThing();}
        }}
            }
    

            

        
        

