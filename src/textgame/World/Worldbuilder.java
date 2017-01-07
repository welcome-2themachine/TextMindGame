/*
 * 
 */
package textgame.World;

/**
 *
 * @author chris
 */
public class Worldbuilder {
    public Room Worldbuilder(String worldName, int x, int y, int z){
        if(worldName.equalsIgnoreCase("Forest")){
            //create forest based on x, y, z
            return new Room();
        }
        else if(worldName.equalsIgnoreCase("Town")){
            //create town based on x, y, z
            return new Room();
        }
        else if(worldName.equalsIgnoreCase("Desert")){
            //create desert based on x, y, z
            return new Room();
        }
        else{
            return new Room();
        }
    }
}
