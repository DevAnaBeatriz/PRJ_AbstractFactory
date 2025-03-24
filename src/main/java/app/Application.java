package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * A classe Application é o cliente que utiliza uma fábrica abstrata para criar
 * produtos relacionados — neste caso, botões e checkboxes — sem depender de suas
 * classes concretas. Isso permite variar as famílias de objetos criados sem alterar
 * o código do cliente.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    /**
     * O construtor recebe uma instância de GUIFactory. Essa fábrica cria os produtos
     * concretos (botão e checkbox), permitindo que o cliente permaneça desacoplado
     * de suas implementações.
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /**
     * Método que demonstra o uso dos produtos criados pela fábrica.
     * Reforça o princípio de programar para interfaces, não implementações.
     */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
