package com.insan.insantugaswkpl
//class PasswordValidator digunakan untuk validasi panjang password
class PasswordValidator {
    //Method yang berfungsi untuk memeriksa apakah panjang password memenuhi syarat.
    //Syarat dari panjang password adalah lebih dari sama dengan 6.
    fun isPasswordLengthValid(password: String): Boolean {
        return password.length >= 6
    }
}