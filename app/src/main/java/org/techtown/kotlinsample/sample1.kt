package org.techtown.kotlinsample

fun main(){
    //3. String Template

    val name = "haneul"
    val lastName = "Kim"
    println("my name is ${name + lastName} I'm 33")
    //변수를 출력하고 싶을때는 $ 표시를 사용한다.
    //변수명 뒤에 띄어쓰기를 하지 않고 사용하고 싶을때는 $뒤를 {}로 감싼다.

    println("this is 2\$ad")
    //$ 표시 뒤에 문자를 사용하고 싶을때는 $ 앞에 \를 붙인다.

   helloworld()

    println(add(4,5))
    checNum(1)
    forandWhile()
    nullcheck()
    ignoreNulls("")

    // - > 한줄 주석
    /*
    * -> 여러줄 주석
     */
}

//1. 함수
fun helloworld() : Unit{
    println("hello world")
}

fun add(a : Int, b : Int):Int{
    // 변수명이 앞에온다.
    //return 값이 있을때는 중가로 앞에  콜론(:) return type 을 입력해주어야한다.
    return a+b
}

//2. val 과 var 의 차이
//val = value 즉 값 바뀌지 않는값
//var = variable  변할수 있는수
fun hi(){
    val a : Int = 10

    var b : Int = 9

    b = 100
    // a = 100 ->  Val cannot be reassigned 상수여서 값을 재할당 할수 없다.

    val c = 100 // Int 라고 적지 않아도 Int 인지 안다.
    var d = 100
    val e : String // 값은 선언하지 않을때는 타입을 적어주어야한다.
    var name = "haneul"


}

//4. 조건식

fun  maxby(a:Int, b: Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a:Int, b:Int) = if (a>b) a else b
// 3항 연산자 대신 사용

fun checNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println(" I don't Know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b: ${b}")

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okey")
    }
}

//Expression vs statement

//5. Array and List

//Array

//List 1. List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3,)

    val array2 = arrayOf(1,"b",3.4f)
    val list2 = listOf(1,"b",11L)

    array[0] = 3

//    list[0] =2 -> list 는 읽기만 가능하다 그래서 변경이 불가하다.
  var result =  list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)


}

//6. 반복문
//for / While
fun forandWhile(){
    val students = arrayListOf("haneul","james","jenny","hyojin")

    for (name:String in students){
        println("${name}")
    }

    var sum:Int = 0
    for ( i:Int in 1..100){
        sum +=i
    }
//    for ( i:Int in 1..10 step 2){
//        sum +=i
//    }

//    for ( i:Int in 10 downTo 1){
//        sum +=i
//    }

//    for ( i:Int in 1 until 100){//1..100 -> 이것과 다른점은 100을 포함하지 않는다.
//        sum +=i
//    }

    println(sum)


    for ((index:Int,name:String)in students.withIndex()){
        println("${index+1} 번째 학생: ${name}")
    }


    var index = 0
    while (index <10){
        println("current index : ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    //NPE :Null pointer Exception

    var name : String = "haneul"

    var nullName : String? = null // ?를 넣으면 null 타입으로 바꿀수 있다.

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpeperCase = nullName?.toUpperCase()

    // ?:

    val lastname : String? = "Kim"

    val fullName = name +" "+ (lastname?: "No lastNbame")

    println(fullName)
}


//!!

fun ignoreNulls(str : String?){
    val mNotNull : String =str!!
    val upper:String = mNotNull.toUpperCase()


    val email : String?= null
    email?.let{
        //let -> 자신의 리시버 객체를 람다식 내부로 옮겨서 실행하는 구문
        println("my email is ${email}")
    }


}