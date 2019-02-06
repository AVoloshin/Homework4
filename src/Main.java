public class Main {

    public static void main(String[] args) {
        Patient patient1= new Patient();
        Patient patient2= new Patient();
        Patient patient3= new Patient();
        patient1.printOut(patient1.printIn());
        patient2.printOut(patient2.printIn());
        patient3.printOut(patient3.printIn());
        Patient [] patients = {patient1,patient2,patient3};
        patient1.sortOut(patients);

    }
}
