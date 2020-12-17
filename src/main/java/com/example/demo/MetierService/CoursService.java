package com.example.demo.MetierService;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.InterfaceMetier.CoursInterface;
import com.example.demo.Repository.CoursRepository;
import com.example.demo.entites.Cours;
@Service
public class CoursService implements CoursInterface {
	
	
	@Autowired
	private CoursRepository vr;
	@Transactional

	@Override
	public Collection<Cours> getAll() {
		return vr.findAll();
	}

	@Override
	public Cours getId(Long id) {
		return vr.findById(id).get();
	}

	@Override
	public void delete(long id) {
		vr.deleteById(id);
	}

	@Override
	public Cours add(Cours c) {
		return vr.save(c);
	}

	@Override
	public Cours update(Cours c) {
		return vr.saveAndFlush(c);
	}

}
