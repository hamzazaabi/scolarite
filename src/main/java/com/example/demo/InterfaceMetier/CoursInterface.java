package com.example.demo.InterfaceMetier;

import java.util.Collection;

import com.example.demo.entites.Cours;


public interface CoursInterface {
	public Collection<Cours> getAll();
	public Cours getId(Long id);
	public void delete(long id);
	public Cours add (Cours c );
	public Cours update (Cours c);
}
