package kg.megacom.models;

import kg.megacom.models.enums.OperationStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "operations")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    Date startDate;
    Date endDate;

    @ManyToOne
            @JoinColumn(name = "book_id")
    Book book;

    @ManyToOne
             @JoinColumn(name = "reader_id")
    Reader reader;

    @Enumerated(value = EnumType.STRING)
    OperationStatus status;

}

