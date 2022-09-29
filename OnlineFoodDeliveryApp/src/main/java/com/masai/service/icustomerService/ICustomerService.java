package com.masai.service.icustomerService;

import java.util.List;


import com.masai.model.Customer;
import com.masai.model.Restaurant;
import com.masai.exceptions.CustomerException;
import com.masai.exceptions.RestaurantException;

public interface ICustomerService {
	
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(Customer customer)throws CustomerException;
	
	public Customer removeCustomer(Customer customer)throws CustomerException;
	
	public Customer viewCustomer(Customer customer)throws CustomerException;
	
	public List<Customer> viewAllCustomers(Restaurant rest) throws RestaurantException;

}
