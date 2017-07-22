package strategy;

/**
 * VIP打折规则
 * Created by GR on 2017/7/21.
 */
public class VIPDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(double originPrice) {
        System.out.println("VIP 打五折...");
        return originPrice * 0.5;
    }
}
