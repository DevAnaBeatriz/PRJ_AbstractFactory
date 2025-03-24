package checkboxes;

/**
 * Produto concreto da família Windows.
 * Implementa a interface Checkbox com comportamento específico da plataforma.
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
