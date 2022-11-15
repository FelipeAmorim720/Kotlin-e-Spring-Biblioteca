package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
        val customerRepository: CustomerRepository
) {

    fun getCustomer(name: String?): List<CustomerModel> {
        name?.let {
            // filtrando se o nome contem name e permitindo ignoreCase(Ignora letras maisculas)
            return customerRepository.findByNameContaining(it)
        }
        return customerRepository.findAll().toList()
    }

    fun createCustomer(customer: CustomerModel) { // criando usuario.
        customerRepository.save(customer)
    }

    fun getCustomersId(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow() // pegando a primeira info com o id passado.
    }

    fun updateCustomer(customer: CustomerModel) {
        if (!customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }

        customerRepository.save(customer)
    }

    fun deleteCustomer(id: Int) {
        if (!customerRepository.existsById(id)) {
            throw Exception()
        }

        customerRepository.deleteById(id)
    }

}