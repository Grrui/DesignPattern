package simFactory;

/**
 * Created by GR on 2017/7/21.
 */
public class CFactory implements Factory {
    @Override
    public IB getIB() {
        return new C();
    }
}
