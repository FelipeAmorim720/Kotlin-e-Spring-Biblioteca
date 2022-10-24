package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    val customers = mutableListOf<CustomerModel>()

    fun getCustomer(name: String?): List<CustomerModel> {
        name?.let {
            // filtrando se o nome contem name e permitindo ignoreCase(Ignora letras maisculas)
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }

    fun createCustomer(customer: CustomerModel) { // criando usuario.
        customerRepository.save(customer)
    }

    fun getCustomersId(id: Int): CustomerModel {
        return customers.filter { it.id == id }.first() // pegando a primeira info com o id passado.
    }

    fun updateCustomer(customer: CustomerModel) {
        customers.filter { it.id == customer.id }.first().let { // pegando a primeira info com o id passado.
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun deleteCustomer(id: Int) {
        customers.removeIf { it.id == id } // removendo a primeira info com o id passado, se existir.
    }

}