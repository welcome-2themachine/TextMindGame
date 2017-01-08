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
    int x, y, z;
    String description;
    Inventory inventory = new Inventory(1000);
    ArrayList<NPC> mobs = new ArrayList<NPC>();
    Room up, down, north, south, east, west;
    
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
}
