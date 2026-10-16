class Retangulo(private val base: Int, private val altura: Int) {
    fun caluclarArea(): Int {
        return base * altura
    }
    fun calcularPerimetro(): Int{
        return 2*base + 2*altura
    }
}