package pets;

import pets.Pet;

public class Mouse extends Pet {

    public Mouse(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "squeek";
    }


}
