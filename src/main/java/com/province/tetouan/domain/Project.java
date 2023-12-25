package com.province.tetouan.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer num_Project;

    private String object;

    private String responsible;

    private Float price;

    private String type_budget;

    private Date opening_date;

    private String beneficiary;

    private String destination;

    private String state;

    private Date engagement_year;

    private String reference;

    private Date completion_time;

    private Date beginning_service_order;

    private String[] commune;

    public Project(Integer id, Integer num_Project, String object, String responsible, Float price, String type_budget, Date opening_date, String beneficiary, String destination, String state, Date engagement_year, String reference, Date completion_time, Date beginning_service_order, String[] commune) {
        this.id = id;
        this.num_Project = num_Project;
        this.object = object;
        this.responsible = responsible;
        this.price = price;
        this.type_budget = type_budget;
        this.opening_date = opening_date;
        this.beneficiary = beneficiary;
        this.destination = destination;
        this.state = state;
        this.engagement_year = engagement_year;
        this.reference = reference;
        this.completion_time = completion_time;
        this.beginning_service_order = beginning_service_order;
        this.commune = commune;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum_Project() {
        return num_Project;
    }

    public void setNum_Project(Integer num_Project) {
        this.num_Project = num_Project;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType_budget() {
        return type_budget;
    }

    public void setType_budget(String type_budget) {
        this.type_budget = type_budget;
    }

    public Date getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(Date opening_date) {
        this.opening_date = opening_date;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getEngagement_year() {
        return engagement_year;
    }

    public void setEngagement_year(Date engagement_year) {
        this.engagement_year = engagement_year;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getCompletion_time() {
        return completion_time;
    }

    public void setCompletion_time(Date completion_time) {
        this.completion_time = completion_time;
    }

    public Date getBeginning_service_order() {
        return beginning_service_order;
    }

    public void setBeginning_service_order(Date beginning_service_order) {
        this.beginning_service_order = beginning_service_order;
    }

    public String[] getCommune() {
        return commune;
    }

    public void setCommune(String[] commune) {
        this.commune = commune;
    }

}
