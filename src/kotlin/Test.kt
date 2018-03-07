package kotlin

class Test constructor(name: String, ID: String) {//主构造器是类头的一部分，跟在类名之后
    var name: String = ""// 属性初始化器
    var ID:String = ""
    init{ // 主构造函数函数体
        println("init: this.name = ${this.name}, this.ID = ${this.ID}")
        this.name = name
        this.ID = ID
        println("init: this.name = ${this.name}, this.ID = ${this.ID}")
    }
    var major: String = ""
    fun foo() {println("Kotlin.Test:foo()")}
    init {
        println("Second initializer block that prints foo()")
    }
    //constructor(){} primary constructor call exceed
    constructor(name: String, ID: String, major:String) : this(name, ID){
        this.major = major // 若主构造函数存在的话，将次构造函数委托给猪构造函数
    }
}

class EmptyClass

open class Person(open var name: String){//主构造器没有注解或可见性修饰符时，可以省略constructor关键字
    open val size: Int = name.length.also { println("Initializing size in Kotlin.Person: $it") }
}

class Student(override var name: String, var studentID:String) : Person(name){

}