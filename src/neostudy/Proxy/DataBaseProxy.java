package neostudy.Proxy;

public class DataBaseProxy implements IDataBase {

    private final IDataBase dataBase;
    public String path = "localhost:8080/";

    public DataBaseProxy(IDataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String connectingToDb(String dataBaseName) {
        return dataBase.connectingToDb(path + dataBaseName);
    }
}
