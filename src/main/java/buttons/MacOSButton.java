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
 * Implementação do botão específico para macOS.
 */
public class MacOSButton implements Button {
    
    @Override
    public void paint() {
        // Exibe uma mensagem para indicar que um botão do macOS foi criado
        System.out.println("You have created MacOSButton.");
    }
}


/*Esta classe MacOSButton implementa Button, ou seja, precisa definir o método paint()
quando paint() for chamado, ele imprimirá: Você criou um MacOSButton. no console.*/ 
