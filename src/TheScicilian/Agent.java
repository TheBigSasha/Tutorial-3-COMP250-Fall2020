package TheScicilian;

public class Agent extends Client{

    public Agent(String name, long money) {
        super("Agent " + name, money);
        //TODO: Constructor somehow?
    }

    public long buy(Product p) throws NotEnoughMoneyException {
        if (!p.isLegal() || p instanceof Illegal) {
            p.getSupplier().report(this);
            System.out.println("Bruh we merked that cartel hard");
            System.exit(0);
        }
        return super.buy(p);
        //TODO: Match the client's buy method but if the product is illegal, destroy it and report the cartel it came from!
    }
}
