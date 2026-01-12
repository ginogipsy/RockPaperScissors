package com.ginogipsy

import kotlin.system.exitProcess

fun main() {
  println("Rock, Paper or Scissors? Enter your choice!")

  var count = 0
  val validChoices = setOf("Rock", "Paper", "Scissors")

  val playerChoice = generateSequence {
    count++

    when (count) {
      2 -> println("You must choose Rock, Paper or Scissors")
      3 -> println("Rock, Paper or Scissors!!!!!!!")
      4 -> {
        println("It's enough! You're a jackass!")
        exitProcess(0)
      }
    }

    readln()
  }.first { it in validChoices }

  val computerChoice = listOf("Rock", "Paper", "Scissors").random()
  println("Computer chose: $computerChoice")

  val winner = when {
    playerChoice == computerChoice -> "Tie"
    playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
    playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
    playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
    else -> "Computer"
  }

  println("Winner: $winner")
}
