/*
 * 
 */
package textgame.World;

/**
 *
 * @author chris
 */
public class Map {
    protected String name;
    protected Room[][][] map;
    protected int xAxis, yAxis, zAxis;
    
    public Map(){
        name = "default";
        map = new Room[10][3][10];
        xAxis = 10;
        yAxis = 3;
        zAxis = 10;
    }
    
    public Map(String name, int x, int y, int z){
        this.name = name;
        map = new Room[x][y][z];
        this.xAxis = x;
        this.yAxis = y;
        this.zAxis = z;
    }
    
    private void initialize(){
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 3; y++){
                for(int z = 0; z < 10; z++)
                map[x][y][z] = new Room(); //REDO: create "world builder" that takes world name, x, y, z and returns a room based on predecided map
            }
        }
    }
    
    public Room get(int x, int y, int z){
        if((x > this.xAxis)|(y > this.yAxis)|(z > this.zAxis)){
            return null;
        }
        return map[x][y][z];
    }
}
