public class LateInstantiation {
	
	private static LateInstantiation instance = null;
	
	private LateInstantiation(){}
	
	public static LateInstantiation getInstance(){
		if(instance == null){
			instance = new LateInstantiation();
		}
		return instance;
	}
	
	public static void getMethod(){
		System.out.println("Late Instantiation via singleton");
	}
}
