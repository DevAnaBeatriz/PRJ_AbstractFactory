package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * Interface da fábrica abstrata.
 * Define métodos para criação de produtos pertencentes a uma família. 
 * Permite a criação de objetos relacionados sem depender de suas classes concretas.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
