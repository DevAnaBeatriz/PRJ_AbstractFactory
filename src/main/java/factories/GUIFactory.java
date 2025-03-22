/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
/**
 * A interface da fábrica abstrata declara métodos de criação para cada tipo de produto.
 * Permite que fábricas concretas implementem a criação de produtos específicos (MacOS ou Windows).
 */
public interface GUIFactory {
    Button createButton(); // Método para criar um botão
    Checkbox createCheckbox(); // Método para criar uma caixa de seleção
}


/*Essa interface GUIFactory que define dois métodos: createButton() e createCheckbox().
As fábricas concretas (MacOS e Windows) precisarão implementar essa interface e fornecer implementações concretas desses métodos.*/


