package lk.zerocode.library_management_api.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String issueDate;
    private String dueDate;
    private String returnDate;
    private String status;
    @ManyToOne
    private LibraryUser user;
    @ManyToOne
    private Book book;
}
