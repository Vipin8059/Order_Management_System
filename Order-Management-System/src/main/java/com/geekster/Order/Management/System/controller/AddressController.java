package com.geekster.Order.Management.System.controller;

import com.geekster.Order.Management.System.model.Address;
import com.geekster.Order.Management.System.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody List<Address> addressList){
        return addressService.addAddresses(addressList);
    }
}
