package pl.sda.mobilnypasazeradmin.Elevators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
                .id( dto.getId())
                .station( dto.getStation() )
                .platform( dto.getPlatform() )
                .malfunction_date( dto.getMalfunction_date() )
                .action_taken( dto.getAction_taken() )
                .planned_malfunction_end( dto.getPlanned_malfunction_end() )
                .malfunction_end( dto.getMalfunction_end() )
                .build();

    }
    public List<ElevatorTicket> getTicketList() {

        List<ElevatorTicket> all = elevatorRepository.findAll();

        List<ElevatorTicketDTO> collect = all.stream().map( t -> t.toDto() ).collect( Collectors.toList() );


        return null;
    }

}
