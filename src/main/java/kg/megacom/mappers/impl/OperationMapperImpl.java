package kg.megacom.mappers.impl;

import kg.megacom.mappers.OperationMapper;
import kg.megacom.models.Operation;
import kg.megacom.models.dto.OperationDto;

import java.util.ArrayList;
import java.util.List;

public class OperationMapperImpl implements OperationMapper {
    @Override
    public Operation fromDto(OperationDto operationDto) {
        Operation operation = new Operation();
        operation.setId(operation.getId());
        operation.setStartDate(operation.getStartDate());
        operation.setEndDate(operation.getEndDate());
        return operation;
    }

    @Override
    public OperationDto toDto(Operation operation) {
        OperationDto operationDto = new OperationDto();
        operationDto.setId(operationDto.getId());
        operationDto.setStartDate(operationDto.getStartDate());
        operationDto.setEndDate(operationDto.getEndDate());
        return operationDto;
    }

    @Override
    public List<Operation> fromDtos(List<OperationDto> operationDtos) {
        List<Operation> operations = new ArrayList<>();

        for (OperationDto item: operationDtos) {
            Operation operation = fromDto(item);
            operations.add(operation);
        }
        return operations;
    }

    @Override
    public List<OperationDto> toDtos(List<Operation> operations) {
        List<OperationDto> operationDtos = new ArrayList<>();

        for (Operation item: operations) {
            OperationDto operationDto = toDto(item);
            operationDtos.add(operationDto);
        }
        return operationDtos;
    }
}
