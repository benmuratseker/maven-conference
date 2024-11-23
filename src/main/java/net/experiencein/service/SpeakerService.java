package net.experiencein.service;

import net.experiencein.model.Speaker;
import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository speakerRepository;

    public SpeakerService() {
        System.out.println("SpeakerService no args constructor");
    }

    public SpeakerService(ISpeakerRepository speakerRepository) {
        System.out.println("SpeakerService repository constructor");
        this.speakerRepository = speakerRepository;
    }


    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(ISpeakerRepository speakerRepository) {
        System.out.println("SpeakerService repo setter");
        this.speakerRepository = speakerRepository;
    }
}
