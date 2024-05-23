package empData;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpPersonalInfo epi = new EmpPersonalInfo();

		epi.setEname("Vidhi");
		epi.setEmailId("vidhipatel12@gmail.com");
		epi.setResaddr("Navrangpura");
		epi.setMobileno(74890790);

		System.out.println(epi); // epi.toString()

		System.out.println(epi.getEname() + " " + epi.getEmailId() + " " +
		epi.getMobileno());

		EmpPersonalInfo epi1 = new EmpPersonalInfo();
		epi1.setEname("Apple");
		epi1.setResaddr("On the tree");

		System.out.println(epi1); // epi1.toString()

	}

}
