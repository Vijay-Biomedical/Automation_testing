package com.polimorphism;

public class Method_Overloading {
	public void Fruites() {
		// TODO Auto-generated method stub

	}

	public void Fruites(int a) {
		int b = 10;
		System.out.println(a + b);
	}

	public void Fruites(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Method_Overloading p = new Method_Overloading();
		p.Fruites();
		p.Fruites(20);
		p.Fruites("VIjay");

	}
}
