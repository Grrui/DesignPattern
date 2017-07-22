package facade;

/**
 * Created by GR on 2017/7/22.
 */
public class Payment {
    public String pay(String food) {
        System.out.println("点餐：" + food + "一份!");
        return food;
    }
}
