package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service

@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getCustomer(name: String?): List<CustomerModel> {
        name?.let {
            // filtrando se o nome contem name e permitindo ignoreCase(Ignora letras maisculas)
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }

    fun createCustomer(customer: CustomerModel) { // criando usuario.
        var id = if (customers.isEmpty()) { // if para validar id.
            1
        } else {
            customers.last().id!!.toInt() + 1 // pegando ultima info da lista e somando +1.
        }.toString()

        customer.id = id
        customers.add(customer) // adicionando na lista com as infos.
    }

    fun getCustomersId(id: String): CustomerModel {
        return customers.filter { it.id == id }.first() // pegando a primeira info com o id passado.
    }

    fun updateCustomer(customer: CustomerModel){
        customers.filter { it.id == customer.id }.first().let { // pegando a primeira info com o id passado.
            it.name =  customer.name
            it.email = customer.email
        }
    }

    fun deleteCustomer(id: String){
        customers.removeIf { it.id == id } // removendo a primeira info com o id passado, se existir.
    }

}