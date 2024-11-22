package net.experiencein.service;

import net.experiencein.model.Speaker;
import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository speakerRepository;

    public SpeakerService(ISpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }


    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public void setSpeakerRepository(ISpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
