/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author wafflecarg
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    
    private ArrayList <Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
        
    
    }
    
    public Feature addNewFeature(){
        Feature newFeature = new Feature(this);
        features.add(newFeature);
        return newFeature;
    }
    
    @Override
    public String toString() {
        return name;
    }

   
}