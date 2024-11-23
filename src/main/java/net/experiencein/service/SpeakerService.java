package net.experiencein.service;

import net.experiencein.model.Speaker;
import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository speakerRepository;

    public SpeakerService() {}

    public SpeakerService(ISpeakerRepository speakerRepository) {
        this.speakerRepository =speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
