package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Menu> menu = new ArrayList<>();
	public Main(){
		readMenu();
		for(Menu m : menu){
			System.out.println(m.getId()+") "+m.getName());
			System.out.println("0) 結算");
			System.out.println("q) 離開");
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入餐點: ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("請輸入數量: ");
		int number = Integer.parseInt(scanner.nextLine());
		System.out.print("目前餐點: ");
		switch(id){
		case 1:
			
		}
	}
	public void readMenu(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("menu.txt"));
			String line = in.readLine();
			while(line!=null){
				String[] tokens =  line.split(",");
				int id = Integer.parseInt(tokens[0]);
				String name = tokens[1];
				int price = Integer.parseInt(tokens[2]);
				int calory = Integer.parseInt(tokens[3]);
				Menu m = new Menu(id, name, price, calory);
				menu.add(m);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
