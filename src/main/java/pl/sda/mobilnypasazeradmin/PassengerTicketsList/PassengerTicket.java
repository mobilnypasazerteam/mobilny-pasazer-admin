package pl.sda.mobilnypasazeradmin.PassengerTicketsList;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tickets")
public class PassengerTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phone;
    @Email
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