interface Movable{
    fun move()
}
class Car : Movable{
    override fun move() {
        println("Едем на машине")
    }
}
class Aircraft : Movable{
    override fun move(){
        println("Летим на самолете")
    }
    override fun stop() = println("Приземляемся...")
}
fun main(){
    val car: Movable = Car()
    val aircraft: Movable = Aircraft()
    val olesya = WorkinStudent("Olesya")
    olesya.work()
    olesya.study()
    aircraft.move()
//    travel(obj = car)
//    travel(obj = aircraft)
}
fun travel(obj: Movable) = obj.move()
interface Worker{
    fun work()
    fun stop() {
        println("Останавливаемся...")
    }
}
interface Student{
    fun study()
}
class WorkinStudent(val name: String): Worker,Student{
    override fun work() = println("$name работает")
    override fun study() = println("$name учится")
    }