package com.demo.streams;
/**
 * 
 * @author shantanu
 *
 */
public class Item {
    private String name;
    public Item(){     
    }
    public Item(String name){     
        this.name=name;
    }
    public static String getStaticVal(){
        return "Static Val";
    }
    public String getMsg(){
        return "Hello My World!";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}