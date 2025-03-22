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
 * Implementação do botão específico para Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        // Exibe uma mensagem para indicar que um botão do Windows foi criado
        System.out.println("You have created WindowsButton.");
    }
}

/* Esta classe segue a mesma ideia da MacOSButton, mas sua implementação do 
método paint() imprime uma mensagem diferente para indicar que o botão 
pertence ao Windows**/
