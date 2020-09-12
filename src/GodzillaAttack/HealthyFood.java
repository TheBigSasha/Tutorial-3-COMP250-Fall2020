package GodzillaAttack;

public class HealthyFood extends Food {

    public HealthyFood(String name) {
        super(name);
    }

    @Override
    public Object consume() {
        return 155;
    }
}
