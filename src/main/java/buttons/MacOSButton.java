package buttons;

/**
 * Produto concreto da família MacOS.
 * Implementa a interface Button com o comportamento específico da plataforma.
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
