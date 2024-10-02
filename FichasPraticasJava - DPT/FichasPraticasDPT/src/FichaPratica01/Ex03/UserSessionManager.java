package FichaPratica01.Ex03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;

    private UserSessionManager() {
        this.sessionToken = generateSessionToken();
        this.lastAccess = generateLastAccess();
    }

    public static UserSessionManager getInstance(){
        if(instance==null){
            instance = new UserSessionManager();
        }
        return instance;
    }

    private int generateSessionToken(){
        Random random = new Random();
        return random.nextInt(1000);
    }

    private String generateLastAccess(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        return formattedNow;
    }

    public String updateLastAccessTime(){
        long updatedTime = System.currentTimeMillis();
        this.lastAccess = Long.toString(updatedTime);
        return this.lastAccess;
    }

    public int getSessionToken() {
        return this.sessionToken;
    }

    public String getLastAccessTime() {
        return this.lastAccess;
    }
}