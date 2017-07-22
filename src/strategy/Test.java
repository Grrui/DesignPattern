package strategy;

/**
 * Created by GR on 2017/7/21.
 */
public class Test {
    public static void main(String[] args) {
        //null代表普通用户
        DiscountContext discountContext = new DiscountContext(new CommonDiscount());
        double price = 998.99;
        System.out.println("普通用户价格：" + discountContext.getDiscount(price));
        discountContext.changeStrategy(new VIPDiscount());
        System.out.println("VIP用户价格：" + discountContext.getDiscount(price));
    }
}
