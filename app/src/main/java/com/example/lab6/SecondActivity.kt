package com.example.lab6

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.lab6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_second_activity)

       val textViewData: TextView = findViewById(R.id.textView_display_text)

        //Default values
        var user = "ЖЫвотное"
        var gift = "дырку от бублика"
        var sender: String


        /*user = intent.extras?.getString("username").toString()
        gift = intent.extras?.getString("gift").toString();*/

        user = intent.getStringExtra("username").toString();
        gift = intent.getStringExtra("gift").toString();
        sender = intent.getStringExtra("sender").toString();





        textViewData.text = "$user , you were given $gift , from $sender"
    }
}