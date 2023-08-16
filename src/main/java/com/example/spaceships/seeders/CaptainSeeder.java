package com.example.spaceships.seeders;

import com.example.spaceships.factories.CaptainFactory;
import com.example.spaceships.repositories.CaptainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CaptainSeeder implements CommandLineRunner {
    private final CaptainRepository captainRepository;
    private final CaptainFactory captainFactory = new CaptainFactory();

    @Autowired
    public CaptainSeeder(CaptainRepository captainRepository) {
        this.captainRepository = captainRepository;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        captainFactory.generateRandomCaptains(20, captainRepository);
    }
}
