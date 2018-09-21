package com.frontend.gbr.domain;

import javax.persistence.*;
import java.util.Date;
/*
- id: int
- item_type: int
- client_id: int
- status: int
- item_id: varchar(255)
- region: varchar(255)
- city: varchar(255)
- street: varchar(255)
- lon: varchar(255)
- lat: varchar(255)
- date_created: timestamp
- date_updated: timestamp
 */

@Entity
@Table(name = "client_guard_item")
public class ClientGuardItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="item_type")
    private Integer itemType;
    @Column(name="client_id")
    private Long clientId;
    @Column(name="status")
    private Integer status;
    @Column(name="item_id")
    private String itemId;
    private String region;
    private String city;
    private String street;
    private String lon;
    private String lat;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_created")
    private Date dateCreated=new Date();
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_updated")
    private Date dateUpdated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
