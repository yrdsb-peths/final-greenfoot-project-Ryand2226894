 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
  private int speed = 2;
    public void act()
    {
        moveLeft();
    }
    public void moveLeft() {
        setLocation(getX() - speed, getY());
        if (getX() < 0) {
            setLocation(getWorld().getWidth(), getY());
        }
    }
}
