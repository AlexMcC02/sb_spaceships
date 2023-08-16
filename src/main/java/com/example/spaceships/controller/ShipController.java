package com.example.spaceships.controller;

import com.example.spaceships.models.Ship;
import com.example.spaceships.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/ships")
public class ShipController {
    private final ShipRepository shipRepository;

    @Autowired
    public ShipController(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @GetMapping("")
    public List<Ship> findAll() {
        return shipRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Ship> findById(@PathVariable("id") Long id) {
        return Optional.of(shipRepository.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ship not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Ship ship) {
        shipRepository.save(ship);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Ship ship) {
        if(!shipRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ship not found");
        }
        shipRepository.save(ship);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        shipRepository.deleteById(id);
    }

}
