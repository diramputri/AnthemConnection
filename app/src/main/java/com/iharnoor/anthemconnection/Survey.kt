package com.iharnoor.anthemconnection

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_survey.*

class Survey : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey)
        selectedFace.visibility = View.INVISIBLE
        skipOrNextBtn.setBackgroundColor(Color.GRAY)



        closeBtn.setOnClickListener {
            finish()
        }
        agree.setOnClickListener {
            selectedFace.visibility = View.VISIBLE
            skipOrNextBtn.setBackgroundColor(Color.BLUE)
            selectedFace.setImageResource(R.drawable.slightly_smiling_face_emoji)
            skipOrNextBtn.setText("NEXT")
        }
        stronglyDisagree.setOnClickListener {
            selectedFace.visibility = View.VISIBLE
            skipOrNextBtn.setBackgroundColor(Color.BLUE)
            skipOrNextBtn.setText("NEXT")
            selectedFace.setImageResource(R.drawable.very_sad_emoji_icon_png)
        }
        stronglyAgree.setOnClickListener {
            skipOrNextBtn.setBackgroundColor(Color.BLUE)
            skipOrNextBtn.setText("NEXT")
            selectedFace.visibility = View.VISIBLE
            selectedFace.setImageResource(R.drawable.smiling_emoji_with_eyes_opened)
        }
        neutralFace.setOnClickListener {
            skipOrNextBtn.setBackgroundColor(Color.BLUE)
            skipOrNextBtn.setText("NEXT")
            selectedFace.visibility = View.VISIBLE
            selectedFace.setImageResource(R.drawable.neutral_face_emoji)
        }
        disagree.setOnClickListener {
            skipOrNextBtn.setBackgroundColor(Color.BLUE)
            skipOrNextBtn.setText("NEXT")
            selectedFace.visibility = View.VISIBLE
            selectedFace.setImageResource(R.drawable.confused_face_emoji)
        }
        selectedFace.setOnClickListener {
            selectedFace.visibility = View.INVISIBLE
            skipOrNextBtn.setBackgroundColor(Color.GRAY)
            skipOrNextBtn.setText("SKIP")
        }
    }
}
