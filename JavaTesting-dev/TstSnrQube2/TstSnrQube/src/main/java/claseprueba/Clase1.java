package claseprueba;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Clase1 {
  private static final Logger logger = LoggerFactory.getLogger(Clase1.class);

  public void myMethod() {
    // Ejemplo de un problema de código para que SonarQube lo detecte
    logger.info("Hola Mundo");

    // Ejemplo de un bucle sin propósito
    for (int i = 0; i < 10; i++) {
      logger.info("Iteración {}", i);
    }

    // Ejemplo de una lista no parametrizada
    List<String> myList = new ArrayList<>();
    myList.add("Elemento 1");
    myList.add("Elemento 2");

    // Ejemplo de uso incorrecto de equals()
    String str1 = "Hola";
    String str2 = "Hola";
    if (str1.equals(str2)) {

      logger.info("Las cadenas son iguales");
    }
  }

  public static void main(String[] args) {
    Clase1 myClass = new Clase1();
    myClass.myMethod();
  }
}
