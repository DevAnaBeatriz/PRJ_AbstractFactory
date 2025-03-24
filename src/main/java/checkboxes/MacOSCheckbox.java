package checkboxes;

/**
 * Produto concreto da família MacOS.
 * Implementa a interface Checkbox com comportamento específico da plataforma.
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
