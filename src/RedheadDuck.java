/**
 * @author cd
 * @date 21/12/2023
 */
public class RedheadDuck extends Duck{

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real redhead duck");
    }
}
