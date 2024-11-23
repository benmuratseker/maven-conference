package net.experiencein.repository;

import net.experiencein.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepository implements ISpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Murat");
        speaker.setLastName("Seker");

        speakers.add(speaker);
        return speakers;
    }
}
