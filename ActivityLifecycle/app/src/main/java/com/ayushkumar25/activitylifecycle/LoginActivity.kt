package com.ayushkumar25.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {



    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgetPassword: TextView
    lateinit var txtRegister: TextView
    var validMobileNumber = "9595688020"
    var validPassword = arrayListOf<String>("ironman","hulk","thanos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Login"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener{

            var mobileNumber = etMobileNumber.text.toString()
            var password = etPassword.text.toString()
            var nameOfAvenger = "Avenger"
            var intent = Intent(this@LoginActivity, Avengers_Activity::class.java)

            /*if (mobileNumber != validMobileNumber && !validPassword.contains(password)){

                Toast.makeText(this@LoginActivity, "Both Mobile Number and Password are incorrect.", Toast.LENGTH_SHORT).show()

            }*/

            if (mobileNumber == validMobileNumber){

                when(password){
                    validPassword[0] -> nameOfAvenger = "Iron man"
                    validPassword[1] -> nameOfAvenger = "The Hulk"
                    validPassword[2] -> nameOfAvenger = "The Avengers"
                    else -> Toast.makeText(this@LoginActivity, "Incorrect Password", Toast.LENGTH_SHORT).show()
                }
                if (validPassword.contains(password)){
                    intent.putExtra("Name", nameOfAvenger)
                    startActivity(intent)
                }


            }
            else {
                Toast.makeText(this@LoginActivity, "Incorrect Mobile Number", Toast.LENGTH_SHORT).show()
            }


        }


    }

    override fun onPause() {
        super.onPause()
        finish()
    }


}
