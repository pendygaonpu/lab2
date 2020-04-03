package com.example.lab2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main1.*
import java.lang.Exception


class Main1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        //button click to get input and call sendEmail method
        sendEmailBtn.setOnClickListener {
            //get input from EditTexts and save in variables
            val recipient = recipientEt.text.toString().trim()
            val subject = subjectEt.text.toString().trim()
            val message = messageEt.text.toString().trim()

            //method call for email intent with these inputs as parameters
            sendEmail(recipient, subject, message)
        }
    }
        private fun sendEmail(recipient: String, subject: String, message: String){

        val mIntent = Intent(Intent.ACTION_SEND)
            mIntent.data = Uri.parse("mailto:")
            mIntent.type = "text/plain"
            //put recipient email in intent
            mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
            //put the Subject in the intent
            mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
            //put the message in the intent
            mIntent.putExtra(Intent.EXTRA_TEXT, message)


            try {
                //start email intent
                startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
            }
            catch (e:Exception){
                //if any thing goes wrong for example no email client applicatuin or any exception
                // get and show exceptioin message
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }

}
