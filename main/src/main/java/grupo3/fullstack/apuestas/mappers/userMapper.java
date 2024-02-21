package grupo3.fullstack.apuestas.mappers;
import java.util.List;
import org.mapstruct.Mapper;
import grupo3.fullstack.apuestas.DTO.*;
import grupo3.fullstack.apuestas.persistence.entities.*;

@Mapper(componentModel = "spring", uses = {BetMapper.class})
public interface userMapper {
		UserDTO toDTO(UserEntity UserEntity);
		UserEntity toEntity(UserDTO UserDTO);
		List<UserDTO> toDTOList(List<UserEntity> UserEntity);
	
}
