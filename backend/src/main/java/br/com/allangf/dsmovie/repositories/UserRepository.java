package br.com.allangf.dsmovie.repositories;

import br.com.allangf.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
