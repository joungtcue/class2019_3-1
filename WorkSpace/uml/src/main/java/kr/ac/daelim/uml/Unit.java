package kr.ac.daelim.uml;

public class Unit {
	public String name;
	public int Health;
	
	public void move()
	{
		System.out.println("유닛이 이동한다");
	}
	
	public void attack(Charactor charactor)
	{
		System.out.println("유닛이 공격한다");
	}
	
	public void underattack(Charactor charactor)
	{
		System.out.println("유닛이 공격받는다");
	}
}
