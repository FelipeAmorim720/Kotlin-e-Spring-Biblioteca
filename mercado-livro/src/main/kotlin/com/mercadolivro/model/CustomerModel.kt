package com.mercadolivro.model

import javax.persistence.*

@Entity(name = "customer")
data class CustomerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Int? = null,

    var name : String,

    @Column(name = "email")
    var email : String

)