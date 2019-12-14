

public class Marchandise {
    protected int prix;
    protected int stock;

    public Marchandise(int prix, int stock){
        this.prix = prix = 1;
        this.stock = stock;
    }

    public int getStock(){
        return stock;
    }

    public int getPrix(){
        return prix;
    } 
}