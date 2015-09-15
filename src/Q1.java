
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plati_000
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         City kw = new City();
        
        Robot Monty = new Robot(kw, 1, 1, Direction.EAST);
        Monty.setColor(Color.MAGENTA);
        Monty.setLabel("M.O.N.T.Y.");
        
        new Thing (kw, 1, 2);
        new Thing (kw, 1, 3);
        new Thing (kw, 1, 4);
        new Thing (kw, 1, 5);
        new Thing (kw, 1, 6);
        new Thing (kw, 1, 7);
        new Thing (kw, 1, 8);
        new Thing (kw, 1, 9);
        new Thing (kw, 1, 10);
        new Thing (kw, 1, 11);
        
        while (Monty.countThingsInBackpack() < 7){
        Monty.move();
        Monty.pickThing();}
        
        while (Monty.countThingsInBackpack() >= 7){
        Monty.move();
        }
        }
        
        }
        
