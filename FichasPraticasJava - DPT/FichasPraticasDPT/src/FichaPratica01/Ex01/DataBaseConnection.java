package FichaPratica01.Ex01;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private String connectionString;

    private DataBaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DataBaseConnection getInstance(String connectionString){
        if(instance==null){
            instance = new DataBaseConnection(connectionString);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Database Connection Successful: " + this.connectionString);
    }

    public void disconnect() {
        System.out.println("Database Connection Turned Off: " + this.connectionString);
    }
}
