package 继承;

public class girl extends Person {

    public girl(int age) {
        super(age);
    }

    public void sayHello(String str) {
        System.out.println("say" + str);
        super.sayHello();
    }
}
