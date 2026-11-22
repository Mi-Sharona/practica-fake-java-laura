import java.util.ArrayList;
import java.util.List;


// CLASE
    public class Person {
        private String name;
        private List<Dog> dogs = new ArrayList<>();

        // CONSTRUCTOR
        public Person (String name) {
            this.name = name;
        }

        // GETTERS
        public String getName () {
            return this.name;
        }
        // MÉTODO
        public boolean adopted (Dog dog) {
            if (dog.isAdopted()) {
                System.out.println(dog.getName() + " adoptado");
                return false;
            }
            dog.setAdopted(true);
            this.dogs.add(dog);
                return true;
        }
}