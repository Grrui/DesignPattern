package bridge;

/**
 * Created by GR on 2017/7/22.
 */
public abstract class AbstractNoodle {
    Peppery style;
    public AbstractNoodle(Peppery style){
        this.style = style;
    }
    public abstract void eat();
}
