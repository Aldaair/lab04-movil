package com.huamani.aldair.intentsexplicitandimplicitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

const val PARAMETER_EXTRA_CODE = "code"
const val PARAMETER_EXTRA_FULL_NAME = "fullname"
const val PARAMETER_EXTRA_AMOUNT = "amount"

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val extras = this.intent.extras

        if (extras != null) {
            if (extras.get(PARAMETER_EXTRA_CODE) != null) {
                codeText.text = extras.getString(PARAMETER_EXTRA_CODE)
            }

            if (extras.get(PARAMETER_EXTRA_FULL_NAME) != null) {
                fullnameText.text = extras.getString(PARAMETER_EXTRA_FULL_NAME)
            }

            if (extras.get(PARAMETER_EXTRA_AMOUNT) != null) {
                amountText.text = extras.getString(PARAMETER_EXTRA_AMOUNT)
            }
        }
    }
}