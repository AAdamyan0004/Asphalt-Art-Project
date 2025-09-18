import org.code.neighborhood.*;

public class EnderEyes extends EnderHead{
  /*
   *PaintEyes() is a method that will draw the eyes of the enderman
   *
   */
  public void PaintEyes(String color){
    moveFast();
    turnRight();
    move();
    turnRight();
    moveFast();
    turnLeft();
    move();
    turnLeft();
    moveFast();
    turnRight();
    move();
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    backToBase();
    System.out.println("Enderman drawing done :)");
  }
}
