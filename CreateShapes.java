
/* Filename: CreateShapes.java 
* Created by: Yen-Chuan(Allen) Liu, A98033113, yel001@ucsd.edu and Pin (Arthur) Chu, A98041513, pichu@acsmail.ucsd.edu
* Partner history for Name1: Pin (Arthur) Chu, A98041513
* Partner history for Name2: Yen-Chuan(Allen) Liu, A98033113
* Date: Oct 15, 2012
*/ 
public class CreateShapes
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) 
    { 
      //creates a world
        World world1 = new World(800,650);
        //Creates four turtles starting at different positions
        Turtle turtle1 = new Turtle (200,600,world1);
        Turtle turtle2 = new Turtle (222,550,world1);
        Turtle turtle3 = new Turtle (244,500,world1);
        Turtle turtle4 = new Turtle (266,450,world1);
        //making each turtle do drawShape method with different size
        turtle1.drawShape(180);
        turtle2.drawShape(160);
        turtle3.drawShape(140);
        turtle4.drawShape(120);
    } 
}
