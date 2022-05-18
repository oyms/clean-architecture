package no.bekk.power.valuetypes

@JvmInline
value class CustomerId(private val value: String) {

    init {
        require(value.length >= 8) { "Invalid length for customerId ${value.length}" }
    }
}
