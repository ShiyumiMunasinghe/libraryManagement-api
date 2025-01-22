package lk.zerocode.library_management_api.Repository;

import lk.zerocode.library_management_api.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
