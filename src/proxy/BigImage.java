package proxy;

/**
 * Created by GR on 2017/7/21.
 */
public class BigImage implements Image {
    public BigImage(){
        try {
            //暂停3秒，模拟系统开销
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void show() {
        System.out.println("image show...");
    }
}
