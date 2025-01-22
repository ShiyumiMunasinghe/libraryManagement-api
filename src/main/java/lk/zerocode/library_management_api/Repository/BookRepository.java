package lk.zerocode.library_management_api.Repository;

import lk.zerocode.library_management_api.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
