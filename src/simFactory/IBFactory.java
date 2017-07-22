package simFactory;

/**
 * Created by GR on 2017/7/20.
 */
public class IBFactory {
    public IB getIB() {
        return new C();
    }
}
