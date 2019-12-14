fun main(args: Array<String>) {
    val myshape: Array<String> = arrayOf("Circle","Triangle","Square","Rectangle")
    var choice = -1
    var loopvar: Int
    val writeout: String

    while(choice !in 0..myshape.size - 1){
        loopvar = 0
        println("Please choose a shape (1-4) to get it's area: ")
        while (loopvar < myshape.size){
            println(myshape.get(loopvar))
            loopvar ++
        }
        print("")
        choice = readLine()!!.toInt() - 1

        if (choice !in 0..myshape.size - 1)
            println("Invalid Entry, try again")
    }
    //reset it all, we have our choice, now let's get the inputs
    fun circleArea(): String{
        //Have them input the radius
        println("Please enter the length of the radius")
        val pi = 3.14
        val input = readLine()!!.toInt()
        return (pi  * input).toString()
    }

    fun triangleArea(): String{
        //Have them input the base and height
        println("Please enter the length of the base")
        val input = readLine()!!.toInt()

        println("Please enter the height")
        val input2 = readLine()!!.toInt()

        return (0.5 * input  * input2).toString()
    }

    fun squareEa(): String{
        //Have them input the side
        println("Please enter the length of one side")
        val input = readLine()!!.toInt()
        return (input  * input).toString()
    }

    fun rectangleArea(): String{
        //Have them input the side
        println("Please enter the width")
        val input = readLine()!!.toInt()

        println("Please enter the height")
        val input2 = readLine()!!.toInt()

        return (input  * input2).toString()
    }
    when (choice) {
        0 -> writeout = circleArea()
        1 -> writeout = triangleArea()
        2 -> writeout = squareEa()
        3 -> writeout = rectangleArea()
        !in 1..4-> writeout = "Not in Range"
        else -> writeout = "Atastrophetay!!!"

    }

    println("Your shape, " + myshape[choice] + ", has an area of $writeout." )

}