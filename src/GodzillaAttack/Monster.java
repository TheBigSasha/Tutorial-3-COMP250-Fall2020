package GodzillaAttack;

import java.util.ArrayList;

public abstract class Monster {
    private String name;
    private int health;
    private int hunger;
    private ArrayList<Food> eaten;
    private FoodPreference foodPreference;

    public Monster(int health, String name, FoodPreference fp){
        this.health = health;
        this.name = name;
        this.hunger = 15;
        this.foodPreference = fp;
    }

    public abstract boolean eat(Food f);

    public boolean isAlive(){
        return health > 0;
    }

    private int getHealth(){
        return this.health;
    }



}
