fun main(){
    categorizecars(Car("Tesla", "legacy","red"))
    categorizecars(Car("Toyota", "legacy","blue"))
    categorizecars(Car("Marcedece","legacy","white"))


}
data class Car(var make:String,var model:String,var color:String)

fun categorizecars(car: Car) {
    var redList = mutableListOf<Car>()
    var blueList = mutableListOf<Car>()
    var othersList = mutableListOf<Car>()
    when (car.color) {
        "red" -> redList.add(car)
        "blue" -> blueList.add(car)
        else -> othersList.add(car)
    }
    println(redList)
    println(blueList)
    println(othersList)
}
fun String(word:String):Int {
    var Word = "mary"
    word.length
}
return length

data class currentAccount(var accountName:String,var accountNumber:Int,var accountBalnce)
fun deposite(amount:Double){

}
fun withdraw(amount:Double){

}
