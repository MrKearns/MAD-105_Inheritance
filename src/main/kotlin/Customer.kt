class Person (firstName: String, lastName: String){

        var firstName: String = ""
        var lastName: String = ""
        var fullName: String = ""

    init{
        this.firstName = firstName
        this.lastName = lastName
        fullName = setFullName()
    }

    fun setFullName(): String{
        return "$firstName $lastName"
    }
}