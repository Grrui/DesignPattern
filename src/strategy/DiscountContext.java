package strategy;

/**
 * Created by GR on 2017/7/21.
 */
public class DiscountContext {
    private DiscountStrategy strategy;
    public DiscountContext(DiscountStrategy strategy){
        this.strategy = strategy;
    }

    public double getDiscount(double price){
        return strategy.getDiscount(price);
    }

    //改变策略
    public void changeStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    }
}
