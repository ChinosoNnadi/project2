package Class22;
import java.lang.reflect.Constructor;
public abstract class ABSTester {
    int age;
   /* Constructor is allowed in abstract class
   * we cannot create an object of an abstract class
   * Not make sense to have a private method is an abstract class
   * implement and abstract methods are allowed
   * Static method is allowed in abstract*/
}
interface A{
    /*instance field is not allowed in interface
    * object of an interface is not allowed
    * Interface is designed for abstraction
    * private methods in interface class is
    * static method is allowed in interface
    * public is not allowed but it should be default*/
}
