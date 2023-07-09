package com.geekster.Order.Management.System.service;

import com.geekster.Order.Management.System.model.Address;
import com.geekster.Order.Management.System.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddresses(List<Address> addressList) {
        addressRepo.saveAll(addressList);
        return "addresses added successfully."+addressList;
    }
}
