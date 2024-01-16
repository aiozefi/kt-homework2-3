fun main() {
    val purchaseAmount = 11000.0 // Замените это значение на актуальную сумму покупки
    val isRegularCustomer = true // Замените на true, если пользователь является постоянным, иначе false

    val discount = calculateDiscount(purchaseAmount, isRegularCustomer)
    val discountedAmount = purchaseAmount - discount

    println("Сумма покупки: $purchaseAmount руб.")
    println("Скидка: $discount руб.")
    println("Итоговая сумма с учетом скидки: $discountedAmount руб.")
}

fun calculateDiscount(amount: Double, isRegularCustomer: Boolean): Double {
    val baseDiscount = if (amount >= 10001.0) amount * 0.05 else 0.0
    val regularCustomerDiscount = if (isRegularCustomer) (amount - baseDiscount) * 0.01 else 0.0

    return when {
        amount in 0.0..1000.0 -> regularCustomerDiscount
        amount in 1001.0..10000.0 -> 100.0 + regularCustomerDiscount
        else -> baseDiscount + regularCustomerDiscount
    }
}
