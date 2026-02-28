package devops.vendorsupplier.controller;

import devops.vendorsupplier.entity.BusinessRecord;
import devops.vendorsupplier.repository.BusinessRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
@CrossOrigin(origins = "http://localhost:3000")
public class BusinessRecordController {

    private final BusinessRecordRepository repository;

    public BusinessRecordController(BusinessRecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<BusinessRecord> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public BusinessRecord create(@RequestBody BusinessRecord record) {
        return repository.save(record);
    }

    @PutMapping("/{id}")
    public BusinessRecord update(
            @PathVariable Long id,
            @RequestBody BusinessRecord record) {
        record.setId(id);
        return repository.save(record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
