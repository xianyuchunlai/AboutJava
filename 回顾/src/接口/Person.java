package 接口;

public class Person implements Work {
    public Person() {
        super();
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {

    }

    public void growUp(int cm) {
        System.out.println("长了" + cm + "厘米");
    }
}
