package devOn;

public class Bed {
    private boolean occupied;
    private int daysRemaining;


    public Bed(boolean occupied, int daysRemaining) {
        this.occupied = occupied;
        this.daysRemaining = daysRemaining;

    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }

    public void setDaysRemaining(int daysRemaining) {
        this.daysRemaining = daysRemaining;
    }


}
