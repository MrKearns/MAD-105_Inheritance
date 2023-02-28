fun main(args: Array<String>) {

    println("---- Customers -----")
    println("1: Residential")
    println("2: Commercial")
    println("3: Exit")
    println("Choose customer type or exit: ")
    var choice = readln().toString()

    when (choice) {
        "1" -> {
            for (i in residentialArray) {
                i.weeklyCharges()
            }
        }

        "2" -> {
            for (i in commercialArray) {
                i.weeklyCharges()
            }
        }

        "3" -> println("Goodbye")

        else -> {
            println("invalid Choice. Choose again: ")
            println("---- Customers -----")
            println("1: Residential")
            println("2: Commercial")
            println("3: Exit")
            println("Choose customer type or exit: ")
        }

    }

//    customer1.weeklyCharges()
//    customer2.weeklyCharges()

}