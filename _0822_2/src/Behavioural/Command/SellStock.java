package Behavioural.Command;

public class SellStock implements Order{
    private Stock stock;
    public SellStock(Stock st){
        this.stock = st;
    }
    @Override
    public void execute() {
        stock.sell();
    }
}

