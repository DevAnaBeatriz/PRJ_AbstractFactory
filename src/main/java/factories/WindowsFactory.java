
package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
/**
 * Fábrica concreta que cria componentes da interface gráfica para Windows.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton(); // Retorna um botão do Windows
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Retorna uma caixa de seleção do Windows
    }
}

/*Mesma lógica da MacOSFactory, mas para Windows.**/
