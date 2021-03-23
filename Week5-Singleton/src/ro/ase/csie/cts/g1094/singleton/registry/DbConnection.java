package ro.ase.csie.cts.g1094.singleton.registry;

import java.util.Hashtable;

public class DbConnection {

	String connString;
	String schema;
	
	private static Hashtable<String,DbConnection> connections=new Hashtable<>();
	
	private DbConnection() {
		System.out.println("loading config");
		this.connString="127.0";
		this.schema="cts";
		
	}

	public DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
}
