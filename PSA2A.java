/* Filename: PSA2A.java 
* Created by: Yen-Chuan(Allen) Liu, A98033113, yel001@ucsd.edu and Pin (Arthur) Chu, A98041513, pichu@acsmail.ucsd.edu
* Partner history for Name1: Pin (Arthur) Chu, A98041513
* Partner history for Name2: Yen-Chuan(Allen) Liu, A98033113
* Date: Oct 15, 2012
*/ 
public class PSA2A 
{
    public static void main (String[] args) 
    { 
      //choose a picture and make it blue
      String fname = FileChooser.pickAFile();
      Picture pic = new Picture(fname);
      pic.createSolid(0,255,0);
      pic.show();
      
      //choose a picture and one the other pixel in the picture black and the others the color chosen.
      String fname2 = FileChooser.pickAFile();
      Picture pic2 = new Picture(fname2);
      pic2.createPattern(255,0,0);
      pic2.show();
    } 
    
}
