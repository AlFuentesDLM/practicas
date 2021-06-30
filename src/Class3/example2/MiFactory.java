package Class3.example2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance() {
        String path = "/Users/alfuentes/IdeaProjects/Practica2/src/MiFactory.properties";
        Object c = new Object();
        try(InputStream input = new FileInputStream(path)) {
            Properties p = new Properties();
            p.load(input);
            String propName = p.getProperty("sorter");
            c = Class.forName(propName).getConstructor().newInstance();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return c;
    }
}
