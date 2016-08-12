import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
 //method that makes a picture a color chosen
 
  public void createSolid(int red, int blue, int green)  
  {
    Pixel[] pixelArray =this.getPixels();
  for (Pixel pixelObj : pixelArray)
  {pixelObj.setRed(red);
   pixelObj.setBlue(blue);
   pixelObj.setGreen(green);
  }
  }
  
//method that makes every other pixel black, and the others in a color chosen

  public void createPattern(int red, int blue, int green)
  {
    int index=0;
    Pixel[] pixelArray =this.getPixels();
    Pixel pixel = null;
    while (index<pixelArray.length)
    {pixel= pixelArray[index];
      //setting every other pixel black
      pixel.setRed(0);
      pixel.setBlue(0);
      pixel.setGreen(0);
      index = index+1;
      //setting the rest of the pixels in a chosen color
      pixel.setRed(red);
      pixel.setBlue(blue);
      pixel.setGreen(green);
      index=index+1;
    }
}
}
// this } is the end of class Picture, put all new methods before this
 
