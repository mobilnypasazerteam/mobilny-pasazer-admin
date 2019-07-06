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
    private String action_taken;
    private String planned_malfunction_end;
    private String malfunction_end;


}
