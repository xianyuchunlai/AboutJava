package 抽象类;

public class sunday extends Day {
    @Override
    public void whatTime() {
        System.out.println("时间是多少？");
    }

    @Override
    public void show(String string) {
        super.show(string);
    }

    @Override
    public void whatWeather() {
        System.out.println("天气还可以");
    }
}
