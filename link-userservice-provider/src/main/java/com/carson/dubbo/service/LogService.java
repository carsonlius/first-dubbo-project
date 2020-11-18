package com.carson.dubbo.service;

import com.carson.dubbo.model.SystemLogDetails;

/**
 * @author carsonlius
 */
public interface LogService {

    SystemLogDetails getLogById(Integer recId);
}
