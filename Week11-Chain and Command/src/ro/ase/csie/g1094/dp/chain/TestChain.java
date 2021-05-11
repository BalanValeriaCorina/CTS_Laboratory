package ro.ase.csie.g1094.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		
		ChatHandler languageFilter=new LanguageFilter("English");
		ChatHandler privateChat=new PrivateChat();
		ChatHandler globalChat=new GlobalChat();
		
		languageFilter.setNext(privateChat);
		privateChat.setNext(globalChat);
		
		ChatHandler chatServer=languageFilter;
		
		chatServer.processMessage(new Message("@everyone", "kill superman", 10));
		chatServer.processMessage(new Message("@John", "start lvl 2", 0));
		chatServer.processMessage(new Message("@everyone", " let's join tha party", 0));
		
		

	}

}
