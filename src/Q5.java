
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
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot Bonnie = new Robot(kw, 1, 3, Direction.SOUTH);
        Robot Clyde = new Robot(kw, 1, 3, Direction.SOUTH);

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

        while (true) {
            Bonnie.turnLeft();
            
            
            
            if (Bonnie.frontIsClear()){

            while (true) {

                if (!Bonnie.frontIsClear()) {
                    Bonnie.turnLeft();
                    Bonnie.turnLeft();
                    Bonnie.turnLeft();}
                

                if (Bonnie.frontIsClear()) {
                    Bonnie.move();}
                
                if (!Bonnie.frontIsClear()){
                Bonnie.turnLeft();
                Bonnie.turnLeft();
                Bonnie.turnLeft();
                }
            }}else{
                Bonnie.turnLeft();
                Bonnie.turnLeft();
                Bonnie.turnLeft();
                Bonnie.move();
            }

        }
    }
}
