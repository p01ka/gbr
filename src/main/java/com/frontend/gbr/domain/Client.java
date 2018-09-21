package com.frontend.gbr.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
 id: int
- client_type: integer {1-jur lico, 2 - fiz lico}
- first_name: varchar(255)
- last_name: varchar(255)
- middle_name: varchar(255)
- item_name: varchar(255) - naz ur organ
- item_name_marketing: varchar(255)
- phone: varchar(255)  - fiz lico
- date_created: timestamp
- date_updated: timestamp

 */
@Entity
@Table(name="client")
public class Client {

    public Client(){}

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Collection<ClientGuardItem> clientGuardItemCollection=new ArrayList<>();

    public Collection<ClientGuardItem> getClientGuardItemCollection() {
        return clientGuardItemCollection;
    }



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "client_type")
    private Integer clientType;

     @Column(name="first_name")
    private String firstName;

     @Column(name="last_name")
    private String lastName;

     @Column(name="middle_name")
    private String middleName;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_marketing_name")
    private String itemMarketingName;

    @Column(name="phone")
    private String phone;

    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated = new Date();

    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClienType() {
        return clientType;
    }

    public void setClienType(Integer clienType) {
        this.clientType = clienType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

//    public String getItemName() {
//        return itemName;
//    }
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }
//
//    public String getItemMarketingName() {
//        return itemMarketingName;
//    }
//
//    public void setItemMarketingName(String itemMarketingName) {
//        this.itemMarketingName = itemMarketingName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

//    public Date getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(Date dateCreated) {
//        this.dateCreated = dateCreated;
//    }
//
//    public Date getDateUpdated() {
//        return dateUpdated;
//    }
//
//    public void setDateUpdated(Date dateUpdated) {
//        this.dateUpdated = dateUpdated;
//    }
}
