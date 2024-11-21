package com.ubaldo.tasks.domain.ports.out;

import com.ubaldo.tasks.domain.models.AdditionalTaskInfo;
import org.springframework.stereotype.Service;

@Service
public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
