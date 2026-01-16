package dp.singleton;

public class SingletonTest {

    private static SingletonTest instance;

    private SingletonTest(){
        System.out.println("SingletonTest object is created");
    }

    public static SingletonTest getInstance(){
        if(instance==null){
            synchronized (SingletonTest.class){ //only one thread enters this block at a time
                if(instance == null){ // double check locking
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }


}
