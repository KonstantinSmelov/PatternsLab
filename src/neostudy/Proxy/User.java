package neostudy.Proxy;

public class User  {
    public static void main(String[] args) {
        IDataBase dataBase = new DataBaseProxy(new DataBase());

        System.out.println(dataBase.connectingToDb("my_db"));

    }

}
