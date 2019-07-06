package pl.sda.mobilnypasazeradmin.Elevators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElevatorService {

    private List<ElevatorTicket> TICKETS;

    @Autowired
    private ElevatorRepository elevatorRepository;

    public void registerTicket(ElevatorTicketDTO dto) {
        ElevatorTicket elevatorTicket = dtoToEntity(dto);
        elevatorRepository.save(elevatorTicket);
    }

    private ElevatorTicket dtoToEntity(ElevatorTicketDTO dto) {

        return ElevatorTicket.builder()
                .id(dto.getId())
                .station(dto.getStation())
                .platform(dto.getPlatform())
                .malfunction_date(dto.getMalfunction_date())
                .action_taken(dto.getAction_taken())
                .planned_malfunction_end(dto.getPlanned_malfunction_end())
                .malfunction_end(dto.getMalfunction_end())
                .build();

    }

    public List<ElevatorTicketDTO> getTicketList() {

        List<ElevatorTicket> elevatorTickets = elevatorRepository.findAll();
        List<ElevatorTicketDTO> dtoList = new ArrayList<>();
        for (ElevatorTicket elevatorTicket : elevatorTickets) {

            dtoList.add(ElevatorTicketDTO.builder()
                    .id(elevatorTicket.getId())
                    .station(elevatorTicket.getStation())
                    .platform(elevatorTicket.getPlatform())
                    .malfunction_date(elevatorTicket.getMalfunction_date())
                    .action_taken(elevatorTicket.getAction_taken())
                    .planned_malfunction_end(elevatorTicket.getPlanned_malfunction_end())
                    .malfunction_end(elevatorTicket.getMalfunction_end())
                    .build());
        }
        return dtoList;
    }

    private List<ElevatorTicketDTO> entityToDTO(List<ElevatorTicket> elevatorTickets) {
        List<ElevatorTicketDTO> elevatorTicketDTO = new ArrayList<>();
        for (ElevatorTicket ticket : elevatorTickets) {
            elevatorTicketDTO.add(ElevatorTicketDTO.builder()
                    .id(ticket.getId())
                    .station(ticket.getStation())
                    .platform(ticket.getPlatform())
                    .malfunction_date(ticket.getMalfunction_date())
                    .action_taken(ticket.getAction_taken())
                    .planned_malfunction_end(ticket.getPlanned_malfunction_end())
                    .malfunction_end(ticket.getMalfunction_end())
                    .build());
        }
        return elevatorTicketDTO;
    }

}
