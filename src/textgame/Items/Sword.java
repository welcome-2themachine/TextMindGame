/*
 * 
 */
package textgame.Items;

/**
 *
 * @author chris
 */
public class Sword extends Weapon{
    protected double specialAttack;
    
    public Sword(){
        specialAttack = 0;
    }
    
    public Sword (int spcAtk){
        this.specialAttack = spcAtk;
    } 
    
}
