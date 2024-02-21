package grupo3.fullstack.apuestas.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Bet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long bet_id;
	private Long user_id;
	private Long match_id;
	// private String bet_type; //De momento no hace falta ya que solo vamos a desarrollar un tipo de apuesta
	private double bet_cash;
	private String bet; // 1x2
	@ManyToOne
	@JoinColumn(name = "User_id")
	private UserEntity user;
	@ManyToOne
	@JoinColumn(name = "Match_id")
	private MatchEntity match;
	public Long getBet_id() {
		return bet_id;
	}
	public void setBet_id(Long bet_id) {
		this.bet_id = bet_id;
	}
	
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public MatchEntity getMatch() {
		return match;
	}
	public void setMatch(MatchEntity match) {
		this.match = match;
	}
	public double getBet_cash() {
		return bet_cash;
	}
	public void setBet_cash(double bet_cash) {
		this.bet_cash = bet_cash;
	}
	public String getBet() {
		return bet;
	}
	public void setBet(String bet) {
		this.bet = bet;
	}
}
