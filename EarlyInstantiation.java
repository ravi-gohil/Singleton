public class EarlyInstantiation {
	
	private static EarlyInstantiation ei = new EarlyInstantiation();
	
	private EarlyInstantiation(){}
	
	public static EarlyInstantiation getInstance(){
		return ei;
	}
	
	protected static void demoMethod(){
		System.out.println("single object method accessed.");
	}
}
