package bootiful.kotlin

fun main() {

	//fun reverse (string : String) = string.reversed()

	//val reverse : (String) -> String = {name -> name.reversed()}
	val reverse = {name : String -> name.reversed()}

	val name : String = "Joe"
	val age = 39

	println("name is $name and the age is $age")

	val text = reverse("this is kotlin code")

	println("reverse string $text")
}