package pl.sda.mobilnypasazeradmin.PassengerTicketsList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.mobilnypasazeradmin.Elevators.ElevatorTicket;
import pl.sda.mobilnypasazeradmin.Elevators.ElevatorTicketDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    private final PassengerTicketRepository passengerTicketRepository;

    @Autowired
    public PassengerService(PassengerTicketRepository passengerTicketRepository) {
        this.passengerTicketRepository = passengerTicketRepository;
    }

    private PassengerTicket dtoToEntity(PassengerTicketDTO dto) {

        return PassengerTicket.builder()
                .phone( dto.getPhone() )
                .email( dto.getEmail() )
                .travelDate( dto.getTravelDate() )
                .startPoint( dto.getStartPoint() )
                .startTime( dto.getStartTime() )
                .intermediatePoint( dto.getIntermediatePoint() )
                .endPoint( dto.getEndPoint() )
                .endTime( dto.getEndTime() )
                .passengerNo( dto.getPassengerNo() )
                .mobilityType( dto.getMobilityType())
                .additionalInfo( dto.getAdditionalInfo() )
                .build();

    }

    public List<PassengerTicketDTO> getTicketList() {

        List<PassengerTicket> allTickets = passengerTicketRepository.findAll();
        List<PassengerTicketDTO> dtoList = new ArrayList<>(  );
        for (PassengerTicket ticket : allTickets) {
            dtoList.add(PassengerTicketDTO.builder()
                    .phone( ticket.getPhone() )
                    .email( ticket.getEmail() )
                    .travelDate( ticket.getTravelDate() )
                    .startPoint( ticket.getStartPoint() )
                    .startTime( ticket.getStartTime() )
                    .intermediatePoint( ticket.getIntermediatePoint() )
                    .endPoint( ticket.getEndPoint() )
                    .endTime( ticket.getEndTime() )
                    .passengerNo( ticket.getPassengerNo() )
                    .mobilityType( ticket.getMobilityType() )
                    .additionalInfo( ticket.getAdditionalInfo() )
                    .build());
        }

        return dtoList;
    }

    private List<PassengerTicketDTO> entityToDTO (List<PassengerTicket> passengerTickets) {
        List<PassengerTicketDTO> passengerTicketDTO = new ArrayList<>(  );
        for (PassengerTicket ticket : passengerTickets) {
            passengerTicketDTO.add(PassengerTicketDTO.builder()
                    .phone( ticket.getPhone() )
                    .email( ticket.getEmail() )
                    .travelDate( ticket.getTravelDate() )
                    .startPoint( ticket.getStartPoint() )
                    .startTime( ticket.getStartTime() )
                    .intermediatePoint( ticket.getIntermediatePoint() )
                    .endPoint( ticket.getEndPoint() )
                    .endTime( ticket.getEndTime() )
                    .passengerNo( ticket.getPassengerNo() )
                    .mobilityType( ticket.getMobilityType() )
                    .additionalInfo( ticket.getAdditionalInfo() )
                    .build());
        }
        return passengerTicketDTO;
    }

}