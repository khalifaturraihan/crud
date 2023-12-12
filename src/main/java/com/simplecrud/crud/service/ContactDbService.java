package com.simplecrud.crud.service;


import com.simplecrud.crud.model.ContactDb;

import java.util.List;

public interface ContactDbService {
    public String createContactDb(ContactDb contactDb);
    public String updateContactDb(ContactDb contactDb);
    public String deleteContactDb(String contactDbId);
    public ContactDb getContactDb(String contactDbId);
    public List<ContactDb> getAllContactDb();
}