package pl.sda.mobilnypasazeradmin.Elevators;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ElevatorRepository extends JpaRepository<ElevatorTicket, Long> {


}
