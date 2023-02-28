import java.text.DecimalFormat

class Commercial (propertyName: String, rate: Double, multiProperty: Boolean, name: String, phoneNumber: String, address: String, squareFootage: Double)
    : Customer(name, phoneNumber, address, squareFootage){

    var propertyName = ""
    val rate = 0.005
    var multiProperty = false

    init {
        this.propertyName = propertyName
        this.multiProperty = multiProperty
    }

    fun weeklyCharges(): Int {

        var total = 0
        var totalFormat = DecimalFormat("\u0024###,###.00")

        println("-- Commercial Customer --")
        println("Property Name: $propertyName")
        println("Contact Name: $name")
        println("Address: $address")
        println("Phone Number: $phoneNumber")
        println("Multi-Property Discount: $multiProperty")
        println("Total Square Footage: $squareFootage")

        when (multiProperty){
            true -> {
                total = (rate * squareFootage).toInt()
                var discountTotal  = total - (total * .10)
                total = discountTotal.toInt()
                println("Weekly Charges = ${totalFormat.format(total)}\n")
                return total
            }

            false -> {
                total = (rate * squareFootage).toInt()
                println("Weekly Charges = ${totalFormat.format(total)}\n")
                return total
            }
        }
    }
}

var commercial1 = Commercial("Grey Gardens", 0.005, false,"Edith Beale", "0000001", "3 West End Road, East Hampton, NY", 25000.00)
var commercial2 = Commercial("Waterfall Downs", 0.0005, true, "Larry Waterfall", "0000002", "1 Downs St. Waterfall, CA", 123000.5)
var commercial3 = Commercial("Mountain Park", 0.005, false, "Mary Park", "0000003", "36 Mountain Way, MO", 5000001.0)

var commercialArray = arrayOf(commercial1, commercial2, commercial3)