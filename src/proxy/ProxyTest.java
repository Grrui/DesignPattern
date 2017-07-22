package proxy;

/**
 * Created by GR on 2017/7/21.
 */
public class ProxyTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Image image = new ProxyImage(null);
        System.out.println("加载图片耗时："+(System.currentTimeMillis()-startTime));
        //调用show方法时，才会真正执行加载
        long startTime2 = System.currentTimeMillis();
        image.show();
        System.out.println("加载图片真正耗时："+(System.currentTimeMillis()-startTime2));
    }
}
