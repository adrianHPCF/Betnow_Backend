package grupo3.fullstack.apuestas.services;


import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;
import grupo3.fullstack.apuestas.persistence.repositories.MatchRepository;

public class MatchServiceImp implements MatchService{
	
	@Autowired
    private MatchRepository matchRepository;
	@Override
	public List<MatchEntity> getMatches() {
		
		return matchRepository.findAll();
	}
	@Override
	public List<MatchEntity> getLiveMatches() {
		
		return matchRepository.findByDate(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

}
