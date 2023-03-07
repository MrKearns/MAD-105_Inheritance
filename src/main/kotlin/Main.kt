/**
 * Commercial Class
 * @author Jonathan Kearns
 * date: 2/28/23
 *
 * @param
 * choice = user's menu choice
 *
 * updated 3/7/23 added all read lines ... I believe I misunderstood assignment the first time I read it.

 */

fun main(args: Array<String>?) {


    // print out menu

    println("---- MENU -----")
    println("1: Add Residential Customer")
    println("2: Add Commercial Customer")
    println("3: Exit")
    println("Choose customer type or exit: ")
    var choice = readln().toString()

    // switch to handle user's choice


    // get all of new customer's info from read line.
    when (choice) {
        "1" -> {
            println("Enter Customer Name: ")
            var name = readln().toString()

            println("Enter Customer Address: ")
            var address = readln().toString()

            println("Enter Customer Phone Number: ")
            var phone = readln().toString()

            println("Enter Customer Square Footage: ")
            var footage = readln().toDouble()

            println("Is Customer a Senior? True or false: ")
            var senior = readln().toBoolean()

            // create new customer variable
            var newCustomer = Residential(0.006, senior, name, address, phone, footage)

            // add new customer to array
            residentialArray += newCustomer


            println("-- All Customers - Newest Customers Will Be at the Bottom --")


            // print out all customers
            for (i in residentialArray) {
                i.weeklyCharges()
            }
        }

        "2" -> {
            // get all of new commercial customer's info from read line.

            println("Enter Contact Name: ")
            var contactName = readln().toString()

            println("Enter Property Name: ")
            var propertyName = readln().toString()

            println("Enter Customer Address: ")
            var address = readln().toString()

            println("Enter Customer Phone Number: ")
            var phone = readln().toString()

            println("Enter Customer Square Footage: ")
            var footage = readln().toDouble()

            println("Is This a Multi-property Customer? True or false: ")
            var multi = readln().toBoolean()

            // new customer variable
            var newCustomer = Commercial(propertyName,0.005, multi, contactName, address, phone, footage)
            // add new customer to array
            commercialArray += newCustomer


            // print out all commercial customers
            for (i in commercialArray) {
                i.weeklyCharges()
            }
        }

        "3" -> println("Goodbye")

        // if choice not on menu
        else -> {
            println("invalid Choice. Choose again: ")
            main(null)
        }

    }


}