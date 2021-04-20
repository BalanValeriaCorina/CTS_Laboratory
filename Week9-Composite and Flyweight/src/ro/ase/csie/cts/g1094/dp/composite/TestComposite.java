package ro.ase.csie.cts.g1094.dp.composite;

public class TestComposite {

	public  static void main(String[] args)
	{
		Group gr1=new Group("Red team");
		gr1.addNewNode(new NPC("soldier1",100));
		gr1.addNewNode(new NPC("soldier2",100));
		
		Group gr2=new Group("Red team");
		gr2.addNewNode(new NPC("soldier3",100));
		gr2.addNewNode(new NPC("tank",500));
		
		Group lvlGroup=new Group("Level 2");
		lvlGroup.addNewNode(new NPC("level boss",1000));
		lvlGroup.addNewNode(gr1);
		lvlGroup.addNewNode(gr2);
		
		lvlGroup.attack("Superman");
		lvlGroup.retrear();
		lvlGroup.getNode(0).move();
		
		
	}
	
	
}
