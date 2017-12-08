package 接口;

public class Show {
    Work work ;

    public void setWork(){
        this.work = work;
    }

    public void startWork(){
        //work这个接口的引用
        //会指向一个实现类对象
        //这里就是调用这个实现类对象的work方法
       this.work.sleep();
    }

    public void endWork(){
        this.work.sayHello();
    }

    public void justsoso(){
        this.work.work();
    }

}
