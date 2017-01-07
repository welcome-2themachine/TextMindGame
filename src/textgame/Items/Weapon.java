/*
 * 
 */
package textgame.Items;

import textgame.Players.Player;

/**
 *
 * @author chris
 */
public class Weapon extends Item{
    protected double damage, hitChance;
    
    public Weapon(){
        this.name = "null";
        this.weight = 0;
        this.damage = 0.0;
        this.hitChance = 0.0;
        this.equipable = false;
    }
    
    public Weapon(String name, double weight, boolean equipable){
        this.name = name; 
        this.weight = weight;
        this.equipable = equipable;
        this.damage = 0.1;
        this.hitChance = 1.0;
    }
    
    public Weapon (String name, double weight, boolean equipable, double damage, double hitChance){
        this.name = name;
        this.weight = weight;
        this.equipable = equipable;
        this.damage = damage;
        this.hitChance = hitChance;
    }
    
    public String attack(Player player){
        //NOT COMPLETE
        return "null";
    }
    
    private double getDamage(){
        return damage;
    }
    
    private double getHitChance(){
        return hitChance;
    }
    
    @Override
    public String toString(){
        return(this.toString() + 
                "\nDamage: " + getDamage() + "\tHit Chance" + getHitChance());    
    }
}
