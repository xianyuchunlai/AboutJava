package com.lanou3g.study.extend;

public class Animal {
	/*
	 * 什么是继承？
	 * 	Java面向对象编程的三大特性之一
	 * 	封装，继承，多态
	 * A 类 继承了 B 类
	 * B 类是父类 王健林
	 * A 类是子类 王思聪
	 *  子类可以继承父类的属性和方法
	 *  创建一个类Pig，使用extends关键字
	 *  			继承Animal这个类
	 */
	
//	public Animal(){
//		System.out.println("-----动物动物-----");
//	}
	
	public Animal(String kind){
		this.kind = kind;
		System.out.println("这个动物的种族为："+kind);
	}
	
	
	

	//表示种族
	private String kind;
	
	public void sleep(){
		System.out.println("睡一会");
	}
	
	
	
	
	
	
	
}
