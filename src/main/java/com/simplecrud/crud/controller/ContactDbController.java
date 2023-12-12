package com.simplecrud.crud.controller;

import com.simplecrud.crud.model.ContactDb;
//import com.simplecrud.crud.response.ResponseHandler;
import com.simplecrud.crud.service.ContactDbService;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactDbController
{
    ContactDbService contactDbService;

    public ContactDbController(ContactDbService contactDbService) {
        this.contactDbService = contactDbService;
    }

    // Read Specific Cloud Vendor Details from DB
//    @GetMapping("/{contactId}")
//    @ApiOperation(value ="Contact id", notes="Provide contact details",
//            response = ResponseEntity.class)
//    public ResponseEntity<Object> getContactDbDetails(@PathVariable("contactId") String contactId)
//    {
//        return ResponseHandler.responseBuilder("Requested Contact Details are given here",
//                HttpStatus.OK, contactDbService.getContactDb(contactId));
//    }
    // Read Specific Contact Details from DB
    @GetMapping("{contactId}")
    public ContactDb getContactDbDetails(@PathVariable("contactId") String contactId)
    {
        return contactDbService.getContactDb(contactId);
    }

    // Read All Contact Details from DB
    @GetMapping()
    public List<ContactDb> getAllContactDbDetails()
    {
        return contactDbService.getAllContactDb();
    }

    @PostMapping
    public String createContactDbDetails(@RequestBody ContactDb contactDb)
    {
        contactDbService.createContactDb(contactDb);
        return "Contact Created Successfully";
    }

    @PutMapping
    public String updateContactDbDetails(@RequestBody ContactDb contactDb)
    {
        contactDbService.updateContactDb(contactDb);
        return "Contact Updated Successfully";
    }

    @DeleteMapping("{contactId}")
    public String deleteContactDbDetails(@PathVariable("contactId") String contactId)
    {
        contactDbService.deleteContactDb(contactId);
        return "Contact Deleted Successfully";
    }
}
