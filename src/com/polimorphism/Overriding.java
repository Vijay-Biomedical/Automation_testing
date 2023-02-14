package com.polimorphism;

public class Overriding extends Method_Overloading {
	public void Fruites(int a)
	{
		super.Fruites(a);
	}
	public static void main(String[] args) {
		Overriding n = new Overriding();
		n.Fruites(55);
		n.Fruites("java");
	}

}
