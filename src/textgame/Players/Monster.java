/*
 * 
 */
package textgame.Players;

import Interfaces.Inventory;

/**
 *
 * @author chris
 */
public class Monster extends NPC{
    public Monster(){
        initializeDefault();
    }
    
    private void initializeDefault(){
        this.name = "Drunk Brian";
        this.attack = 1.0;
        this.defense = 1.0;
        this.inventory = new Inventory(100);
        this.description = "SHTAHP DREAKING BRIAN";
    }
}
