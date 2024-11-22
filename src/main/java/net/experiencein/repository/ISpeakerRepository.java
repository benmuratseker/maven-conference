package net.experiencein.repository;

import net.experiencein.model.Speaker;

import java.util.List;

public interface ISpeakerRepository {
    List<Speaker> findAll();
}
