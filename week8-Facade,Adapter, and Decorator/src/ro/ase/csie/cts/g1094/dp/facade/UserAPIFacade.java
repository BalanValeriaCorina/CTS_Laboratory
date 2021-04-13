package ro.ase.csie.cts.g1094.dp.facade;

public class UserAPIFacade {

	public static UserProfile getUserProfile(String serverIp,String userName, String pass)
	{
		GameServer gameServer=new GameServer();
		gameServer.connect("10.0.0.1");
		UserAccount user=new UserAccount();
		
		if(gameServer.isConnected())
		{	
			UserAccount user1=new UserAccount();
		    user1.login("Player 1", "1234");
		    
		    UserProfile profile=user1.downloadUserProfile();
		   
		    return profile;
		}
		else
			return null;

	}
	
}
