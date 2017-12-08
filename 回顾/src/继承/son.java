package 继承;

public class son extends Person {
    public son(int age) {
        super(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
