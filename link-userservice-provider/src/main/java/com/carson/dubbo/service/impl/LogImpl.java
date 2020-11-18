package com.carson.dubbo.service.impl;

import com.carson.dubbo.model.SystemLogDetails;
import com.carson.dubbo.service.LogService;

/**
 * @author carsonlius
 */
public class LogImpl implements LogService {
    @Override
    public SystemLogDetails getLogById(Integer recId) {
        SystemLogDetails systemLogDetails = new SystemLogDetails();
        systemLogDetails.setRecId(1);
        systemLogDetails.setRemark("hello world");
        return systemLogDetails;
    }
}
