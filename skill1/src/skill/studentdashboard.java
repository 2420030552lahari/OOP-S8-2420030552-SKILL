package skill;

public class studentdashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long rollNumber = 420030552;
        String name = "Lahari Pokuri";
        float marks = 89.5f;
        char gender = 'F';
        boolean isPass = true;

       
        System.out.println("----- Student Summary Slip -----");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Pass Status : " + (isPass ? "Pass" : "Fail"));
	}

}
