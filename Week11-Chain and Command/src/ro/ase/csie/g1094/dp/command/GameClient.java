package ro.ase.csie.g1094.dp.command;

import java.util.ArrayList;

public class GameClient {

	ArrayList<AsyncTaskInterface> tassks=new ArrayList<>();
	
	public void addTask(AsyncTaskInterface task) {
		this.tassks.add(task);
	}
	
	
	public void executeTask() {
		if(tassks.size()>0)
		{
			AsyncTaskInterface task=this.tassks.get(0);
			if(task!=null)
			{
				task.awaitTask();
				this.tassks.remove(0);
			}
		}
	}
}
