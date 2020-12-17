package com.example.demo.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.InterfaceMetier.SalleInterface;
import com.example.demo.Repository.SalleRepository;
import com.example.demo.entites.Salle;
@Service
public class SalleService implements SalleInterface {
	
	
	@Autowired
	private SalleRepository vr;
	@Transactional

	@Override
	public Collection<Salle> getAll() {
		return vr.findAll();
	}

	@Override
	public Salle getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Salle add(Salle c) {
		return vr.save(c);
	}

	@Override
	public Salle update(Salle c) {
		return vr.saveAndFlush(c);
	}

}
