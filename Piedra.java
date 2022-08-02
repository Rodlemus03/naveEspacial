import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Piedra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piedra extends Actor
{
    /**
     * Act - do whatever the Piedra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int contador=0;
    public void act()
    {
        Movimiento();
        breaker();
    }
    
    public void Movimiento(){
        move(4);
        if(Greenfoot.getRandomNumber(100)<10){
        turn(Greenfoot.getRandomNumber(90)-45);
        contador++;
    }if(getX()<=5 || getX()>=getWorld().getWidth()-5){
        contador++;
        turn(180);
    }if(getY()<=5 || getY()>=getWorld().getHeight()-5){
        contador++;
        turn(180);
    }
    }
    public void breaker(){
        //Contador tiempo
            
        //Fin contador
        Actor nave;
        nave=getOneObjectAtOffset(0,0,Nave.class);
        if(nave!=null){
            World world;
            world=getWorld();
            world.removeObject(nave);
            Greenfoot.playSound("asteroide.wav");
            Greenfoot.stop();
            JOptionPane.showMessageDialog(null,"Lo siento, perdiste con "+contador+" puntos","Ojo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
