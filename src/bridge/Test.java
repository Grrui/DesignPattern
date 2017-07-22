package bridge;

/**
 * Created by GR on 2017/7/22.
 */
public class Test {
    public static void main(String[] args) {
        AbstractNoodle noodle1 = new BeefNoodle(new PepperyStyle());
        noodle1.eat();
        AbstractNoodle noodle2 = new ProkyNoodle(new PlainStyle());
        noodle2.eat();
    }
}
