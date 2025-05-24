package com.onepieceofjava.Daneris_Springboot.model;

public class Assets {

    private Long id;
    private String modelName;
    private String type;
    private String serialNumber;

    public Assets(Long id, String modelName, String type, String serialNumber) {
        this.id = id;
        this.modelName = modelName;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
