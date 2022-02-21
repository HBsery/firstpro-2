package com.first.firstpro.repository;

import com.first.firstpro.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long > {

        }

