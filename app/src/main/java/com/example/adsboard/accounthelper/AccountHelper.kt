package com.example.adsboard.accounthelper

import android.widget.Toast
import com.example.adsboard.MainActivity
import com.google.firebase.auth.FirebaseUser

class AccountHelper(activity: MainActivity) {
    private val activity = activity
    fun signUpWithEmail(email: String, pass: String) {
        if (email.isNotEmpty() && pass.isNotEmpty()) {
            activity.mAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    sendEmailVerification(it.result?.user!!)
                    Toast.makeText(activity, "Account create successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(activity, "Account create is not successful", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun sendEmailVerification(user: FirebaseUser) {
        user.sendEmailVerification().addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(activity, "Email verification successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(activity, "Email verification is not successful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}