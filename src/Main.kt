fun main(){
    var y=names(listOf("Zuenah","Wairimu","Macharia","chise","Timo","Kim","Kimala","Peter","Pascaline","Susan"))
    println(y)

    var company=height(listOf(6.2,5.5,4.7,5.8))
    println(company)

    var trainer=People("trainer",40,3.0,60.0)
    var foreman=People("foreman",40,2.3,30.5)
    var technician=People("technician",36,3.2,56.0)
    var thisPeople= listOf(trainer,foreman,technician)
    var tP=thisPeople.sortedByDescending { people -> people.age }
    println(tP)

    var first=People("John",34,67.0,67.0)
    var last=People("Michael",45,4.0,56.0)
    var total= mutableListOf(first,last)
    println(total.plus(thisPeople))

    var forester=Car("kbt4678",60.78)
    var toyota=Car("kcx5689",45.44)
    var audi=Car("kbx34ff6",68.22)
    var vehicles= listOf(forester,toyota,audi)
    println(carArrange(vehicles))
}

fun names(name:List<String>):List<String> {
    var even = mutableListOf<String>()
    name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            even.add(s)
        }

    }
    return even
}


fun height(hgt:List<Double>):String{
    var total=hgt.sum()
    var average=hgt.average()
    var combine="$total,$average"
    return combine
}
data class People(var name:String,var age:Int, var height:Double,var weight:Double)

//4     Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
fun peps(personsecond:List<Any>):List<Any>{

    return listOf()
}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)
data class Car(var registration:String,var mileage:Double)
fun carArrange(car: List<Car>):Double{
    var totl=0.0
    car.forEach { carz->
        totl+=carz.mileage
    }
    return totl/car.count()

}
