package strategy;

/**
 * 普通用户打折
 * Created by GR on 2017/7/21.
 */
public class CommonDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(double originPrice) {
        System.out.println("普通用户打折...");
        return originPrice * 0.7;
    }
}
