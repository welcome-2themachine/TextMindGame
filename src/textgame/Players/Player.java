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
public class Player extends NPC{
    protected Room lastLocation;
    protected double intellect, perception;
    protected int money;

    public Player() {
        
    }
    
    public Player(Room test){
        
    }
    
    public Player(String name, double health, int money, Inventory inventory, Room location){
        this.name = name;
        this.health = health;
        this.money = money;
        this.inventory = inventory;
        this.location = location;
    }
    
    public void initializeCustom(){
        
    }
    
    private void initializeDefault(){
        this.name = "Brian";
        this.attack = 1.5;
        this.defense = 1.5;
        this.intellect = 0.1;
        this.perception = 0.1;
        this.health = 10;
        this.money = 0;
        this.inventory = new Inventory(75);
    }
    
    public void setLocation(Room location){
        this.location = location;
    }
    
    public Room getLocation(){
        return location;
    }
    
    @Override
    public String toString(){
        String toString = "Name: " + name + "\n"
                + "Attack: " + attack + "\tDefense" + defense + "\n"
                + "Health: " + health + "\tMoney: $" + money + "\n"
                + inventory.toString();
        return toString;
    }
}
