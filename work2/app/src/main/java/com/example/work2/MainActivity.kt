package com.example.work2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editname: EditText = findViewById(R.id.User)
        var editpass: EditText = findViewById(R.id.Password)
        var editcpass: EditText = findViewById(R.id.Password2)
        var ok: Button = findViewById(R.id.button1)
        var clear: Button = findViewById(R.id.button2)

        clear.setOnClickListener() {
            editname.setText("")
            editpass.setText("")
            editcpass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editname.text.toString()
            var password = editpass.text.toString()
            var password2 = editcpass.text.toString()
            if(user == "" || password == "" || password2 == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user ==  password && user == password2) {
            Toast.makeText(applicationContext, "อย่ากรอกUsernameตรงกับPassword", Toast.LENGTH_LONG).show()
        }
        else if(password != password2){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
        }
        }


    }
}