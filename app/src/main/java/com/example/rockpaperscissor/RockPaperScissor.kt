package com.example.rockpaperscissor

fun main(){
    var pChoice=""       // Declaration of Variable for Player Choice
    var compChoice=""    // Declaration of Variable for Computer Choice

    println("Enter your Choice \nRock \nPaper \nScissor\n")
    pChoice=readln()
    while(pChoice!="Rock"&&pChoice!="Paper"&&pChoice!="Scissor"){
        println("Enter Correct Choice")
        pChoice= readln()
    }
    val randomNumber=(1..3).random()
    if (randomNumber==1){
        compChoice="Rock"
    }
    else if(randomNumber==2){
        compChoice="Paper"
    }
    else{
        compChoice="Scissor"
    }
    println("Computer Choice")
    println(compChoice)
    var winner= ""
    if(pChoice==compChoice){
        winner="Tie"
    }
    else if(pChoice=="Rock"&&compChoice=="Scissor"){
        winner="Player"
    }
    else if(pChoice=="Paper"&&compChoice=="Rock"){
        winner="Player"
    }
    else if(pChoice=="Scissor"&&compChoice=="Paper"){
        winner="Player"
    }
    else{
        winner="Computer"
    }
    println("Winner is $winner")

}