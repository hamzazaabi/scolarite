package com.example.demo.InterfaceMetier;

import java.util.Collection;

import com.example.demo.entites.Eleve;


public interface EleveInterface {
	public Collection<Eleve> getAll();
	public Eleve getId(Long id);
	public void delete(long id);
	public Eleve add (Eleve c );
	public Eleve update (Eleve c);

}
