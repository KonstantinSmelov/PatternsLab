package neostudy.Singleton;

public class SingletonLogClass {

    private static volatile SingletonLogClass singletonLogClass;
    private final StringBuilder log = new StringBuilder("\nЛог вызывов классов: ");

      public static SingletonLogClass getInstance() {
        if(singletonLogClass == null) {
            synchronized (SingletonLogClass.class) {
                if (singletonLogClass == null) {
                    singletonLogClass = new SingletonLogClass();
                }
            }
        }
        return singletonLogClass;
    }

    public void getClassNameAndShowLog(Object o) {
        System.out.println(log.append("\n").append(o.getClass().getName()));
    }
}
