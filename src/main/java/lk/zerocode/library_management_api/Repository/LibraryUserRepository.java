package lk.zerocode.library_management_api.Repository;

import lk.zerocode.library_management_api.Model.LibraryUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryUserRepository extends JpaRepository<LibraryUser, Long> {
}
