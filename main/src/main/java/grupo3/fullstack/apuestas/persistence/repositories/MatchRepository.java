package grupo3.fullstack.apuestas.persistence.repositories;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import grupo3.fullstack.apuestas.persistence.entities.MatchEntity;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Long>{
	List<MatchEntity> findByDate(DateTimeFormatter date);
}
