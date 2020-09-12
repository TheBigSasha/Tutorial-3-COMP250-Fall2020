package GodzillaAttack;

public abstract class Food {
    private String name;

    public Food(String name){
        this.name = name;
    }

    public abstract Object consume();

    public String getName(){
        return name;
    }

}
