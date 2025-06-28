package com.sample_docker.controller;

import com.sample_docker.Repository.SampleRepo;
import com.sample_docker.model.Sample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/sample")
public class SampleController {

    private final SampleRepo sampleRepo;

    public SampleController(SampleRepo sampleRepo) {
        this.sampleRepo = sampleRepo;
    }

    private static final String[] FIRST_NAMES = {
            "Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah"
    };

    @GetMapping
    public List<Sample> sample(){
        return sampleRepo.findAll();
    }

    @PostMapping
    private Sample save(){
        Sample sample = new Sample();
        Random random = new Random();
        sample.setName(FIRST_NAMES[random.nextInt(FIRST_NAMES.length)]);
        return sampleRepo.save(sample);
    }
}
