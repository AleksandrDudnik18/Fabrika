package AbstractFactory.AmChairs;

public class NewDecorChair extends AmChair{

    public NewDecorChair(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "it is " + name + " of new decor chair";
    }
}
