package ro.ase.csie.cts.g1094.dp.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Tree3DModel tree1=new Tree3DModel("green",100);
		Tree3DModel tree2=new Tree3DModel("green",100);
		
		//shallow copy
		Tree3DModel tree5=tree1;
		
		//deeep copy
		Tree3DModel tree3=(Tree3DModel) tree1.clone();
		
	}
}
