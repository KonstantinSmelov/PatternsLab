package neostudy.Proxy;

public class DataBase implements IDataBase {
    @Override
    public String connectingToDb(String dataBaseName) {
        return "Подключение к БД " + dataBaseName;
    }
}
