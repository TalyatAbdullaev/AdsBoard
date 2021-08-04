package com.example.adsboard.dialoghelper

import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.adsboard.MainActivity
import com.example.adsboard.R
import com.example.adsboard.accounthelper.AccountHelper
import com.example.adsboard.databinding.SignDialogBinding

class DialogHelper(activity: MainActivity) {
    private val activity = activity
    fun createSignDialog(index: Int) {
        val signDialogView = SignDialogBinding.inflate(activity.layoutInflater)
        if (index == DialogConst.SING_UP_CONST) {
            signDialogView.tvTitle.text = activity.resources.getString(R.string.registration_item)
            signDialogView.btnSign.text = activity.resources.getString(R.string.sign_up)
            signDialogView.btnForgotPass.visibility = View.GONE
        } else {
            signDialogView.tvTitle.text = activity.resources.getString(R.string.login_item)
            signDialogView.btnSign.text = activity.resources.getString(R.string.sign_in)
            signDialogView.btnForgotPass.visibility = View.VISIBLE
        }
        AlertDialog.Builder(activity).setView(signDialogView.root).show()

        signDialogView.btnSign.setOnClickListener {
            val email: String = signDialogView.etEmail.text.toString()
            val password: String = signDialogView.etPassword.text.toString()
            when (index) {
                DialogConst.SING_UP_CONST -> AccountHelper(activity).signUpWithEmail(email, password)
                DialogConst.SING_IN_CONST -> { }
            }
        }
    }
}