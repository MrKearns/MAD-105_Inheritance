/**
 * Commercial Class
 * @author Jonathan Kearns
 * date: 2/28/23
 *
 * @param
 * choice = user's menu choice

 */

fun main(args: Array<String>) {


    // print out menu

    println("---- Customers -----")
    println("1: Residential")
    println("2: Commercial")
    println("3: Exit")
    println("Choose customer type or exit: ")
    var choice = readln().toString()

    // switch to handle user's choice

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

        // if choice not on menu
        else -> {
            println("invalid Choice. Choose again: ")
            println("---- Customers -----")
            println("1: Residential")
            println("2: Commercial")
            println("3: Exit")
            println("Choose customer type or exit: ")
        }

    }


}