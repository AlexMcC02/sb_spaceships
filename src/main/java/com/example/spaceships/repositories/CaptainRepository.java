package com.example.spaceships.repositories;

import com.example.spaceships.models.Captain;
import com.example.spaceships.models.Rank;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public class CaptainRepository {

    ArrayList<Captain> repo = new ArrayList<>();

    public CaptainRepository() {
        repo.add(new Captain(1, "Darth Vader", 45, Rank.ADMIRAL));
        repo.add(new Captain(2, "Marina", 54, Rank.CAPTAIN));
        repo.add(new Captain(3, "Alex", 25, Rank.LIEUTENANT));
    }

    public ArrayList<Captain> getAllCaptains() {
        return repo;
    }

    public Optional<Captain> getCaptainById(int id) {
        return repo.stream().filter(repo -> repo.getId() == id).findAny();
    }

    public Captain createCaptain(Captain captain) {
        repo.add(captain);
        return captain;
    }

    public Captain editCaptainById(int id, Captain updatedCaptain) {
        Optional<Captain> captainToUpdate = getCaptainById(id);
        Captain captain = captainToUpdate.get();

        // Note, only the id isn't changed.
        captain.setName(updatedCaptain.getName());
        captain.setAge(updatedCaptain.getAge());
        captain.setRank(updatedCaptain.getRank());

        return captain;
    }

    public void deleteCaptainById(int id) {
        Optional<Captain> captainToDelete = getCaptainById(id);
        captainToDelete.ifPresent(captain -> repo.remove(captain));
    }

}

