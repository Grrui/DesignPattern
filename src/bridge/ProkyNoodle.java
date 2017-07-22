package bridge;

/**
 * Created by GR on 2017/7/22.
 */
public class ProkyNoodle extends AbstractNoodle {

    public ProkyNoodle(Peppery style) {
        super(style);
    }

    @Override
    public void eat() {
        System.out.println("猪肉面，口味：" + super.style.style());
    }
}
