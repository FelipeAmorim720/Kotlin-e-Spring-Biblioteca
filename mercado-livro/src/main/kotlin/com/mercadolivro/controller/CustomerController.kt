package com.mercadolivro.controller

import com.mercadolivro.extension.toCustomerModel
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.request.PostCustomerRequest
import com.mercadolivro.request.PutCustomerRequest
import com.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(
        val customerService: CustomerService
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK) // 200
    fun getCustomer(@RequestParam name: String?): List<CustomerModel> { // consultando via requestParam
        return customerService.getCustomer(name)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201
    fun createCustomer(@RequestBody customer: PostCustomerRequest) { // criando usuario.
        return customerService.createCustomer(customer.toCustomerModel())
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 200
    fun getCustomersId(@PathVariable id: Int): CustomerModel {
        return customerService.getCustomersId(id)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
        return customerService.updateCustomer(customer.toCustomerModel(id))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    fun deleteCustomer(@PathVariable id: Int) {
        return customerService.deleteCustomer(id)
    }

}