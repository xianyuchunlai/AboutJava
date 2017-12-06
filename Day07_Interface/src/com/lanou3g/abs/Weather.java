package com.lanou3g.abs;

public abstract class Weather {
	/*
	 * abstract关键字：抽象的
	 * 解释一下抽象：
	 * 		没有具体的对象，就是抽象
	 * 抽象是一个思维过程
	 * 类，对象，都是事物的抽象
	 * 
	 * abstract修饰的类，就叫抽象类
	 * 
	 * 抽象类的特点：
	 * 		不能直接通过new关键字创建该抽象类的对象
	 * ，也就是说，抽象类不能new对象
	 * 
	 * 		有抽象方法的类，一定是一个抽象类，
	 * 	但是，并不是说，抽象类一定有抽象方法。
	 */
	
	//普通的方法
	public void show(){
	}
	
	//抽象方法：没有方法体的方法就是抽象方法
	//抽象方法一定要有abstract关键字修饰
	public abstract void description();
	
	
	
	
	
	
	
	
}
