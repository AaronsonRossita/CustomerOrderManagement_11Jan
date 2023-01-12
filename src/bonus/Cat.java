package bonus;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(int legs) {
        super(legs);
    }

    public Cat(int legs, String name) {
        super(legs);
        this.name = name;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void play() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }
}
