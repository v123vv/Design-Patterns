/**
 * @author cd
 * @date 21/12/2023
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
