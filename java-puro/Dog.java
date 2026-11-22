// CLASE

public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean adopted;

    // CONSTRUCTOR
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.adopted = false;
    }

    // GETTER
        public String getName () {
            return this.name;
        }
        public String getBreed () {
            return this.breed;
        }
        public int getAge () {
            return this.age;
        }
        public boolean isAdopted () {
            return this.adopted;
        }

        // SETTER
        public void setAdopted (boolean adopted){
            this.adopted = adopted;
        }

    // TO STRING
    @Override
    public String toString() {
        return this.name + (" (" + this.breed + ", " + this.age + " años, " + this.adopted ? " adoptado)");
    }
}