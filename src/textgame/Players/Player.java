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
public class Player {
    protected Inventory inventory;
    protected Room location;
    protected double attack, defense, intellect, perception;
    protected Item head, clothes, armor, rightHand, leftHand, feet;

    public Player() {
        
    }
    
    public Player(String name, double health, int money, Inventory inventory){
        
    }
    
    public void initialize(){
        //calls the create player function
        //sends what kind of player you are buildings
    }
}
