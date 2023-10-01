package com.texte.APIUsuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.texte.APIUsuario.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
