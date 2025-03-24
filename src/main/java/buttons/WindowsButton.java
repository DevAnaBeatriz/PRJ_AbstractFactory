package buttons;

/**
 * Produto concreto da família Windows.
 * Fornece uma implementação específica de botão para a plataforma Windows.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
