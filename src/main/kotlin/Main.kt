fun main(){
    digit(listOf("joy","lisa","liz","jeff","edu","iregi","dante","danny","brayo","winnie"))
    //
    println(people2)
    //
    heights(listOf(4.5,3.8,4.0))
    //

}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun digit(digits:List<String>):List<String>{
    var number = mutableListOf<String>()
    for (n in digits.indices step 2){
        number.add(digits[n])
    }
    return number
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
var people =
    listOf(
        Person("Alice",22,4.5,55.0),
        Person("Joy",29,4.50,55.9),
        Person("Jemimah",28,5.0,67.5),
        Person("Jeff",24,4.7,60.0)
    )
var people2 = people.sortedByDescending { person -> person.age  }

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addPeople(adding:List<String>){

}


//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heights(height:List<Double>): Pair<Double,Double>{
    var height2 = height.sum()
    var heightTotal = height2 / height.size

    return Pair(heightTotal,height2)
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
 class Car(var registration:String,var mileage:Int)
fun avMileage():Double{
var cars =
    listOf(
        Car("KDD 340W",1200),
        Car("KDA 546Q",4500),
        Car("KBB 560U",6000),
        Car("KCC 540U",450)
    )
var cars2 = listOf(1200,4500,6000,450)
return cars2.average()
}
