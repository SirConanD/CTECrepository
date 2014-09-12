package monster.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Odd", 4.0, 2.0, 5, 1, 3, true);
		otherMonster = new MarshmallowMonster("Ulrich", 2.0, 5.0, 2, 1, 3, true);
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}
}
