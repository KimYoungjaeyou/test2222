package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.domain.concert.Concert;
import com.skcc.domain.user.User;

public interface ConcertRepository extends JpaRepository<Concert, Long>{
}
