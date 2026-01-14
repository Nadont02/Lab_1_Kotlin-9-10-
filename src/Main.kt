fun main(){
    val manager = ResourceManager()
    val mineral = OutpostResource(id = 1, name = "Mineral", amount = 300)
    val gas = OutpostResource(id = 2, name = "Gas", amount = 100)
    manager.add(mineral)
    manager.add(gas)
    manager.printAll()
    val bonus = mineral.copy(amount = mineral.amount + 50)
    println("Копия минералов с бонусом: $bonus")
}