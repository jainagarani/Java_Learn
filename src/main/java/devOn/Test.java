package devOn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
[15:25] Sabarinath N (DevOn)
    Use case : Covid - hospital management-(This Problem should be solved using TDD & Solid design principles)
Hospital has 15 beds, and currently 4 are occupied with covid - symptomatic patients and each bed max allocation dates would be 14 to cure and discharge patients.
bed1 - 5 days remaining
bed2 - 10 days remaining
bed3 - 12 days remaining
bed4 - 8 days remaining
this is current situation.
Incoming patients - would be coming in queue to get appointed to this hospital, dynamically any number of patients ll b coming in queue, with name, age and symptomatic/asymptomatic behaviour.
Sympotomatic patients in queue should be moved always to top of queue, and allocate bed to them and count starts for 14 days for them too..
Solve this problem by
Design using any open source tool - sketch of it
TDD style of implementation ** - mandatory
Any persistance throughout the program can be handled in-memory
Solid principles should be implemented as applicable
Creating algo to handle beds
prioritize symptomatic patients to get admitted dynamically
it should be executable
coding standards to be followed along with right data / collection type

 */
public class Test {
    public static void main(String[] args){
        ArrayList<Bed> occupiedBeds = new ArrayList<>(Arrays.asList(
               new Bed(true,5),
                new Bed(true,10),
                new Bed(true,12),
                new Bed(true,8)

        ));
        Hospital hospital = new Hospital();
        hospital.setNoOfBeds(15);
        hospital.setOccupiedBeds(occupiedBeds);
        CovidBedAllocation covidBedAllocation = new CovidBedAllocation();
//        Patient patient1 = new Patient("1", "Jai", "37", true);
//        Patient patient2 = new Patient(2, "naga", 20, false);
//
       // covidBedAllocation()


    }





        public static List<Patient> getPatients(){
            return  new ArrayList<>(Arrays.asList(
             new Patient("1", "Jai", 37, true),
             new Patient("2", "naga", 20, false)));

    }

}
