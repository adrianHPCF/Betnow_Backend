package grupo3.fullstack.apuestas.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import grupo3.fullstack.apuestas.DTO.BetDTO;
import grupo3.fullstack.apuestas.persistence.entities.BetEntity;
import grupo3.fullstack.apuestas.persistence.entities.UserEntity;
import grupo3.fullstack.apuestas.services.BetService;
import grupo3.fullstack.apuestas.services.UserService;
@RestController
@RequestMapping("/apuestas")
public class BetRestController {

	@Autowired
	BetService BetService;
	@Autowired
    private UserService userService;
	//realizar apuestas
	@PostMapping
	ResponseEntity<?> realizarapuesta(@RequestBody BetDTO BetDTO){
		BetDTO Bet = BetService.createBet(BetDTO);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/" + Bet.getBet_id())
				.buildAndExpand(Bet.getBet_id())
				.toUri();
		return ResponseEntity.created(location).build();

	}
	//Ver apuestas
	@GetMapping
	ResponseEntity<?> verapuestas(@RequestParam Long userId){
		UserEntity user = userService.buscarPorId(userId);
		List<BetEntity> Bet = BetService.getMyBets(user);
		if(Bet.isEmpty()) {
			return ResponseEntity.noContent().build();			
		}
		
		return ResponseEntity.ok(Bet);
		
	}
	
	//Cancelar apuesta
	@DeleteMapping(value = "/Bets/{id}")
	public ResponseEntity<Long> cancelarApuesta(@PathVariable Long id) {
        boolean isRemoved = BetService.deleteBet(id);

        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}