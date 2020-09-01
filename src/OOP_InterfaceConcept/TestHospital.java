package OOP_InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		FortisHosp f=new FortisHosp();
		f.ambulanceService();
		f.cardioServices();
		f.emergencyServices();
		f.entServices();
		f.neuroServices();
		f.oncologyServices();
		f.pediaServices();
		f.physioServices();
		f.orthoServices();
//		Static method of FortisHosp class accessed using class reference
		FortisHosp.covidTest();
//		billing method overridden inside FortisHosp hence we can access that using object reference
		f.billing();
		f.xRay();
		
		USMedical u=new FortisHosp();
		u.ambulanceService();
		u.cardioServices();
		u.emergencyServices();
		f.orthoServices();

//		This is called using INTERFACE REFERENCE
		USMedical.covidTest();
		
//		billing method inside USInterface can be accessed using object reference
		u.billing();
	}

}
