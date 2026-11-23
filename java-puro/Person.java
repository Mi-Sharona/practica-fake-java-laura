import java.util.ArrayList;
import java.util.List;

    public class Person {
        private String name;
        private List<Dog> dogs = new ArrayList<>();

        public Person (String name) {
            this.name = name;
        }

        public boolean adopted (Dog dog) {
            if (dog.isAdopted()) {
                System.out.println(dog.getName() + " adoptado");
                return false;
            }
            dog.setAdopted(true);
            dogs.add(dog);
            return true;
        }
        public int countDogs() {
            return this.dogs.size();
        }

        public List<Dog> findByBreed(String breed) {
            for (Dog b : this.name())
                if (b.getBreed())
            }
        }
}