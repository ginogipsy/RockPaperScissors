package com.ginogipsy

import kotlin.system.exitProcess

// ANSI colors
const val RESET = "\u001B[0m"
const val RED = "\u001B[31m"
const val GREEN = "\u001B[32m"
const val YELLOW = "\u001B[33m"
const val BLUE = "\u001B[34m"
const val PURPLE = "\u001B[35m"
const val CYAN = "\u001B[36m"

fun main() {
  println("${CYAN}Rock, Paper or Scissors? Enter your choice!$RESET")

  var count = 0
  val validChoices = setOf("Rock", "Paper", "Scissors")

  val playerChoice = generateSequence {
    count++

    when (count) {
      2 -> println("${YELLOW}You must choose Rock, Paper or Scissors$RESET")
      3 -> println("${PURPLE}Rock, Paper or Scissors!!!!!!!$RESET")
      4 -> {
        println("${RED}It's enough! You're a jackass!$RESET")
        exitProcess(0)
      }
    }

    readln()
  }.first { it in validChoices }

  val computerChoice = listOf("Rock", "Paper", "Scissors").random()
  println("${BLUE}Computer chose: $computerChoice$RESET")

  val winner = when (playerChoice) {
      computerChoice -> "${YELLOW}Tie$RESET"
      "Rock" if computerChoice == "Scissors" -> "${GREEN}Player$RESET"
      "Scissors" if computerChoice == "Paper" -> "${GREEN}Player$RESET"
      "Paper" if computerChoice == "Rock" -> "${GREEN}Player$RESET"
      else -> "${RED}Computer$RESET"
  }

  println("Winner: $winner")
}
