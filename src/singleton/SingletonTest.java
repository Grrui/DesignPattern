package singleton;

/**
 * Created by GR on 2017/7/20.
 */
public class SingletonTest {

}

class Singleton{
    //类变量缓存曾经创建的实例
    private static Singleton instance;
    //构造方法私有
    private Singleton(){}
    //静态方法，返回类的实例
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
