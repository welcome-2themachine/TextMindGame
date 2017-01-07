/*
 * 
 */
package textgame.Items;

/**
 *
 * @author chris
 */
public class Item {
    protected double weight;
    protected boolean equipable;
    protected String name;
    protected String description;
    
    public Item(){
        weight = 0;
        equipable = false;
        name = "null";
    }
    
    public Item(String name, double weight, boolean equipable){
        this.name = name;
        this.equipable = equipable;
        this.weight = weight;
    }
    
    public Item(String name, double weight, boolean equipable, String description){
        this.name = name;
        this.equipable = equipable;
        this.weight = weight;
        this.description = description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getName(){
        return name;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String isEquipable(){
        if(equipable){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    
    @Override
    public String toString(){
        return("Name: " + getName() + "\tDescription: " + getDescription() + 
                "\nWeight: " + getWeight() + "\tEquipable: " + isEquipable());
    }
}
