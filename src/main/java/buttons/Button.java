/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buttons;

/**
 *
 * @author FATEC ZONA LESTE
 */
/**
 * Interface comum para todos os botões.
 * Todas as variantes de botões (MacOS e Windows) implementarão essa interface.
 */
public interface Button {
    void paint(); // Método abstrato para renderizar o botão
}

/*Essa é uma interface chamada Button. Interfaces são usadas para definir um 
contrato que todas as classes concretas devem seguir. Entao, qualquer 
classe que implemente button tem que fornecer sua própria implementação do método paint().
*/
