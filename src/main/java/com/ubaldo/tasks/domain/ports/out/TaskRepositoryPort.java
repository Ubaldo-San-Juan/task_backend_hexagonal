package com.ubaldo.tasks.domain.ports.out;

import com.ubaldo.tasks.domain.models.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepositoryPort {
    Task save (Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);

}
