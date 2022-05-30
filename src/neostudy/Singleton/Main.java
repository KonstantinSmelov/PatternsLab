package neostudy.Singleton;

public class Main {
    public static void main(String[] args) {

        SingletonLogClass log = SingletonLogClass.getInstance();
        SingletonLogClass log2 = SingletonLogClass.getInstance();
        SingletonLogClass log3 = SingletonLogClass.getInstance();

        log3.getClassNameAndShowLog("");
        log.getClassNameAndShowLog(new Object());
        log2.getClassNameAndShowLog(new Exception());
    }
}
