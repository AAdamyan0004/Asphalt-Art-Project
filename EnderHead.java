import org.code.neighborhood.*;

public class EnderHead extends PainterPlus{
  
  public void paintEnderHead(String color){
      /*
       *paintEnderHead() is a method that will draw the eyes of the enderman
       *
       */

    //these 10 lines will make the painter move one row then turn to the next row and then finish that row.
    paint(color);
    moveRightThenTurnLeft(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    moveLeftThenTurnRight(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);

    moveRightThenTurnLeft(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    moveLeftThenTurnRight(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);

    moveRightThenTurnLeft(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    moveLeftThenTurnRight(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);

    moveRightThenTurnLeft(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    moveLeftThenTurnRight(color);

    backToBase();
  }
  /*
  *moveRightThenTurnLeft() is a method that will draw a whole line if facing east 
  *
  */
  public void moveRightThenTurnLeft(String color){
    if(isFacingEast()){
      while(canMove()){
        move();
        paint(color);
      }
    }
  }
  public void moveLeftThenTurnRight(String color){
    if(isFacingWest()){
      while(canMove()){
        move();
        paint(color);
      }
    }
  }
  /*
  *moveLeftThenTurnRight() is a method that will draw a whole line if facing west
  *
  */


   /*
  *backToBase() move the painter back to the starting point no matter where it is located.
  *
  */
  public void backToBase(){
    while(!isFacingNorth()){
      turnLeft();
    }
    while(canMove()){
      move();
    }
    while(!isFacingWest()){
      turnLeft();
    }
    while(canMove()){
      move();
    }
  }
}
