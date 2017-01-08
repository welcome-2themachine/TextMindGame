/*
 * 
 */
package textgame.Players;

import Interfaces.Inventory;
import textgame.Items.Item;
import textgame.World.Room;

/**
 *
 * @author chris
 */
public class NPC{
    protected Inventory inventory;
    protected String name;
    protected Room location;
    protected double attack, defense, health;
    protected Item head, clothes, armor, rightHand, leftHand, feet;
    
    public NPC(){
        
    }
}
