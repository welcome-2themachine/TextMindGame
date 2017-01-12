/*
 * 
 */
package textgame.World;

import textgame.Players.NPC;
import java.util.ArrayList;
import Interfaces.Inventory;

/**
 *
 * @author chris
 */
public class Room {
    protected int x, y, z;
    protected String description;
    protected Inventory inventory = new Inventory(1000);
    protected ArrayList<NPC> mobs = new ArrayList<NPC>();
    protected Room up, down, north, south, east, west;
    
    public Room(){
        
    }
    
    public Room(int x, int y, int z){
        
    }
    
    public int[] getPosition(){
        int[] position = {x, y, z};
        return position;
    }
    
    private void initialize(){
        
    }
    
    public Inventory getInventory(){
        return inventory;
    }
}
