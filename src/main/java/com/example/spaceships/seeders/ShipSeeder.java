package com.example.spaceships.seeders;

import com.example.spaceships.factories.ShipFactory;
import com.example.spaceships.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ShipSeeder implements CommandLineRunner {
    private final ShipRepository shipRepository;
    private final ShipFactory shipFactory = new ShipFactory();

    @Autowired
    public ShipSeeder(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        shipFactory.generateRandomShips(20, shipRepository);
    }
}