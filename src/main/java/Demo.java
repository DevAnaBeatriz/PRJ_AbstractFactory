import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/**
 * Classe cliente responsável por detectar o sistema operacional e instanciar
 * a fábrica correspondente. Demonstra o uso do padrão Abstract Factory.
 */
public class Demo {
    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        // Cliente permanece independente da implementação concreta
        Application app = new Application(factory);
        app.paint();
    }
}
