package com.capgemini.functions;

public class ConsExample {
	
	int d;
	ConsExample(int a,int b,int c)
	{
		
		d=a+b+c;
		}
	
	ConsExample(int a,int b)
	{
		d=a+b;
	}
	
	public static void main(String[] args) {
		ConsExample obj = new ConsExample(2,3);
		System.out.println(obj.d);
		ConsExample obj1 = new ConsExample(2,3,4);
		System.out.println(obj1.d);
	}

}
