package com.mercadolivro.controller

import com.mercadolivro.request.PostCustomerRequest
import com.mercadolivro.request.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController {

    val customers = mutableListOf<CustomerModel>()

    @GetMapping
    @ResponseStatus(HttpStatus.OK) // 200
    fun getCustomer(@RequestParam name: String?): List<CustomerModel> { // consultando via requestParam
        name?.let {
            return customers.filter { it.name.contains(name, true) } // filtrando se o nome contem name e permitindo ignoreCase(Ignora letras maisculas)
        }
        return customers
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    fun createCustomer(@RequestBody customer: PostCustomerRequest) { // criando usuario.

        var id = if (customers.isEmpty()) { // if para validar id.
            1
        } else {
            customers.last().id.toInt() + 1 // pegando ultima info da lista e somando +1.
        }.toString()

        customers.add(CustomerModel(id, customer.name, customer.email)) // adicionando na lista com as infos.
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 200
    fun getCustomersId(@PathVariable id: String): CustomerModel {
        return customers.filter { it.id == id }.first() // pegando a primeira info com o id passado.
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    fun updateCustomer(@PathVariable id: String, @RequestBody customer: PutCustomerRequest){
        customers.filter { it.id == id }.first().let { // pegando a primeira info com o id passado.
            it.name =  customer.name
            it.email = customer.email
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    fun deleteCustomer(@PathVariable id: String){
        customers.removeIf { it.id == id } // removendo a primeira info com o id passado, se existir.
    }


}