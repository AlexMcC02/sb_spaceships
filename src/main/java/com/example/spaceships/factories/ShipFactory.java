package com.example.spaceships.factories;

import com.example.spaceships.models.Shield;
import com.example.spaceships.models.Ship;
import com.example.spaceships.models.Weapon;
import com.example.spaceships.repositories.ShipRepository;

import java.util.Random;

public class ShipFactory {
    public void generateRandomShips(int count, ShipRepository shipRepository) {
        Random random = new Random();
        String[] names = {"Voyager", "Explorer", "Odyssey", "Pioneer", "Infinity",
                            "Eclipse", "Nova", "Orbit", "Cosmos", "Astro"};
        Shield[] shields = Shield.values();
        Weapon[] weapons = Weapon.values();

        for (int i = 0; i < count; i++) {
            Ship ship = new Ship();
            ship.setCaptainId(random.nextInt(20) + 1);
            ship.setName(names[random.nextInt(names.length)]);
            ship.setShield(shields[random.nextInt(shields.length)]);
            ship.setWeapon(weapons[random.nextInt(weapons.length)]);
            ship.setSpeed(random.nextInt(1000) + 200);
            shipRepository.save(ship);
        }
    }
}
