
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot Monty = new Robot(kw, 4, 5, Direction.EAST);
        
        while (Monty.getDirection() != Direction.NORTH && Monty.getStreet() > 0){
        Monty.turnLeft();
        }
        
        while (Monty.getDirection() != Direction.SOUTH && Monty.getStreet() < 0){
        Monty.turnLeft();}
        
        while (Monty.getStreet() != 0){
        Monty.move();}
        
        while (Monty.getDirection() != Direction.WEST && Monty.getAvenue() > 0){
        Monty.turnLeft();
        }
        
        while (Monty.getDirection() != Direction.EAST && Monty.getAvenue() < 0){
        Monty.turnLeft();}
        
        while (Monty.getAvenue() != 0){
        Monty.move();}
        }
    }

