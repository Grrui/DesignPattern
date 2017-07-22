package bridge;

/**
 * Created by GR on 2017/7/22.
 */
public class BeefNoodle extends AbstractNoodle {

    public BeefNoodle(Peppery style) {
        super(style);
    }

    @Override
    public void eat() {
        System.out.println("牛肉面，口味：" + super.style.style());
    }
}
