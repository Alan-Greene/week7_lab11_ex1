package week7_lab13_ex1;

public class Patient {
    String first_name;
    String surname;
    boolean medical_card;
    boolean is_private;
    int num_days_in_hospital;

    public Patient(String first_name, String surname,
                   boolean medical_card, boolean is_private){
        this.first_name = first_name;
        this.surname = surname;
        this.medical_card = medical_card;
        this.is_private = is_private;
    }

    public void set_stay_length(int number_of_days){
        this.num_days_in_hospital = number_of_days;
    }

    public String get_first_name(){
        return this.first_name;
    }

    public String get_surname(){
        return this.surname;
    }

    public double calculate_bill(){
        double charge;
        if (!this.medical_card){
            if(!this.is_private) {
                charge = 20.00;
            } else {
                charge = 100.00;
            }
        } else {
            charge = 0.00;
        }

        return charge * this.num_days_in_hospital;
    }

    public void print_details(){
        System.out.printf("%s%n", "Patient details");
        System.out.printf("%s%n", "---------------");
        System.out.printf("First name: %s%n", this.first_name);
        System.out.printf("Surname: %s%n", this.surname);
        System.out.printf("Has medical card: %b%n", this.medical_card);
        System.out.println();
    }
}
