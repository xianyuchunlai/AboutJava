package com.lanou3g.extend;

public class Car {
	private int wheels;
	private String color;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		System.out.println("---------我是父类中的setColor方法："+color
				+"     当前类的类型为："+this.getClass().getName());
		//我们已经知道了this的类型为BigCar
		//this.color指的是谁的color呢？
		this.color = color;
	}
	
	public void speed(){
		System.out.print("这辆车加速了");
	}
	
	
	
	
	
	
	
	
	
	
	
}
