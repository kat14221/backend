package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.Medico;

public interface MedicoDao {
	Medico create(Medico c);
	Medico update(Medico c);
	void delete(Long id);
	Optional<Medico> read(Long id);
	List<Medico> readAll();
}
