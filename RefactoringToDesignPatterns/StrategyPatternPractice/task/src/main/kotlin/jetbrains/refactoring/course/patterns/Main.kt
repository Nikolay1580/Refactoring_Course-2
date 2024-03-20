package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.processor.PaymentProcessor
import jetbrains.refactoring.course.patterns.strategy.BitcoinPayment
import jetbrains.refactoring.course.patterns.strategy.CreditCardPayment
import jetbrains.refactoring.course.patterns.strategy.PayPalPayment
import java.time.LocalDate

fun main() {

    val creditCardPayment = PaymentProcessor(CreditCardPayment())
    val Paypal = PaymentProcessor(PayPalPayment())
    val BitcoinPayment = PaymentProcessor(BitcoinPayment())



    val order1 = Order(100.0, LocalDate.of(2023, 3, 1))
    val order2 = Order(50.0, LocalDate.of(2023, 6, 1))
    val order3 = Order(200.0, LocalDate.of(2023, 9, 1))

    creditCardPayment.processOrderPayment(order1.totalAmount)
    Paypal.processOrderPayment(order2.totalAmount)
    BitcoinPayment.processOrderPayment(order3.totalAmount)
}
