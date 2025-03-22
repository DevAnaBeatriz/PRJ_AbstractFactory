
import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */

/**
 * Classe principal que escolhe dinamicamente a fábrica apropriada e inicia a aplicação.
 */

/*O código identifica o sistema operacional e escolhe a fábrica apropriada (Windows ou macOS).

Cria uma Application usando essa fábrica e chama paint() para exibir os resultados.*/
public class Demo {

    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        // Seleciona a fábrica correta com base no sistema operacional
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}

