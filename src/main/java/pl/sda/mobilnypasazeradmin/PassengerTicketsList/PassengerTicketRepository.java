package pl.sda.mobilnypasazeradmin.PassengerTicketsList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerTicketRepository extends JpaRepository<PassengerTicket, Long> {
}
