package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	List<Friend> FriendList = new ArrayList <Friend>();
    	//어레이 리스트 형성 문법 
    	Scanner sc =new Scanner (System.in);
    	System.out.println("친구를 3명 등록해 주세요 ");
    	for(int i = 0 ; i <3;i++) {
    		String line = sc.nextLine(); //라인으로 입력받은 것들을 라인으로 받아줌 
    		String []data= line.split(" "); // 공백으로 분리해서 배열에 넣어 
    	
    		Friend friend = new Friend();
    		friend.setName(data[0]);
    		friend.setHp(data[1]);
    		friend.setSchool(data[2]);
    	FriendList.add(friend);
    	
    
    	}

    	for(int i1=0;i1<FriendList.size();i1++) {
    		FriendList.get(i1).showInfo();
    	}
    	
    	/*for(Friend f :FriendList) {
    		System.out.println(f.showInfo());
    	}*/
        sc.close();
    }

}
