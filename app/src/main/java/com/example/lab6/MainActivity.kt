package com.example.lab6

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        val buttonForSecondActivity: Button = findViewById(R.id.button2)

        val buttonTransfer: Button = findViewById(R.id.button_transfer)

        val edit_address: EditText = findViewById(R.id.editTextText_name)
        val edit_gift: EditText = findViewById(R.id.editTextText_description)
        val edit_sender: EditText= findViewById(R.id.editTextText_sender)




        button.setOnClickListener{
            val intent = Intent(this@MainActivity, ActivityAbout::class.java)
            startActivity(intent)
        }

        buttonForSecondActivity.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        buttonTransfer.setOnClickListener{
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            intent.putExtra("username", edit_address.text.toString());
            intent.putExtra("gift", edit_gift.text.toString());
            intent.putExtra("sender", edit_sender.text.toString());

            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}