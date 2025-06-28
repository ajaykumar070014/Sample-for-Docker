package com.sample_docker.Repository;

import com.sample_docker.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SampleRepo extends JpaRepository<Sample, UUID> {
}
