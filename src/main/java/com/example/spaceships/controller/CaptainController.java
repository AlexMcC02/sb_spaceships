package com.example.spaceships.controller;

import com.example.spaceships.models.Captain;
import com.example.spaceships.repositories.CaptainRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "/captains")
public class CaptainController {

    CaptainRepository captainRepository = new CaptainRepository();

    @GetMapping("")
    public ArrayList<Captain> getAllCaptains() {
        return captainRepository.getAllCaptains();
    }

    @GetMapping(path = "/{id}")
    public Optional<Captain> getCaptainById(@PathVariable("id") int id) {
        return captainRepository.getCaptainById(id);
    }

    // TODO, make a CaptainRequest without an id and generate it only the fly.
    @PostMapping("")
    public Captain createCaptain(@RequestBody Captain captain) {
        return captainRepository.createCaptain(captain);
    }

    @PutMapping("/{id}")
    public Captain updateCaptainById(@PathVariable("id") int id, @RequestBody Captain captain) {
        return captainRepository.editCaptainById(id, captain);
    }

    @DeleteMapping("/{id}")
    public void deleteCaptainById(@PathVariable("id") int id) {
        captainRepository.deleteCaptainById(id);
    }

}
