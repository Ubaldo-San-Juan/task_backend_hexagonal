package com.ubaldo.tasks.domain.ports.out;

import com.ubaldo.tasks.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
