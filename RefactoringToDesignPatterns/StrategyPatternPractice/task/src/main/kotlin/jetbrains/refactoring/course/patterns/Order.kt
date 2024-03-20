package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.strategy.BitcoinPayment
import jetbrains.refactoring.course.patterns.strategy.CreditCardPayment
import jetbrains.refactoring.course.patterns.strategy.PayPalPayment
import jetbrains.refactoring.course.patterns.strategy.PaymentStrategy
import java.time.LocalDate

class Order(public val totalAmount: Double, public val date: LocalDate) {

}
