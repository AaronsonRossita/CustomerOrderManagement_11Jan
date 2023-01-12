package bonus;

public class Fish extends Animal implements Pet{

    private String name;

    public Fish(int legs) {
        super(legs);
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

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
