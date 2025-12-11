package com.example.customer_api.service;

import com.example.customer_api.dto.CustomerRequestDTO;
import com.example.customer_api.dto.CustomerResponseDTO;
import com.example.customer_api.dto.CustomerUpdateDTO;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface CustomerService {
    
    Page<CustomerResponseDTO> getAllCustomers(int page, int size, Sort sort);
    

CustomerResponseDTO partialUpdateCustomer(Long id, CustomerUpdateDTO updateDTO)
    
    CustomerResponseDTO getCustomerById(Long id);
    
    CustomerResponseDTO createCustomer(CustomerRequestDTO requestDTO);
    
    CustomerResponseDTO updateCustomer(Long id, CustomerRequestDTO requestDTO);
    
    void deleteCustomer(Long id);
    
    List<CustomerResponseDTO> searchCustomers(String keyword);
    
    List<CustomerResponseDTO> getCustomersByStatus(String status);

    List<CustomerResponseDTO> advancedSearch(String fullName, String email, String status);
}
