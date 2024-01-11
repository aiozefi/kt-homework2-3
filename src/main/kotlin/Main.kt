fun main() {
    val purchaseAmount = 15000.0 // Сумма покупки
    val isRegularCustomer = true // Является ли покупатель постоянным

    val discount = calculateDiscount(purchaseAmount, isRegularCustomer)
    val discountedAmount = purchaseAmount - discount

    println("Сумма покупки: $purchaseAmount руб.")
    println("Скидка: $discount руб.")
    println("Итоговая сумма с учетом скидки: $discountedAmount руб.")
}

fun calculateDiscount(amount: Double, isRegularCustomer: Boolean): Double {
    return when {
        amount in 0.0..1000.0 -> 0.0
        amount in 1001.0..10000.0 -> 100.0
        else -> {
            val baseDiscount = amount * 0.05
            val regularCustomerDiscount = if (isRegularCustomer) baseDiscount * 0.01 else 0.0
            baseDiscount + regularCustomerDiscount
        }
    }
}
