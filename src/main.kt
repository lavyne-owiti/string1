fun main(){
    var name="AkiraChix"
    println(name[0].toString()+name[2]+name[3])

    var x=word("Lavyne",23)
    println(x)
    var p=name("lavyneowiti")
    println(p)
    voom("lavyne owiti","lavyne owiti")
    voom("lavyne","lavyne owiti")

}

fun word(name:String,age:Int):String{
    var me="Hi,my name is $name and I am $age years old"
    return me
}
fun name(x:String):Int{
    var y=x.length
    return y
}

fun voom(m:String,n:String) {
    if (m.equals(n)) {
        println("that's me")
    } else {
        println("i don't know who that is")
    }
}