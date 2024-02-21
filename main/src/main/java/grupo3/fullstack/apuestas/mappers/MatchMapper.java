package grupo3.fullstack.apuestas.mappers;



import java.util.List;

import org.mapstruct.Mapper;
import grupo3.fullstack.apuestas.DTO.*;
import grupo3.fullstack.apuestas.persistence.entities.*;
@Mapper(componentModel = "spring")
public interface MatchMapper {
	MatchDTO toDTO(MatchEntity MatchEntity);
	MatchEntity toEntity(MatchDTO MatchDTO);
	List<MatchDTO> toDTOList(List<MatchEntity> MatchEntity);
}
