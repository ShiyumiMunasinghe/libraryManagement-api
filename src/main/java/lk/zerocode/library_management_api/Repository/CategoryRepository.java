package lk.zerocode.library_management_api.Repository;

import lk.zerocode.library_management_api.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
