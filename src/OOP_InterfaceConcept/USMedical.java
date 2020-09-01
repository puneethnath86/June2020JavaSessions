package OOP_InterfaceConcept;

public interface USMedical {
	public void ambulanceService();
	public void cardioServices();
	public void emergencyServices();
	public void orthoServices();
	
	public static void covidTest() {
		System.out.println("CovidTest-USMedical interface");
	}
	
	public default void billing() {
		System.out.println("This is billing method from USMedical interface");
	}
}
