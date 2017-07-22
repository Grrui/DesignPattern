package simFactory;

/**
 * Created by GR on 2017/7/20.
 */
public class A {
    private IB ib;
    public A(IB ib){
        this.ib = ib;
    }
    public void show(){
        ib.show();
    }

    public static void main(String[] args) {
        //通过传参来确定生产的工厂
        Factory factory =  FactoryFactory.getFactory("B");
        A a = new A(factory.getIB());
        a.show();
    }
}
