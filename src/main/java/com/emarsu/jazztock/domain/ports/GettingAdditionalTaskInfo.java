package com.emarsu.jazztock.domain.ports;

import com.emarsu.jazztock.domain.models.AdditionalTaskInfo;

public interface GettingAdditionalTaskInfo {

    AdditionalTaskInfo getAdditionalTaskInfo(Long id);

}
