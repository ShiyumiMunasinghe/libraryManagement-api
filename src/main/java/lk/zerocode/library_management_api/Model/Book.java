package lk.zerocode.library_management_api.Model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Integer publishedYear;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<LibraryUser> userList;
}



