public class Dog extends Animal {

    Dog(String name, Boolean isFriend) {

        super(name, isFriend);
    }

    Dog() {
        super();
    }

    @Override
    public String makeSound() {
        return "wooff wooof";
    }
}
