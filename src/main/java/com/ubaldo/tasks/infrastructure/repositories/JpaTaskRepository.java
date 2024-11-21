package com.ubaldo.tasks.infrastructure.repositories;

import com.ubaldo.tasks.domain.models.Task;
import com.ubaldo.tasks.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {

}
