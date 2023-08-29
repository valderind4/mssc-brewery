package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{


    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John West")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer with id: " + customerId.toString());
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting customer with id: " + customerId.toString());
    }
}
