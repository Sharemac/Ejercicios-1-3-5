/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Futbol {
    
   private Robot jack;
   private City unal;
   private Thing balon;
   
   
   public Futbol(){int a=6, b=9, c=6, d=9;
       this.unal = new City(11, 11);
       this.balon = new Thing (this.unal,9 ,9);
       this.jack = new Robot(unal, 9, 9, Direction.WEST);
       while(a<8){
       Wall bloqueoo = new Wall(unal, a, 3, Direction.WEST);
       a++;
       }
       while(b<11){
       Wall bloqueo1 = new Wall(unal, b, 3, Direction.WEST);
       b++;
       }
       while(c<8){
       Wall bloque = new Wall(unal,  c, 9,Direction.EAST);
       c++;
       }
       while(d<11){
       Wall bloq = new Wall(unal, d, 9,Direction.EAST);
       d++;
       }
       /*Wall bloqueo2 = new Wall(unal, 10, 3, Direction.WEST);
       Wall bloque = new Wall(unal, 6, 3, Direction.EAST);
       Wall bloqu = new Wall(unal, 7, 3, Direction.EAST);
       Wall bloq = new Wall(unal, 9, 3, Direction.EAST);
       Wall blo = new Wall(unal, 10, 3, Direction.EAST);*/
   }
    public void advance(){
       this.jack.pickThing();
       this.jack.move();
       this.jack.move();
       this.jack.putThing();
    }
    public void advanceLeft(){int b= 0;
        this.jack.pickThing();        
        this.jack.turnLeft();
        this.jack.move();
        while(b < 3){
        this.jack.turnLeft();
        b++;
        }
        this.jack.putThing();
    }
  
    public void advanceRight(){  int a = 0;
        this.jack.pickThing();
        this.jack.move();
        this.jack.move();
        while(a < 3){
        this.jack.turnLeft();
        a++;
        }
        this.jack.move();
        this.jack.turnLeft();
        this.jack.putThing();
    }
}
