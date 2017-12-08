package 继承;

public class Person {
    private  String name;
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void sayHello (){
        System.out.println("hello");
    }
}

