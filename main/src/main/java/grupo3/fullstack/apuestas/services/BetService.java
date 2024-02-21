package grupo3.fullstack.apuestas.services;




import java.util.List;

import grupo3.fullstack.apuestas.DTO.BetDTO;
import grupo3.fullstack.apuestas.persistence.entities.BetEntity;
import grupo3.fullstack.apuestas.persistence.entities.UserEntity;

public interface BetService {

	BetDTO createBet(BetDTO b);
	List<BetEntity> getMyBets(UserEntity user);
	boolean deleteBet(Long id);
	
}
