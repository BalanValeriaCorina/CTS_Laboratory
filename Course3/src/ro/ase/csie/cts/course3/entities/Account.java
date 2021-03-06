package ro.ase.csie.cts.course3.entities;

	public class Account {//5. THE CLASS SHOULD DO JUST ONE THING----------SINGLE RESPONSABILITY PRINCIPLE
		
		//1.O VARIABILA SE DECLARA PE CATE O LINIE
		public double	loan_value,rate;	
		public int	daysActive,account_Type;
		public static final int	STANDARD=0,BUDGET=1,PREMIUM=2,SUPER_PREMIUM=3;//6.Pick one word per concept AICI account_Type E LA FEL CU ENUMERATIA ASTA
		
		public double loan() {
			System.out.println("The loan value is " + this.loan_value);
			return loan_value;
		}
		
		public double getRate() {
			System.out.println("The rate is "+rate);
			return this.rate;
		}
		
		//must have method - the lead has requested it in all classes
		public double getMonthlyRate() {
			return loan_value*rate;
		}
		
		public void setValue(double value) throws Exception {//9.IESIREA DIN FUNCTIE SE FACE PRIN EXCEPTIE
			if(value<0)
				throw new Exception();
			else
			{
				loan_value = value;
			}
		}
		
		//3. OPERATORII SUNT SEPARATI DE OPERANZI PRINTR-UN SPATIU
		public String to_string() {
			return "Loan: "+this.loan_value+"; rate: "+this.rate+"; days active:"+daysActive+"; Type: "+account_Type+";";
		}
		
		public void print() {
			int vb = 10;
			System.out.println("This is an account");
		}
      
		//2.CODUL TREBUIE INDENTAT, FCT calculate
		public static double calculate(Account[] 	accounts)//7.COMPLEXITATE RIDICATA  8.KISS 
		{
		double totalFee=0.0;
		Account	account;
		int temp = 365;
		for	(int	i=0;i<accounts.length;i++)	{
		account=accounts[i];
		if(account.account_Type==Account.PREMIUM||account.account_Type==Account.SUPER_PREMIUM)	
		totalFee+=.0125	*	(	//	1.25%	broker's	fee            //10.NUMERELE TREBUIE SALVATE IN VARIABILE STATICE SI FOLOSITE CU DEN VARIABILELOR
				account.loan_value*Math.pow(account.rate,(account.daysActive/365)) - account.loan_value);	//	interest-principal
		}
		return	totalFee;
		}

		//4.CONSTRUCTORUL ARE SETTER IN EL ------DUPLICATION
		public Account(double value, double rate, int account_Type) throws Exception {
			if(value<0)
				throw new Exception();
			else
			{
				loan_value = value;
			}
			this.rate = rate;
			this.account_Type = account_Type;
		}
		
		
	}

