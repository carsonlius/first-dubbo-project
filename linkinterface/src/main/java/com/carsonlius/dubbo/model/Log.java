package com.carsonlius.dubbo.model;

import java.io.Serializable;

public class Log implements Serializable {
    private Integer recId;
    private String  remark;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
