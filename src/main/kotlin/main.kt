fun main() {
    val isUserMeloman = true
    val purchaseAmount = 10500
    val currentPrice = 100
    println("Покупка $currentPrice руб.")

    var discountPrice = if (purchaseAmount <= 1000) {
        currentPrice*100
    } else if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
        (currentPrice - 100)*100
    } else{
        ((currentPrice-(currentPrice * 0.05))*100).toInt()
    }

    discountPrice = if(isUserMeloman)
        discountPrice-(discountPrice*0.01).toInt()
    else
        discountPrice

    if(discountPrice%100!=0){
        println("После применения скидки - " + discountPrice/100 + " руб. " + discountPrice%100 + " коп." )
    }else{
        println("После применения скидки - " + discountPrice/100 + " руб.")
    }
}