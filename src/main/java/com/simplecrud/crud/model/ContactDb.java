package com.simplecrud.crud.model;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name="contactdb_info")
public class ContactDb
{
    @Id
    private String contactId;
    private String contactName;
    private String contactAddress;
    private String contactPhoneNumber;

    public ContactDb() {
    }

    public ContactDb(String contactId, String contactName, String contactAddress, String contactPhoneNumber) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.contactAddress = contactAddress;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
}
