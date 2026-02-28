package devops.vendorsupplier.repository;

import devops.vendorsupplier.entity.BusinessRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRecordRepository
        extends JpaRepository<BusinessRecord, Long> {
}
