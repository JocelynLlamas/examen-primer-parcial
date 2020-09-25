package uaslp.enginering.exam.model;
import uaslp.enginering.exam.model.Reservation;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;


    
    public Hotel() {
        reservations = new ArrayList<>();
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
