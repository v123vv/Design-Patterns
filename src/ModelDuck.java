/**
 * @author cd
 * @date 21/12/2023
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
