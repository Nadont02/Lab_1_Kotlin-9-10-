import javax.print.attribute.standard.PrintQuality

data class Item(
    val id: Int,
    val name: String,
    val quality: Int
){
    override fun toString(): String {
        return "Id предмета: $id\nИмя: $name\nКоличество: $quality\n"
    }
}
fun main(){
    val sword = Item(1,"Sword",1)
    val betterSword = sword.copy(quality = 2)
    println(sword.toString())
    println(betterSword.toString())
    val(id, name, quantity) = betterSword
    println("Id предмета: $id\nИмя: $name\nКоличество: $quantity\n")
}