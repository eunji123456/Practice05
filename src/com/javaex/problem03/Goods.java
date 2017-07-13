package com.javaex.problem03;

public class Goods {

    private String name;
    private int price;
    private int count;
    
    public Goods() {}
    public Goods(String name ,int price ,int count) {
    	this.name=name;
    	this.price=price;
    	this.count=count;
    	
    }
    public void setname (String name) {
    	this.name = name;
    	
    }
    public void setprice (int price) {
    	this.price = price;
    	
    }
    public void price (int count) {
    	this.count = count;
    	
    }
    public int count () {
    	return count;
    	
    }
    public String getname () {
    	return name;
    	
    } public int getprice () {
    	return price;
    	
    }
    public int sum() {
    	int sum=+ price;
    	return sum;
    }
    public void showinfo() {
    	 String a ="이름:"+name+" 가격:"+price+"   갯수:"+count;
    	 System.out.println(a);
    }
}
