package TheScicilian;

public abstract  class ProductFactory<E extends Product> {
    private final Cartel source;

    public ProductFactory(Cartel c){
        this.source = c;
    }
    public abstract E create();
    public long getPrice(){ return create().getCost();}

    public short getQuality() {
        return create().getQuality();
    }

    public Cartel getSource() {
        Pizza p = new Pizza(null);
        return source;
    }
}
