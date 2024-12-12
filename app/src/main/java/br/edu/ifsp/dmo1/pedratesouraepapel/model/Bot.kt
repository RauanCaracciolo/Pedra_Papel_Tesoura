package br.edu.ifsp.dmo1.pedratesouraepapel.model

import kotlin.random.Random

object Bot {
    fun randomWeapon() : Weapon? {
        val randomNumber = Random.nextInt(1,4)
        return when(randomNumber){
            1-> Rock
            2-> Scissors
            3-> Paper
            else ->null
        }
    }

}