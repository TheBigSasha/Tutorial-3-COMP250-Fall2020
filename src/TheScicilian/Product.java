package TheScicilian;

public abstract class Product {
    private static final long cost = 0;
    protected boolean legal = true;

    public Cartel getSupplier() {
        return supplier;
    }

    private Cartel supplier;

    public Product(Cartel supplier){
        setSupplier(supplier);
    }

    public long getCost(){
        return cost;
    }

    protected void setSupplier(Cartel supplier) {
        this.supplier = supplier;
    }

    public boolean isLegal(){
        return legal;
    }

    public abstract short getQuality();

    public String toString(){
        return getName() + " costs " + getCost() + " declared as legal: " + isLegal() + " came from " + getSupplier();
    }

    protected abstract String getName();
}
