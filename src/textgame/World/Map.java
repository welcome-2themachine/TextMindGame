/*
 * 
 */
package textgame.World;

import Interfaces.Inventory;
import textgame.Items.Item;
import textgame.Items.Weapon;
import textgame.Players.Monster;

/**
 *
 * @author chris
 */
public class Map {
    protected String name;
    protected Room[][][] map;
    protected int xAxis, //Width
                  yAxis, //Depth
                  zAxis; //Height
    
    public Map(){
        name = "default";
        xAxis = 1;
        yAxis = 3;
        zAxis = 2;
        map = new Room[xAxis][yAxis][zAxis];
    }
    
    public Map(String name, int x, int y, int z){
        this.name = name;
        map = new Room[x][y][z];
        this.xAxis = x;
        this.yAxis = y;
        this.zAxis = z;
    }
    
    public void initialize(String type){
        for(int z = 0; z < this.zAxis; z++){
            for(int x = 0; x < this.xAxis; x++){
                for(int y = 0; y < this.yAxis; y++)
                map[x][y][z] = new Room(); //REDO: create "world builder" that takes world name, x, y, z and returns a room based on predecided map
            }
        }
    }
    
    private void initialize(){
        map[0][0][0] = new Room(0, 0, 0);
        map[0][0][0].description = "A mountain pass behind you is blocked.";
        map[0][0][0].mobs = null;
        map[0][0][0].inventory = new Inventory(1000);
        map[0][0][0].inventory.addItem(new Weapon("Sword", 3.4, true, 1, 1));
        map[0][1][0] = new Room(0, 0, 1);
        map[0][1][0].description = "A wide open field";
        map[0][1][0].mobs = null;
        map[0][1][0].inventory = new Inventory(1000);
        map[0][1][0].inventory.addItem(new Item("A piece of cow", 10, false, "Litterally a few pieces of cow in a pile"));
        map[0][2][0] = new Room(0, 0, 2);
        map[0][2][0].description = "A creepy old house with an even creepier stair case. Zoinks!";
        map[0][2][0].inventory = new Inventory(1000);
        map[0][2][0].inventory.addItem(new Item("A fat doobie", 0.5, false, "Shaggy would be proud"));
        map[0][2][0].mobs = null;
        map[0][0][1] = null;
        map[0][1][1] = null;
        map[0][2][1] = new Room(0, 2, 1);
        map[0][2][1].description = "A creepy attick with a mysterious figure in it.";
        map[0][2][1].inventory = new Inventory(1000);
        map[0][2][1].mobs.add(new Monster());
    }
    
    public Room get(int x, int y, int z){
        if((x > this.xAxis)|(y > this.yAxis)|(z > this.zAxis)){
            return null;
        }
        return map[x][y][z];
    }
    
    @Override
    public String toString(){
        return("Name: " + this.name +
                "X: " + this.xAxis + "\tY: " + this.yAxis + "\tZ: " + this.zAxis);
    }
}
