package no.bekk.power.usecase.customer

import no.bekk.power.customer.Customer
import no.bekk.power.customer.CustomerFactory
import no.bekk.power.customer.CustomerRepository
import no.bekk.power.valuetypes.CustomerId
import java.lang.IllegalArgumentException

class CreateCustomerUseCase(private val customerRepository: CustomerRepository) {

    fun create(name: String, customerId: String, country: String): Customer {
        if (customerRepository.findByCustomerId(CustomerId(customerId)) != null) {
            throw IllegalArgumentException("Customer with id $customerId already exists")
        }

        val customer = CustomerFactory.create(
            name = name,
            customerId = customerId,
            country = country
        )

        customerRepository.save(customer)
        return customer
    }
}
