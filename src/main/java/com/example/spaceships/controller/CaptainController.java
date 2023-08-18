package com.example.spaceships.controller;

import com.example.spaceships.models.Captain;
import com.example.spaceships.repositories.CaptainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "/captains")
public class CaptainController {

    private final CaptainRepository captainRepository;

    @Autowired
    public CaptainController(CaptainRepository captainRepository) {
        this.captainRepository = captainRepository;
    }

    @GetMapping("")
    public List<Captain> findAll() {
        return captainRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Captain> findById(@PathVariable("id") Long id) {
        return Optional.of(captainRepository.findById(id))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Captain not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody Captain captain) {
        captainRepository.save(captain);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody Captain captain) {
        if(!captainRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Captain not found");
        }
        captainRepository.save(captain);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        captainRepository.deleteById(id);
    }
}
