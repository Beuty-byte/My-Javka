package IO;

import java.util.Properties;

public class MainIO {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
