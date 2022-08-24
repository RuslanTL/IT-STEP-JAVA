package Behavioural.Command;

public class BuyStock implements Order{
    private Stock stock;
    public BuyStock(Stock st){
        this.stock = st;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}
