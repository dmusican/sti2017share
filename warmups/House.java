import java.awt.Color;

public class House
{
  
  public static void main(String[] args)
  {
    System.out.println("How big?");
    Scanner in;
    in = new Scanner(System.in);
    int size;
    size = in.nextInt();
    Canvas houseCanvas;                  // declaration
    houseCanvas = new Canvas();          // object creation
    houseCanvas.setSize(500,500);
    houseCanvas.setVisible(true);
    houseCanvas.setInkColor(Color.blue);
    houseCanvas.fillRectangle(100,100,size,size);
    
  } 
  
}