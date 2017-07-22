package facade;

/**
 * Created by GR on 2017/7/22.
 */
public class Facade {
    Payment payment;
    Cook cook;
    Serve serve;
    public Facade() {
        this.payment = new Payment();
        this.cook = new Cook();
        this.serve = new Serve();
    }
    public void serveFood(String food){
        payment.pay(food);
        cook.cook(food);
        serve.serve(food);
    }
}
