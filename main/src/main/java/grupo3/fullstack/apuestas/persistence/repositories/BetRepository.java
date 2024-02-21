package grupo3.fullstack.apuestas.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import grupo3.fullstack.apuestas.persistence.entities.BetEntity;
import grupo3.fullstack.apuestas.persistence.entities.UserEntity;

@Repository
public interface BetRepository extends JpaRepository<BetEntity, Long>{
	List<BetEntity> findAllByUser(UserEntity user);
}
