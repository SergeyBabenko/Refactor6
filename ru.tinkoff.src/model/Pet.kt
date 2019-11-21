package model

import Sex

class Pet {
    var nickname: String = ""
    var age: Int = 0
    var sex: Sex? = Sex.UNKNOWN
    override fun toString(): String = "Pet(nickname=$nickname, age=$age, sex=$sex)"
}