package utez.edu.mx.U3_MaldonadoAlfonso_Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utez.mx.Entity.Persona;
import com.utez.mx.Repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> getAll(){
		return personaRepository.findAll();
	}
	
	public Persona get(long id) {
		return personaRepository.findById(id).get();
	}
	
	public void save(Persona persona) {
		personaRepository.save(persona);
	}
	
	public void delete(long id) {
		personaRepository.deleteById(id);
	}
}
