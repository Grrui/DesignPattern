package simFactory;

/**
 * Created by GR on 2017/7/21.
 */
public class FactoryFactory {
    public static Factory getFactory(String type){
        if(type.equalsIgnoreCase("b"))
            return new BFactory();
        else
            return new CFactory();
    }
}
