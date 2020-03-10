package week7_lab13_ex1;

public class TestPatient {

    public static void main(String[] args) {
	Patient p1 = new Patient("Jane", "Austin", true, true);

	Patient p2 = new Patient("Henry", "James", false, true);
	p1.print_details();
	p2.print_details();

	p1.set_stay_length(10);
	p2.set_stay_length(5);

	System.out.printf("Janes' bill: €%,.2f%n", p1.calculate_bill());
	System.out.printf("Henrys' bill: €%,.2f%n", p2.calculate_bill());

    }
}
