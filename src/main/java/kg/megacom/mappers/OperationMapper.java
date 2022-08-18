package kg.megacom.mappers;

import kg.megacom.models.Operation;
import kg.megacom.models.dto.OperationDto;

import java.util.List;

public interface OperationMapper {

    Operation fromDto(OperationDto operationDto);

    OperationDto toDto(Operation operation);

    List<Operation> fromDtos(List<OperationDto> operationDtos);

    List<OperationDto> toDtos(List<Operation> operations);
}
