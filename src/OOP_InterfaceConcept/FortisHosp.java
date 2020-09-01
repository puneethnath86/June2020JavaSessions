package OOP_InterfaceConcept;

public class FortisHosp extends MedicalOrg implements USMedical,UKMedical, IndianMedical
{
//	US Medical
	@Override
	public void ambulanceService() {
		System.out.println("ambulanceService");
	}
	@Override
	public void cardioServices() {
		System.out.println("cardioServices");
	}
	@Override
	public void emergencyServices() {
		System.out.println("emergencyServices");
	}
//	US Medical
	@Override
	public void neuroServices() {
		System.out.println("neuroServices");
	}
	@Override
	public void entServices() {
		System.out.println("entServices");
	}
//	Indian Medical
	@Override
	public void oncologyServices() {
		System.out.println("oncologyServices");
	}
	@Override
	public void physioServices() {
		System.out.println("physioServices");
	}
	@Override
	public void pediaServices() {
		System.out.println("pediaServices");
	}
	@Override
	public void orthoServices() {
		System.out.println("orthoServices");
	}
	public static void covidTest() {
		System.out.println("CovidTest");
	}
	@Override
	public void billing() {
		System.out.println("This is billing method from FortisHosp Class");
	}
	@Override
	public void xRay() {
		System.out.println("xRay method from FortisHosp class");
	}

}
