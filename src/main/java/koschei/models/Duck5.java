package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Связывание с помощью поля
@Component
public class Duck5 {

    // Spring под капотом использует рефлексию для создания бинов, поэтому все эти сеттеры и конструкторы можно опустить
    @Autowired
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
