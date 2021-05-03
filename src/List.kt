fun main(){
    var answer = even(listOf("Judith","Juliet","Joseph","Joviah","Jane","Jackison","James","john","Jacky","Jerom"))
    println(answer)
    var heights= (someone(listOf(1.9,2.8,4.6)))
    println(heights)
    var peopleList =listOf(Person("Kairo",56,79.4,1.2),
                            Person("Nandase",64,102.4,1.5),
                            Person("Gisemba",12,43.2,1.1)
        )
    println(sorting(peopleList))
    var person = listOf(Person("Kairo",56,79.4,1.2),
                    Person("Nandase",64,102.4,1.5),
                    Person("Gisemba",12,43.2,1.1))
    println(addPeople(person))

    var carList = listOf(Car("KCA856567",120),
                         Car("KAA7678",180),
                         Car("KBA5678",140))
    println(findAvg(carList))
}

fun even(names: List<String>): List<String>{
    var nameList = mutableListOf<String>()
    for (name in names){
        if (names.indexOf(name)%2==0){
            nameList.add(name)
        }
    }
    return nameList
}
data class Avgtotal(var avg:Double,var add:Double)
fun someone(ppleHeight:List<Double>):Avgtotal{
    var total = ppleHeight.sum()
    var avg = ppleHeight.average()
    var avgSum = Avgtotal(total,avg)
    return avgSum
}

data class Person(var name:String,var age :Int,var weight:Double,var height:Double)
fun sorting(people:List<Person>):List<Person>{
    return people.sortedByDescending { people -> people.age }
}

fun addPeople(person:List<Any>){
    var oldpeople = mutableListOf<Any>()
    var others = listOf(Person("Belyse",31,63.2,1.9),
        Person("Pamera",22,62.2,1.0)
        )
    oldpeople.add(others)
}

data class Car(var registration:String,var mileage:Int)
fun findAvg(carList:List<Car>):Int{
    var allMiles = 0
    carList.forEach{ car -> allMiles+=car.mileage }
    return allMiles/carList.size
}