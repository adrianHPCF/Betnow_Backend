package grupo3.fullstack.apuestas.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import grupo3.fullstack.apuestas.persistence.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
