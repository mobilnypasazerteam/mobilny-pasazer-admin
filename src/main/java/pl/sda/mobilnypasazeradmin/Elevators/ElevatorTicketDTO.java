package pl.sda.mobilnypasazeradmin.Elevators;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
public class ElevatorTicketDTO {

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
}
