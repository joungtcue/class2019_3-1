package kr.ac.daelim.uml;

public class Medic extends Unit {

	public void move()
	{
		System.out.println("유닛이 이동한다");
	}
	
	public void healing()
	{
		System.out.println("유닛이 치료한다");
	}
	
	public void underattack(Charactor charactor)
	{
		System.out.println("유닛이 공격받는다");
	}
}
