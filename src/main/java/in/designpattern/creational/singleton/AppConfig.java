package in.designpattern.creational.singleton;

import java.io.*;
import java.util.Properties;

public class AppConfig {
    private static final AppConfig iSelf;
    private Properties properties = null;
    private String appKey;
    private String appName;

    static {
        try {
            iSelf = new AppConfig();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static AppConfig getInstance() {
        return iSelf;
    }

    private AppConfig() throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException {
        properties = new Properties();
        properties.load(new InputStreamReader(new FileInputStream(new File("src/main/resources/config.properties"))));
    }

    public String getAppKey() {
        return properties.getProperty("appKey");
    }

    public String getAppName() {
        return properties.getProperty("appName");
    }

    public record ConfigProperties(String appKey, String appName) {

    }

}
