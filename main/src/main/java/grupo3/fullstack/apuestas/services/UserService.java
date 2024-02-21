package grupo3.fullstack.apuestas.services;


import grupo3.fullstack.apuestas.persistence.entities.UserEntity;

public interface UserService {
	public UserEntity buscarPorId(Long id);
	/*void createUser(UserDTO u);
	void depositCash (UserDTO u);
	void withdrawCash (UserDTO u);*/

/*	Funciones posibles proximas: 
		borrar usuario
		cambiar/recuperar contraseñas
	*/
}
