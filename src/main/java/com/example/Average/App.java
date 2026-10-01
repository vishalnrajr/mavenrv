package com.example.Average;


public class App {
	public int averageOfTwo(int a,int b) {
		return(a+b)/2;
	}
	
	public int averageOfTHree(int a,int b,int c) {
		return(a+b+c)/3;
	}
    public static void main(String[] args) {
        App app=new App();
        System.out.println(app.averageOfTwo(5,6));
        System.out.println(app.averageOfTHree(5,6,7));     
    }
}

