package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MedicoDao;
import com.example.demo.entity.Medico;
import com.example.demo.repository.MedicoRepository;

@Component
public class MedicoDaoImpl implements MedicoDao {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Override
	public Medico create(Medico c) {
		// TODO Auto-generated method stub
		return medicoRepository.save(c);
	}

	@Override
	public Medico update(Medico c) {
		// TODO Auto-generated method stub
		return medicoRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoRepository.deleteById(id);
	}

	@Override
	public Optional<Medico> read(Long id) {
		// TODO Auto-generated method stub
		return medicoRepository.findById(id);
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoRepository.findAll();
	}

}
