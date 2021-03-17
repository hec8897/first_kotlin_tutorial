package com.example.kotlinapplication

fun main(){

    helloWorld();
    println(add(4,5))
}

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