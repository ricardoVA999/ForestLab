class ForrestGump<T>(
        val Box: BoxOfChocolate<T>
){
    fun PickChocolate():String{
        var grab = Box.pickOne()
        if (grab == null){
             return "Life sucks"}
        return "Life is like a Box of something"
    }
}