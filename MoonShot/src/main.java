import SPACES.Environment;
import FACTORY.EnvironmentFactory;


public class main {
    public static void main(String[] args) {
        EnvironmentFactory ef = new EnvironmentFactory();
        Environment environment = ef.generateRandomEnvironment();
        System.out.println(environment.getValues());
    }
}