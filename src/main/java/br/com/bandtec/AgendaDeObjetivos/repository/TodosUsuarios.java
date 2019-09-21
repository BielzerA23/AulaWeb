package br.com.bandtec.AgendaDeObjetivos.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bandtec.AgendaDeObjetivos.domain.Objetivo;
import br.com.bandtec.AgendaDeObjetivos.domain.Usuario;


@Repository
public interface TodosUsuarios extends JpaRepository<Usuario, Long> {
	
	@Query("select u from usuario u where u.login = :login and u.senha = :senha")
	Usuario existeUsuario(@Param("login")String login, @Param("senha")String senha);
	
}
