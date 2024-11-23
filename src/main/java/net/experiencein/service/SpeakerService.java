package net.experiencein.service;

import net.experiencein.model.Speaker;
import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository speakerRepository;

    public SpeakerService() {
        System.out.println("SpeakerService no args constructor");
    }

    @Autowired
    public SpeakerService(ISpeakerRepository speakerRepository) {
        System.out.println("SpeakerService repository constructor");
        this.speakerRepository = speakerRepository;
    }


    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    //even if this part never called in the code Autowired calls it so we have a repo instance instead of null
    //@Autowired
    public void setSpeakerRepository(ISpeakerRepository speakerRepository) {
        System.out.println("SpeakerService repo setter");
        this.speakerRepository = speakerRepository;
    }
}
