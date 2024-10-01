package FichaPratica01.Ex01;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DataBaseConnection dbConnection = DataBaseConnection.getInstance("localhost:8000/db");

        dbConnection.connect();

        sleep(3000);

        dbConnection.disconnect();

    }
}