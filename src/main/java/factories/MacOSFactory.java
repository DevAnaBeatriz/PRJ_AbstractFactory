/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
/**
 * Fábrica concreta que cria componentes da interface gráfica para macOS.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton(); // Retorna um botão do macOS
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox(); // Retorna uma caixa de seleção do macOS
    }
}

/*MacOSFactory implementa GUIFactory, então ela precisa implementar os métodos createButton() e createCheckbox()
Esses métodos retornam objetos específicos para o macOS*/
