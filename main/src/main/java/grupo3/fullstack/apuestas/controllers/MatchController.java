package grupo3.fullstack.apuestas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;
import grupo3.fullstack.apuestas.services.MatchService;
@RestController
@RequestMapping("/partidos")
public class MatchController {
	@Autowired
	private MatchService MatchService;
	@GetMapping
	public List<MatchEntity> VerApuestas(){
		
		return MatchService.getMatches();
		
	}
	@GetMapping
	public List<MatchEntity>Verendirecto(){
		return MatchService.getLiveMatches();
		
	}
}
