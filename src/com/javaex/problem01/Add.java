package com.javaex.problem01;


public class Add {
	
    private int a;
    private int b;
    public void Add() {}
    public void Add(int a , int b) {
    	this.a=a;
    	this.b=b;
   
    }
    public int getA() {
    	return a;
    	
    }
    public void setA(int a){
    	this.a = a;
    }
    public int getB() {
    	return b;
    	
    }
    public void setB(int b){
    	this.b = b;
    }
    public void setValue(int a, int b ) {
    	this.a=a;
    	this.b=b;
    }

    public int Calculate () {
    	return a+b;
    }
}
