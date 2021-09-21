package interview;

import java.util.Objects;

public class Event {

    int id;
    int arrivalTime;
    int duration;

    public Event(int id, int arrivalTime, int duration) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return arrivalTime == event.arrivalTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalTime);
    }
}
