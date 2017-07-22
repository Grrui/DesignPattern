package proxy;

/**
 * Created by GR on 2017/7/21.
 */
public class ProxyImage implements Image {

    private Image image;

    public ProxyImage(Image image){
        this.image = image;
    }

    @Override
    public void show() {
        if(image == null){
            image = new BigImage();
        }
        image.show();
    }
}
