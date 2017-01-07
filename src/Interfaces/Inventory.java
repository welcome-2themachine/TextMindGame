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
    private ArrayList<Item> inventoryList = new ArrayList<Item>();
    
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
            inventoryList.add(addMe);
            currentWeight += addMe.getWeight();
            return(addMe.getName() + " has been added to inventory.");
        }
        else{
            return(addMe.getName() + " is too heavy to carry.");
        }
    }
    
    public String dropItem(String name){
        for(int i = 0; i < inventoryList.size(); i++){
            if(name.equalsIgnoreCase(inventoryList.get(i).getName())){
                inventoryList.remove(inventoryList.get(i));
                return(name + " has been removed. Let's hope you don't need it later.");
            }
        }
        return("Unable to locate item. Are you sure you didn't leave it somewhere?");
    }
    
     public String dropItem(int name){
         if((name - 1) > inventoryList.size()){
            return("Unable to locate item. Are you sure you didn't leave it somewhere?");
         }
         else{
                inventoryList.remove(inventoryList.get(name-1));
                return(name + " has been removed. Let's hope you don't need it later.");  
         }
     }
    
    public String useItem(String use){
        for(int i=0; i<inventoryList.size(); i++){
            if(use.equalsIgnoreCase(inventoryList.get(i).getName())){
                inventoryList.remove(inventoryList.get(i));
                return(use + " has been used.");
            }
        }
        return (use + " cannot be used.");
    }
    
    public void listItems(){
        for(int i = 0; i < inventoryList.size(); i++){
            if((i+1)%2 == 0){
                System.out.print("\t" + (i+1) + ')' + inventoryList.get(i).getName());
            }
            else{
                System.out.print("\n" + (i+1) + ')' + inventoryList.get(i).getName());
            }
        }
        System.out.println("For additional options, say \"examine ITEM\"");
    }
    
    public void examineItem(int index){
        if(inventoryList.get(index - 1) instanceof Weapon){
            
        }
        else if(inventoryList.get(index - 1) instanceof Weapon){
            
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
        return("This is an inventory with " + inventoryList.size() + " items. "
                + "\nThe maxWeight is " + maxWeight +
                "\nThe currentWeight is " + currentWeight);
    }
}
