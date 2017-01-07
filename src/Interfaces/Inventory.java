/*
 * 
 */
package Interfaces;

import textgame.Items.Item;
import textgame.Items.Weapon;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Inventory {
    private double maxWeight;
    private double currentWeight;
    private ArrayList<Item> pack = new ArrayList<Item>();
    
    public Inventory(){
        maxWeight = 0;
        currentWeight = 0;
    }
    
    public Inventory(int maxWeight){
        this.maxWeight = maxWeight;
        currentWeight = 0;
    }
    
    public String addItem(Item addMe){
        if((currentWeight + addMe.getWeight()) <= maxWeight){
            pack.add(addMe);
            currentWeight += addMe.getWeight();
            return(addMe.getName() + " has been added to inventory.");
        }
        else{
            return(addMe.getName() + " is too heavy to carry.");
        }
    }
    
    public String dropItem(String name){
        for(int i = 0; i < pack.size(); i++){
            if(name.equalsIgnoreCase(pack.get(i).getName())){
                pack.remove(pack.get(i));
                return(name + " has been removed. Let's hope you don't need it later.");
            }
        }
        return("Unable to locate item. Are you sure you didn't leave it somewhere?");
    }
    
    public void listItems(){
        for(int i = 0; i < pack.size(); i++){
            if((i+1)%2 == 0){
                System.out.print("\t" + (i+1) + ')' + pack.get(i).getName());
            }
            else{
                System.out.print("\n" + (i+1) + ')' + pack.get(i).getName());
            }
        }
        System.out.println("For additional options, say \"examine ITEM\"");
    }
    
    public void examineItem(int index){
        if(pack.get(index - 1) instanceof Weapon){
            
        }
        else if(pack.get(index - 1) instanceof Weapon){
            
        }
        else{
            
        }
    }
    
    public void compareItems(int index1, int index2){
        examineItem(index1);
        examineItem(index2);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return("This is an inventory with " + pack.size() + " items. "
                + "\nThe maxWeight is " + maxWeight +
                "\nThe currentWeight is " + currentWeight);
    }
}
