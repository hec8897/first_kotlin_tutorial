package com.example.kotlinapplication


//fun main(){
////3. String Template
//    val name = "Dawoon";
//    val lastname = "Kim";
//    println("my name is ${name + lastname}")
//
////    helloWorld();
////    println(add(4,5))
//}

// 1. 함수

fun helloWorld() : Unit {
    //Unit 리턴 타입이 없을경우 써줘야함 (생략가능)
    println("Hello Kotlin")
}

fun add(a : Int,b : Int) : Int {
    // 변수 명 : 타입
    // 리턴을 해야할경우 타입을 지정해야함
    return  a+b
}


// 2. val vs var

fun hi(){
    // val = value 값 상수
    // var = value 값 변수

    val a : Int = 10
    var b : Int = 9
//    a = 100 -> X
    b = 100

    // 데이터 타입 생략가능
    val c = 10
    var d = 100

    val dawoon = "dawoon"
}

fun main(){
    checkNum(1)
}
//4. 조건식

fun maxBy(a:Int,b:Int) : Int {
    if(a>b){
        return  a
    }
    else{
        return b
    }
}

fun maxBy2(a:Int,b:Int) : Int = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("0")
        1 -> println("1")
        2,3 -> println("2,3")
        else -> println("no")
    }

    var b:Int = when(score){
        1-> 1
        2-> 2
        else-> 3
    }
    println("b :${b}")

    when(score){
        in 90..100 -> println("good")
        in 10..80 -> println("bad")
        else -> println("ok")
    }
}
