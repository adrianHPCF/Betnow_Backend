package grupo3.fullstack.apuestas.services;

import org.springframework.beans.factory.annotation.Autowired;

import grupo3.fullstack.apuestas.persistence.entities.UserEntity;
import grupo3.fullstack.apuestas.persistence.repositories.UserRepository;

public class UserServiceImp implements UserService{
	@Autowired
    private UserRepository usuarioRepository;

	@Override
	public UserEntity buscarPorId(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
}
