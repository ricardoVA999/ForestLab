import java.util.*

class BoxOfChocolate<T>(
        val allItems: ArrayList<T>
){
    fun pickOne():T?{
        if (allItems.size>0){
            return allItems.removeAt(Random().nextInt(allItems.size))
        }
        return null
    }
}
