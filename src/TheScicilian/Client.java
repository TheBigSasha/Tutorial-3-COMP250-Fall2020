package TheScicilian;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Client {
    private int health;
    private long money;
    private String name;
    private Product[] inventory;

    public Client() {

    }

    public Client(String name, long money) {
//TODO: Instantiate fields
        this.name = name;
        this.money = money;
        health = 100;
        inventory = new Product[0];
    }

    public long getMoney() {
        return this.money;
    }

    public boolean isDead() {
        return health <= 0;
//TODO: Create this method
    }

    public void injureSelf(int damage) {
        health -= damage;
    }

    /**
     * Tries to buy a product.
     * <p>
     * If succeeded, adds product to inventory. If failed, throws exception.
     *
     * @return The amount of money the sale was for
     * @throws NotEnoughMoneyException if the buyer does not have the required money
     */
    public long buy(Product p) throws NotEnoughMoneyException {
//TODO: You can get the price of the product with p.getCost();
        if (money - p.getCost() < 0) {
            throw new NotEnoughMoneyException();
        }

        Product[] newArr = new Product[inventory.length + 1];
        for (int i = 0; i < this.inventory.length; i++) {
            newArr[i] = this.inventory[i];
        }
        newArr[newArr.length - 1] = p;
        this.inventory = newArr;

        money -= p.getCost();

        return p.getCost();
    }

    public void sell() {
//TODO: Remove the product from inventory and add 80% of it cost to money
        try {
            money += inventory[inventory.length - 1].getCost() * .8;
            Product[] temp = new Product[inventory.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = inventory[i];
            }
            inventory = temp;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nothing left to sell!");
        }
    }

    public String toString() {
//TODO: This method!
        String s = this.name + "\nMoney: " + money + "\nHealth: " + health + "\nInventory: " + Arrays.toString(inventory);
        return s;
    }

    public static String testFields() {
        Client c = new Client();
        Field[] fields = Client.class.getFields();
        StringBuilder sb = new StringBuilder();
        for (Field f : fields) {
            System.out.println(f.getName() + " " + f.getType() + " is a field that can be accessed externally.");
        }
        return sb.toString();
    }
}