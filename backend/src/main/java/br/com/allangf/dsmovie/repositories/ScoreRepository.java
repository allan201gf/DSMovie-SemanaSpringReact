package br.com.allangf.dsmovie.repositories;

import br.com.allangf.dsmovie.entities.Score;
import br.com.allangf.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
