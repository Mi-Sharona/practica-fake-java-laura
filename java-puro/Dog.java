// CLASE

public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean adopted;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.adopted = false;
    }
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
        public void setAdopted (boolean adopted){
            this.adopted = adopted;
        }

    @Override
    public String toString() {
        return this.name + (" (" + this.breed + ", " + this.age + " años, " + this.adopted ? " adoptado)");
    }
}