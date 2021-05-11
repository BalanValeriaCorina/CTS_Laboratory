package ro.ase.csie.g1094.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		GameClient gameClient=new GameClient();
		
		gameClient.addTask(new AsyncTask("Data backup", 5, new BackupModule()));
		gameClient.addTask(new AsyncTask("Update game modules", 1, new UpdateModule()));
		System.out.println("Game is running");
		
		gameClient.executeTask();
		gameClient.executeTask();
		gameClient.executeTask();
		
		
		System.out.println("Game is running");
	}
}
