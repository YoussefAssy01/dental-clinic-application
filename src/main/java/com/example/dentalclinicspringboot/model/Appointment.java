package com.example.dentalclinicspringboot.model;

import java.util.Date;

public class Appointment {
    private int id;
    private Date startDate;
    private int durationMins;
    private int eId;
    private int rId;
    private int pId;
    private int dId;
    public Appointment() {
    }
    public Appointment(int id,Date startDate,int durationMins,int eId,int rId,int pId,int dId){
        this.id = id;
        this.startDate = startDate;
        this.durationMins = durationMins;
        this.eId = eId;
        this.rId = rId;
        this.pId =pId;
        this.dId=dId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }
}
