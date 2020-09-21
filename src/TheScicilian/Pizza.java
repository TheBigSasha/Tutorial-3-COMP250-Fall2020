package TheScicilian;

public class Pizza extends Product{
    private static final long cost = 15;

    public Pizza(Cartel c) {
        super(c);
    }

    @Override
    public short getQuality() {
        return 10;
    }

    @Override
    protected String getName() {
        return "pizza pie! Very legal";
    }
}