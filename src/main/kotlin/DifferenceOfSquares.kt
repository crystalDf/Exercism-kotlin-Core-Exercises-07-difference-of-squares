import kotlin.math.pow

class Squares(private val number: Int) {

    fun sumOfSquares(): Int {
        return (1..number).map { it * it }.sum()
    }

    fun squareOfSum(): Int {
        return (1..number).sum().toDouble().pow(2).toInt()
    }

    fun difference(): Int {
        return squareOfSum() - sumOfSquares()
    }
}
