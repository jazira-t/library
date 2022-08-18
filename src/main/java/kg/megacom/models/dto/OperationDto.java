package kg.megacom.models.dto;

import kg.megacom.models.enums.OperationStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class OperationDto {

    Long id;
    Date startDate;
    Date endDate;
    BookDto book;
    ReaderDto reader;
    OperationStatus status;

}

