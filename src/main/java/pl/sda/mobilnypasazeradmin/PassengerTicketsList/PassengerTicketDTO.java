package pl.sda.mobilnypasazeradmin.PassengerTicketsList;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PassengerTicketDTO {

    private String phone;
    private String email;
    private String travelDate;
    private String startPoint;
    private String startTime;
    private String intermediatePoint;
    private String endPoint;
    private String endTime;
    private Integer passengerNo;
    private ReducedMobilityType mobilityType;
    private String additionalInfo;

}
