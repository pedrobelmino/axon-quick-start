package br.com.pedrobelmino.axon.labs.chat.query.rooms.participants;

import br.com.pedrobelmino.axon.labs.chat.coreapi.ParticipantJoinedRoomEvent;
import br.com.pedrobelmino.axon.labs.chat.coreapi.ParticipantLeftRoomEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RoomParticipantsProjection {

    private final RoomParticipantsRepository repository;

    public RoomParticipantsProjection(RoomParticipantsRepository repository) {
        this.repository = repository;
    }

    @EventHandler
    public void on(ParticipantJoinedRoomEvent event) {
        repository.save(new RoomParticipant(event.getRoomId(), event.getParticipant()));
    }

    @EventHandler
    public void on(ParticipantLeftRoomEvent event) {
        repository.deleteByParticipantAndRoomId(event.getParticipant(), event.getRoomId());
    }
}
