import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    
    EnderHead ender = new EnderHead();
    //makes the ender object that will make the head
    int paintNumber = 900;
    //the number of paint that will be in the buckets
    ender.setPaint(paintNumber);
    //sets the paint # to the variable we made
    ender.paintEnderHead("Black");
    //uses the paintEnderHead method which will paint the head black because we put the argument "Black"
    EnderEyes enderEye = new EnderEyes();
    //makes the ender eye object that will make the purple eyes
    enderEye.setPaint(paintNumber);
    //sets the paint # to the variable we made
    enderEye.PaintEyes("Purple");
    //uses the PaintEyes method which will paint the eyes purple because we put the argument "Purple"

  }
