package 抽象类;

public abstract class Day {
    public  void show(String string){
        System.out.println("今天是"+string);
    }

    public abstract  void whatTime();
    public abstract void whatWeather();
}
