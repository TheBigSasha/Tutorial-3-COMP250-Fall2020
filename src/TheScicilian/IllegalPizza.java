package TheScicilian;

public class IllegalPizza extends Pizza implements Illegal{
    public IllegalPizza(Cartel c){
        super(c);
        this.legal = false;
    }

    @Override
    public String commitCrime() {
        return "I dislike bubble tea.";
    }

    public String toString(){
        return super.toString() + " is actually illegal :p ";
    }
}
