fun main(args: Array<String>) {
    val myList = BoxOfChocolate(arrayListOf<Chocolate>(
            Chocolate("Fresa"),
            Chocolate("menta"),
            Chocolate("Agrio")
    ))
    val Forrest= ForrestGump<Chocolate>(myList)
    println(Forrest.PickChocolate())
    println(Forrest.PickChocolate())
    println(Forrest.PickChocolate())
    println(Forrest.PickChocolate())
    println(Forrest.PickChocolate())
}
