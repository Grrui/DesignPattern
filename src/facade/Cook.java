package facade;

/**
 * Created by GR on 2017/7/22.
 */
public class Cook {
    public String cook(String food) {
        System.out.println("厨师正在烹调：" + food);
        return food;
    }
}
