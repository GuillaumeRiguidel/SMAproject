

public class Marchandise {
    protected int prix;
    protected int stock;

    public Marchandise(int prix, int stock){
        this.prix = prix;
        this.stock = stock;
    }

    public int getStock(){
        return this.stock;
    }

    public int getPrix(){
        return this.prix;
    } 
}