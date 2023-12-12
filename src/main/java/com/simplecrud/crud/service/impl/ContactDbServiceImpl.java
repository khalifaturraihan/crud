package com.simplecrud.crud.service.impl;

import com.simplecrud.crud.model.ContactDb;
import com.simplecrud.crud.repository.ContactDbRepository;
import com.simplecrud.crud.service.ContactDbService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactDbServiceImpl implements ContactDbService {

    ContactDbRepository contactDbRepository;

    public ContactDbServiceImpl(ContactDbRepository contactDbRepository) {
        this.contactDbRepository = contactDbRepository;
    }



    @Override
    public String createContactDb(ContactDb contactDb) {
        // More Business Logic
        contactDbRepository.save(contactDb);
        return "Success";
    }

    @Override
    public String updateContactDb(ContactDb contactDb) {
        // More Business Logic
        contactDbRepository.save(contactDb);
        return "Success";
    }

    @Override
    public String deleteContactDb(String contactDbId) {
        // More Business Logic
        contactDbRepository.deleteById(contactDbId);
        return "Success";
    }

    @Override
    public ContactDb getContactDb(String contactDbId) {
        // More Business Logic
        return contactDbRepository.findById(contactDbId).get();
    }

    @Override
    public List<ContactDb> getAllContactDb() {
        // More Business Logic
        return contactDbRepository.findAll();
    }
}