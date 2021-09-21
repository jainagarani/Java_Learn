package devOn;

public class CovidBedAllocation {

    public void doCovidTest(Patient patient, Hospital hospital) {
        if (patient.isCovidPositive()) {
            int occupied = hospital.getOccupiedBeds().size();
            if (hospital.getNoOfBeds() > occupied) {
                hospital.getOccupiedBeds().add(new Bed(true,14));
            }
            else{
                System.out.println(" No beds are available");
            }
        }
    }


}
