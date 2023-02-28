open class Customer (name: String, phoneNumber: String, address: String, squareFootage: Double){

    var name: String = ""
    var address: String = ""
    var phoneNumber: String = ""
    var squareFootage = 0.0

    init{
        this.name = name
        this.address = address
        this.phoneNumber = phoneNumber
        this.squareFootage = squareFootage
    }


    fun displayInfo(){
        println(name)
        println(address)
        println(phoneNumber)
        println(squareFootage)
    }

}