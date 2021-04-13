package ro.ase.csie.cts.g1094.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		GameServer gameServer=new GameServer();
		gameServer.connect("10.0.0.1");
		
		if(gameServer.isConnected())
		{	
			UserAccount user1=new UserAccount();
		    user1.login("Player 1", "1234");
		    
		    UserProfile profile=user1.downloadUserProfile();
		    profile.getUserProfile();
		}
		GameServer gameServer1=new GameServer();
		gameServer1.connect("10.0.0.1");
		
		if(gameServer1.isConnected())
		{	
			UserAccount user1=new UserAccount();
		    user1.login("Player 1", "1234");
		    
		    UserProfile profile=user1.downloadUserProfile();
		    profile.getUserProfile();
		}

		UserProfile player1Profile= UserAPIFacade.getUserProfile("10.0.1", "Player 1", "1234");
		if(player1Profile!=null)
			player1Profile.getUserProfile();
	}

}



















