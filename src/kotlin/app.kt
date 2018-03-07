package kotlin

fun main(args: Array<String>) {
//    println("Hello World!")
//    println(Kotlin.sum(15, 5))
//    val sumLambda: (Int, Int)-> Int ={a, b -> a+b}
//    println(sumLambda(3, 8))
//    println(Kotlin.sum2(13,12))
//    Kotlin.testStringModel()
//    Kotlin.testBitOpt()
//    Kotlin.testArray()
    testString()
}

fun sum(a: Int, b: Int): Int{
    return a + b
}
fun sum2(a: Int, b: Int) = a + b

fun testStringModel(){
    var a = 1
    var sa = "a is $a"
    a = 2
    var sa2 = "${sa.replace("is", "was")}, but now is $a"
    println(sa2)
}

fun testVarIsType(obj: Any){
    if (obj is String) {//obj为String类型
        println(obj.substring(1))
    }
    //obj为Any类型
}
fun testVarIsNotType(obj: Any): Int?{
    if (obj !is String) {//obj仍为any
        return null
    }
    return obj.length//在if分支return的话，另一支中的obj自动转换为String，if分支没有return的话，另一支中的obj仍为Any类型
}
fun testTypeModify() {
    var s = "123abc"
    s.toIntOrNull()
}

fun testBitOpt(){
    var a = 126
    a.shr(2)
    println("a is $a and a.shr() returns ${a.shr(2)}")
}

fun testArray() {
    val a = arrayOf(1,2,3)
    a.set(1,5)
    println("数组a的内容：")
    for (at in a){
        print("$at ")
    }
    println()
    val b = Array(3, {i -> (i*2) })
    println("数组b的内容：")
    for (bt in b){
        print("$bt ")
    }
}
fun testString() {
    val text0 = """
        多行字符串0
        多行字符串0
    """
    println(text0)
    val text1 = """多行字符串1
多行字符串1"""
    println(text1)
}