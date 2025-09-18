import org.code.neighborhood.*;

public class PainterPlus extends Painter {

   /*
  *moveLeftThenTurnRight() is a method that will draw a whole line if facing west
  *
  */
  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
  }
   /*
  *moveLeftThenTurnRight() is a method that will draw a whole line if facing west
  *
  */
  public void turnAround(){
     turnLeft();
     turnLeft();
  }
   /*
  *moveLeftThenTurnRight() is a method that will draw a whole line if facing west
  *
  */
  public void moveFast(){
    while(canMove()){
      move();
    }
  }
  
  public void paintLine(String color){
    while(canMove()){
      move();
      paint(color);
    }
  }
  
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
  }

  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void paintDonut(String color){
    while(hasPaint()){
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
}
