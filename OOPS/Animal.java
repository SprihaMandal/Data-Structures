public class Animal {
    private String name;
    private Boolean isFriendly;
    private int id;

    // Animal() {
    // System.out.println("Animal");
    // }
    Animal() {
        this.name = "animal";
        this.isFriendly = false;
        System.out.println("Name: " + name + "is friendly: " + isFriendly + "id " + id);
    }

    Animal(String name) {
        this.name = name;
    }

    Animal(String name, Boolean isFriendly) {
        this(name);
        this.isFriendly = isFriendly;
    }

    public String makeSound() {
        return "I make sound";
    }

    public void train() {
        System.out.println("Training....." + this.name);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        Train.behave();
    }

    public void greet() {
        System.out.println(name + makeSound());
        System.out.println("i am isFriend" + isFriendly);
    }

}
