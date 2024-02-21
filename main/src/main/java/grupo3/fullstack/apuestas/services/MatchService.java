package grupo3.fullstack.apuestas.services;


import java.util.List;

import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;

public interface MatchService {
	
	public List<MatchEntity> getMatches();
	public List<MatchEntity> getLiveMatches();
	
}
