package net.experiencein.service;

import net.experiencein.model.Speaker;
import net.experiencein.repository.ISpeakerRepository;
import net.experiencein.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {

    private ISpeakerRepository speakerRepository = new SpeakerRepository();

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
