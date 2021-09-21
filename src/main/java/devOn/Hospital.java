package devOn;

import java.util.List;

public class Hospital {
    private int noOfBeds;
    private List<Bed> occupiedBeds;



    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public List<Bed> getOccupiedBeds() {
        return occupiedBeds;
    }

    public void setOccupiedBeds(List<Bed> occupiedBeds) {
        this.occupiedBeds = occupiedBeds;
    }


}
