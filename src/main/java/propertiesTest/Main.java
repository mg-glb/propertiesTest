package propertiesTest;

import java.io.IOException;
import java.util.Properties;

public class Main {
  public static void main(String[] args) throws IOException{
    Properties props = new Properties();
    String filename = "settings.properties";
    props.load(Main.class.getClassLoader().getResourceAsStream(filename));
    System.out.println(props.getProperty("driver"));
  }
}
