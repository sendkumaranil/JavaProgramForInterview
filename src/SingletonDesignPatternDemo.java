import java.lang.reflect.Constructor;

public class SingletonDesignPatternDemo {

    public static void main(String[] args) throws Exception{


        SingletonClass obj1=SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();

        System.out.println(obj1==obj2);//true

        Class cls = Class.forName("com.javaprograms.SingletonClass");
        Constructor[] constructors=cls.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        SingletonClass obj3 = (SingletonClass) constructors[0].newInstance();

        System.out.println(obj1==obj3);//false //break singleton

    }
}
