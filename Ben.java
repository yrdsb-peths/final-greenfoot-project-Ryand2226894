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
   private int jumpStrength = 25;
   private boolean onground = true;
    public void act()
    {
        checkKeys();
         fall();          
        checkCollision();
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
    private void fall() {
        if (!onground) {
            setLocation(getX(), getY() + vSpeed);
            vSpeed += acceleration;
        }

        // Check if Ben has landed on the ground
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            setLocation(getX(), getWorld().getHeight() - getImage().getHeight() / 2);
            vSpeed = 0;
            onground = true;
        }
    }
     private void checkCollision() {
        if (isTouching(Bear.class)) {
            getWorld().showText("Game Over!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
