package com.example.dentalclinicspringboot.model;
import java.time.LocalDateTime;
import java.util.Date;

public class Appointment {
    private Integer id;
    private LocalDateTime startDate;
    private int durationMins;
    private Integer eId;
    private Integer rId;
    private Integer pId;
    private Integer dId;
    public Appointment() {
    }
    public Appointment(Integer id,LocalDateTime startDate,int durationMins,Integer eId,Integer rId,Integer pId,Integer dId){
        this.id = id;
        this.startDate = startDate;
        this.durationMins = durationMins;
        this.eId = eId;
        this.rId = rId;
        this.pId =pId;
        this.dId=dId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }
}
