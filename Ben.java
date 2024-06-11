import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ben here.
 * 
 * @author (Ryan) 
 * @version (a version number or a date)
 */
public class Ben extends Actor
{
   private int vSpeed = 0;
   private int acceleration = 1;
   private int jumpStrength = 15;
   private boolean onground = true;
    public void act()
    {
        checkKeys();
        
    }
    private void checkKeys() {
        if (Greenfoot.isKeyDown("space") && onground){
            jump();
        }
    }
    private void jump() {
        vSpeed = -jumpStrength;
        onground = false;
    }
}
