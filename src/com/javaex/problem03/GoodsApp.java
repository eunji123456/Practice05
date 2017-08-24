package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	System.out.println("상품 3개를 입력해주세요.");
    	Scanner sc = new Scanner (System.in);
    
    	List<Goods> glist = new ArrayList<Goods>();
    	int count=0;
    	
    	for(int i =0;i<3;i++) {
    	String data = sc.nextLine();
    	String []SpData = data.split(" ");
    	
    	Goods goods = new Goods(SpData[0],Integer.parseInt(SpData[1]),Integer.parseInt(SpData[2]));
    
    	glist.add(goods);
    	
    	}
    	for(int i =0;i<glist.size();i++) {
    		glist.get(i).showinfo();
    		count += glist.get(i).count();
    	}
    	System.out.println("갯수는 : " +count+"개입니다.");
       sc.close();
    }

}
