package pl.sda.mobilnypasazeradmin.Elevators;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElevatorTicketDTO {

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
