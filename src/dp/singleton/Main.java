package dp.singleton;

public class Main {
   public static void main(String[] args) {
       SingletonTest singletonTest = SingletonTest.getInstance();
       SingletonTest singletonTest1 = SingletonTest.getInstance();

       System.out.println(singletonTest.hashCode());
       System.out.println(singletonTest1.hashCode());

    }
}
