package com.game.start.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.start.model.Libro;

@Repository
public interface BookRepository extends JpaRepository<Libro, Long>{

}
