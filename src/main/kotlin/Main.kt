package com.ginogipsy

import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  var computerChoice = ""
  var playerChoice = ""
  println("Rock, Paper or Scissors? Enter your choice!")

  var count : Int = 0
  val validChoices = setOf("Rock", "Paper", "Scissors")

  do  {
    count++

    when (count) {
      2 -> println("You must choice Rock, Paper or Scissors")
      3 -> println("Rock, Paper or Scissors!!!!!!!")
      4 -> {
        println("It's enough! You're a jackass!")
        exitProcess(0)
      }
    }

    playerChoice = readln()
  } while (isChoiceNotCorrect(playerChoice))

  val randomNumber = (1..3).random()

    when (randomNumber) {
      1 -> computerChoice = "Rock"
      2 -> computerChoice = "Paper"
      3 -> computerChoice = "Scissors"
    }

    println(computerChoice)

    val winner = when {
      playerChoice == computerChoice -> "Tie"
      playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
      playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
      playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
      else -> "Computer"

    }
}

fun isChoiceNotCorrect(playerChoice: String): Boolean {
  return playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors"
}