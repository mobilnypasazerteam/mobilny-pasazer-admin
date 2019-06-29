package pl.sda.mobilnypasazeradmin.Elevators;

import lombok.*;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "elevatortickets")
public class ElevatorTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String station;
    private String platform;
    private String malfunction_date;
    @Size(min=3, max=20, message = "maksymalnie 20 znaków")
    private String action_taken;
    private String planned_malfunction_end;
    private String malfunction_end;

    public ElevatorTicketDTO toDto() {
//        return ElevatorTicketDTO;
        return null;
    }


}
