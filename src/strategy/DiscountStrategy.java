package strategy;

/**
 * 打折的接口
 * Created by GR on 2017/7/21.
 */
public interface DiscountStrategy {
    double getDiscount(double originPrice);
}
