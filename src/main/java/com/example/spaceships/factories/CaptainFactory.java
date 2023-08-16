package com.example.spaceships.factories;

import com.example.spaceships.models.Captain;
import com.example.spaceships.models.Rank;
import com.example.spaceships.repositories.CaptainRepository;

import java.util.Random;

public class CaptainFactory {
    public void generateRandomCaptains(int count, CaptainRepository captainRepository) {
        Random random = new Random();
        String[] names = {
                "John", "Michael", "William", "James", "David", "Robert", "Joseph", "Daniel",
                "Richard", "Thomas", "Charles", "Christopher", "Matthew", "George", "Andrew", "Edward",
                "Brian", "Steven", "Kevin", "Jason", "Paul", "Kenneth", "Timothy", "Jeffrey",
                "Donald", "Mary", "Patricia", "Jennifer", "Linda", "Elizabeth", "Barbara", "Susan", "Jessica",
                "Sarah", "Karen", "Nancy", "Lisa", "Margaret", "Betty", "Sandra", "Ashley",
                "Dorothy", "Kimberly", "Emily", "Donna", "Michelle", "Carol", "Amanda", "Melissa"};
        Rank[] ranks = Rank.values();

        for (int i = 0; i < count; i++) {
            Captain captain = new Captain();
            captain.setName(names[random.nextInt(names.length)]);
            captain.setAge(random.nextInt(40) + 25); // Age between 25 and 64
            captain.setRank(ranks[random.nextInt(ranks.length)]);
            captainRepository.save(captain);
        }
    }
}

