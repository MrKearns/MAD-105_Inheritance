import java.text.DecimalFormat
class Residential(val rate: Double = 0.006, senior: Boolean, name: String, address: String, phoneNumber: String, squareFootage: Double)
    : Customer(name, address, phoneNumber, squareFootage) {


    var senior: Boolean

    init {

        this.senior = senior
    }


        fun weeklyCharges(): Int {

            var total = 0
            var totalFormat = DecimalFormat("\u0024###,###.00")

            println("-- Residental Customer --")
            println("Name: $name")
            println("Address: $address")
            println("Phone Number: $phoneNumber")
            println("Senior Discount: $senior")
            println("Total Square Footage: $squareFootage")

            when (senior){
                true -> {
                    total = (rate * squareFootage).toInt()
                    var discountTotal  = total - (total * .15)
                    total = discountTotal.toInt()
                    println("Weekly Charges: ${totalFormat.format(total)}\n")
                    return total
                }

                false -> {
                    total = (rate * squareFootage).toInt()
                    println("Weekly Charges:  ${totalFormat.format(total)}\n")
                    return total
                }
            }




        }
}



var customer1 = Residential(0.006,true, "Joe N.", "1234 Street. City, IL", "1234567", 5000.0)
var customer2 = Residential( senior = false, name = "Samantha Smith", address = "7897 Road, Town, IL", phoneNumber = "0197777", squareFootage = 4750.00)
var customer3 = Residential(0.006, false, "Rodg Rodger", "67 This Street, IL", "8184556", squareFootage = 25000.00)

var residentialArray = arrayOf(customer1, customer2, customer3)