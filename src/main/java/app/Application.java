/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 *
 * @author FATEC ZONA LESTE
 */
/**
 * A classe Application usa a fábrica abstrata para criar e utilizar os componentes da GUI.
 * Isso garante que a aplicação funcione com qualquer conjunto de produtos (MacOS ou Windows).
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    /**
     * O construtor recebe uma fábrica e cria os componentes apropriados.
     * O cliente não precisa saber qual fábrica está sendo usada.
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /**
     * Método que desenha os componentes criados.
     */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

/*Application recebe uma fábrica (GUIFactory), permitindo que ela crie botões e checkboxes dinamicamente.

O método paint() executa os métodos paint() de Button e Checkbox, mostrando os resultados.*/