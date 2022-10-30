package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Связывание через сеттер
@Component
public class Rabbit4 {

    private Duck5 duck;     // поле (правда что ли?)

    @Autowired
    public void setDuck(Duck5 duck) {       // сеттер -- под капотом создастся конструктор, а уже потом подтянется бин
        this.duck = duck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
