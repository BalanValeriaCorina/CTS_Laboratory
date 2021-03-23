package ro.ase.csie.cts.g1094.singleton.staticcref;

public class DbConnection {

	String connString;
	String schema;
	
	private final static DbConnection connection=new DbConnection();
	
	private DbConnection() {
		System.out.println("loading config");
		this.connString="127.0";
		this.schema="cts";
		
	}

	private DbConnection(String connString, String schema) {
		super();
		this.connString = connString;
		this.schema = schema;
	}
	
//	public static DbConnection getConnection() {
//		
//		if(DbConnection.connection==null)
//		{
//			connection=new DbConnection();
//		}
//		return DbConnection.connection;
//		
//	}
	
	//this is wrong
//	public static DbConnection getConnection(String connString,String schema) {
//		
//		if(DbConnection.connection==null)
//		{
//			connection=new DbConnection(connString,schema);
//		}
//		return DbConnection.connection;
//		
//	}
	
	
}
