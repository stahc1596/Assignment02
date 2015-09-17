
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot Monty = new Robot (kw, 0, 0, Direction.EAST);
        
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.SOUTH);
        new Wall (kw, 1, 1, Direction.EAST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 2, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.SOUTH);
        new Wall (kw, 1, 4, Direction.EAST);
        new Wall (kw, 1, 4, Direction.WEST);
        new Wall (kw, 2, 3, Direction.EAST);
        new Wall (kw, 3, 3, Direction.EAST);
        new Wall (kw, 4, 4, Direction.EAST);
        new Wall (kw, 4, 4, Direction.NORTH);
        new Wall (kw, 4, 4, Direction.SOUTH);
        new Wall (kw, 4, 4, Direction.WEST);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Wall (kw, 4, 1, Direction.NORTH);
        new Wall (kw, 4, 1, Direction.SOUTH);
        new Wall (kw, 4, 1, Direction.EAST);
        new Wall (kw, 4, 1, Direction.WEST);
        new Wall (kw, 3, 2, Direction.WEST);
        new Wall (kw, 2, 2, Direction.WEST);
        
        while (true){
            Monty.move();
            Monty.move();
            Monty.turnLeft();
            Monty.turnLeft();
            Monty.turnLeft();
            Monty.move();
            Monty.turnLeft();
            Monty.move();
            Monty.turnLeft();
            Monty.move();
            Monty.turnLeft();
            Monty.turnLeft();
            Monty.turnLeft();
            Monty.move();
            Monty.move();
            Monty.turnLeft();
            Monty.turnLeft();
            Monty.turnLeft();
        }
        
}
        
        }
    

