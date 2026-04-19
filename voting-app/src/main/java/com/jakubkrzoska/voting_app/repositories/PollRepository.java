package com.jakubkrzoska.voting_app.repositories;


import com.jakubkrzoska.voting_app.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
}
