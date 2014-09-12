package monsters.view;

import javax.swing.JOptionPane;

import monster.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
   
	public void displayInformation()
   {
	   JOptionPane.showMessageDialog(null, "I made a monster.");
	   JOptionPane.showMessageDialog(null, "It's name is " + baseController.getMyMonster().getName());
	   JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getNumberOfLegs() + " legs");
	   JOptionPane.showMessageDialog(null, "He also has " + baseController.getMyMonster().getHairCount() + " hairs on his head.");
	   JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getEyeCount() + " eyes.");
	   JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getNoseCount() + " nose.");
	   JOptionPane.showMessageDialog(null, "He has " + baseController.getMyMonster().getArmCount() + " arms.");
	   JOptionPane.showMessageDialog(null, "It is " + baseController.getMyMonster().getHasBellyButton() + " that he has a belly button and thats my monster.");
   }
}
