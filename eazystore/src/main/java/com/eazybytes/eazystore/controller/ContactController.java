package com.eazybytes.eazystore.controller;

import com.eazybytes.eazystore.dto.ContactRequestDto;
import com.eazybytes.eazystore.dto.ProductDto;
import com.eazybytes.eazystore.service.IContactService;
import com.eazybytes.eazystore.service.IProductService;
import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contacts")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {

   private final IContactService contactService;

    @PostMapping
    public ResponseEntity saveContact(@RequestBody  ContactRequestDto contactRequestDto){
        boolean isSaved = contactService.saveContact(contactRequestDto);
        if(isSaved){
            return ResponseEntity.status(HttpStatus.CREATED).body("Request processed successfully");
        }
        else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body("An error occurred. Please try again or contact Dev Team.");
        }
    }
}
