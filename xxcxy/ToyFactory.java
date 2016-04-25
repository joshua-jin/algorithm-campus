package algorithm.lintcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ToyFactory {
    private static final String DOG = "Dog";
    private static final String CAT = "Cat";
    private static final Map<String, Toy> TOY_STORE = new HashMap<String, Toy>();

    static {
        TOY_STORE.put(DOG, new Dog());
        TOY_STORE.put(CAT, new Cat());
    }

    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        return TOY_STORE.get(type);
    }
}

interface Toy {
    void talk();
}

class Dog implements Toy {
    public void talk() {
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    public void talk() {
        System.out.println("Meow");
    }
}
