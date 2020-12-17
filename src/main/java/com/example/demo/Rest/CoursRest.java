package com.example.demo.Rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.InterfaceMetier.CoursInterface;
import com.example.demo.entites.Cours;
@RestController
@RequestMapping("/Cours")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CoursRest {
	@Autowired
	private CoursInterface vf;
	@PostMapping("/add") 
	public void save(@RequestBody Cours v)
	
	{	vf.add(v);
	}
	@GetMapping("/get")
	public Collection<Cours> findALL()
	{
		return vf.getAll();
	}
	@GetMapping("/getNom/{idCours}")
	public Cours getNom(@PathVariable(value = "idCours") Long idCours)
	{
		return vf.getId(idCours);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable(value = "id") Long id) {
		vf.delete(id);
	}
	@PutMapping("edit")  // modification
	public void update (@RequestBody Cours v)
	
	{
	vf.update(v);
	}
	@GetMapping("/getone/{id}")
	public Cours findOne(@PathVariable(value = "id")Long id)
	{
		return vf.getId(id);
	}
}
