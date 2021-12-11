package com.example.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    //views and questions
    lateinit var textView: TextView
    lateinit var question1: TextView
    lateinit var question2: TextView
    lateinit var question3: TextView
    lateinit var question4: TextView
    lateinit var question5: TextView
    lateinit var question6: TextView
    lateinit var question7: TextView
    lateinit var question8: TextView
    lateinit var question9: TextView
    lateinit var question10: TextView

    //images
//    lateinit var image1: ImageView
//    lateinit var image2: ImageView
//    lateinit var image3: ImageView
//    lateinit var image4: ImageView
//    lateinit var image5: ImageView
//    lateinit var image6: ImageView
//    lateinit var image7: ImageView
//    lateinit var image8: ImageView
//    lateinit var image9: ImageView
//    lateinit var image10: ImageView
//
//    var imageId1: Int? = null
//    var imageId2: Int? = null
//    var imageId3: Int? = null
//    var imageId4: Int? = null
//    var imageId5: Int? = null
//    var imageId6: Int? = null
//    var imageId7: Int? = null
//    var imageId8: Int? = null
//    var imageId9: Int? = null
//    var imageId10: Int? = null


    //radio Groups for answers
    lateinit var radioGroup1: RadioGroup
    lateinit var radioGroup2: RadioGroup
    lateinit var radioGroup3: RadioGroup
    lateinit var radioGroup4: RadioGroup
    lateinit var radioGroup5: RadioGroup
    lateinit var radioGroup6: RadioGroup
    lateinit var radioGroup7: RadioGroup
    lateinit var radioGroup8: RadioGroup
    lateinit var radioGroup9: RadioGroup
    lateinit var radioGroup10: RadioGroup

    // correct answers
    private var correct1 : CharSequence = "Red"
    private var correct2 : CharSequence = "A Horse"
    private var correct3 : CharSequence = "Wood Stock"
    private var correct4 : CharSequence = "Cuba"
    private var correct5 : CharSequence = "Rice"
    private var correct6 : CharSequence = "Georgia"
    private var correct7 : CharSequence = "Apple Sauce"
    private var correct8 : CharSequence = "The Vikings"
    private var correct9 : CharSequence = "Mr.Potato Head"
    private var correct10 : CharSequence = "300+"

    //radioGroup for answers
    var radioGroup1ID = -1
    var radioGroup2ID = -1
    var radioGroup3ID = -1
    var radioGroup4ID = -1
    var radioGroup5ID = -1
    var radioGroup6ID = -1
    var radioGroup7ID = -1
    var radioGroup8ID = -1
    var radioGroup9ID = -1
    var radioGroup10ID = -1

    lateinit var layoutRoot : ConstraintLayout


    //var answer : CharSequence = ""
    //var correct
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //answer areas radio group
        radioGroup1 = findViewById(R.id.radioGroup1)
        radioGroup2 = findViewById(R.id.radioGroup2)
        radioGroup3 = findViewById(R.id.radioGroup3)
        radioGroup4 = findViewById(R.id.radioGroup4)
        radioGroup5 = findViewById(R.id.radioGroup5)
        radioGroup6 = findViewById(R.id.radioGroup6)
        radioGroup7 = findViewById(R.id.radioGroup7)
        radioGroup8 = findViewById(R.id.radioGroup8)
        radioGroup9 = findViewById(R.id.radioGroup9)
        radioGroup10 = findViewById(R.id.radioGroup10)


        // views and questions
        textView = findViewById(R.id.textView)
        question1 = findViewById(R.id.question1)
        question2 = findViewById(R.id.question2)
        question3 = findViewById(R.id.question3)
        question4 = findViewById(R.id.question4)
        question5 = findViewById(R.id.question5)
        question6 = findViewById(R.id.question6)
        question7 = findViewById(R.id.question7)
        question8 = findViewById(R.id.question8)
        question9 = findViewById(R.id.question9)
        question10 = findViewById(R.id.question10)

        //Images
        val image1 = findViewById<ImageView>(R.id.image1)
        val image2 = findViewById<ImageView>(R.id.image2)
        val image3 = findViewById<ImageView>(R.id.image3)
        val image4 = findViewById<ImageView>(R.id.image4)
        val image5 = findViewById<ImageView>(R.id.image5)
        val image6 = findViewById<ImageView>(R.id.image6)
        val image7 = findViewById<ImageView>(R.id.image7)
        val image8 = findViewById<ImageView>(R.id.image8)
        val image9 = findViewById<ImageView>(R.id.image9)
        val image10 = findViewById<ImageView>(R.id.image10)

        image1.setImageResource(R.drawable.thematrix)
        image2.setImageResource(R.drawable.thegodfather)
        image3.setImageResource(R.drawable.woodstock)
        image4.setImageResource(R.drawable.havana)
        image5.setImageResource(R.drawable.sake)
        image6.setImageResource(R.drawable.coke)
        image7.setImageResource(R.drawable.space)
        image8.setImageResource(R.drawable.globe)
        image9.setImageResource(R.drawable.toys)
        image10.setImageResource(R.drawable.pasta)

        layoutRoot = findViewById(R.id.root_layout)




    }


    fun compareRadioGroup1(view: View) {
        var answer1: CharSequence = ""
        var answer2: CharSequence = ""
        var answer3: CharSequence = ""
        var answer4: CharSequence = ""
        var answer5: CharSequence = ""
        var answer6: CharSequence = ""
        var answer7: CharSequence = ""
        var answer8: CharSequence = ""
        var answer9: CharSequence = ""
        var answer10: CharSequence = ""

        //question 1
        radioGroup1ID = radioGroup1.checkedRadioButtonId
        //textView.text = "$answer"
        var point: Int = 0
        if (radioGroup1ID == -1) {

            //textView.text = "No Answer Chosen"
            val question1Snackbar =
                Snackbar.make(layoutRoot, "Answer question 1", Snackbar.LENGTH_SHORT)
            question1Snackbar.show()
        } else {
            answer1 = findViewById<RadioButton>(radioGroup1ID).text
            //textView.text = " $answer"
            if (answer1 == correct1) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 2

        radioGroup2ID = radioGroup2.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup2ID == -1) {

            //textView.text = "No Answer Chosen"
            val question2Snackbar =
                Snackbar.make(layoutRoot, "Answer question 2", Snackbar.LENGTH_SHORT)
            question2Snackbar.show()
        } else {
            answer2 = findViewById<RadioButton>(radioGroup2ID).text
            //textView.text = " $answer"
            if (answer2 == correct2) {
                point = point + 1
                textView.text = "$point"
            }

        }


        //question 3

        radioGroup3ID = radioGroup3.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup3ID == -1) {

            //textView.text = "No Answer Chosen"
            val question3Snackbar =
                Snackbar.make(layoutRoot, "Answer question 3", Snackbar.LENGTH_SHORT)
            question3Snackbar.show()
        } else {
            answer3 = findViewById<RadioButton>(radioGroup3ID).text
            //textView.text = " $answer"
            if (answer3 == correct3) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 4

        radioGroup4ID = radioGroup4.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup4ID == -1) {

            //textView.text = "No Answer Chosen"
            val question4Snackbar =
                Snackbar.make(layoutRoot, "Answer question 4", Snackbar.LENGTH_SHORT)
            question4Snackbar.show()
        } else {
            answer4 = findViewById<RadioButton>(radioGroup4ID).text
            //textView.text = " $answer"
            if (answer4 == correct4) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 5

        radioGroup5ID = radioGroup5.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup5ID == -1) {

            //textView.text = "No Answer Chosen"
            val question5Snackbar =
                Snackbar.make(layoutRoot, "Answer question 5", Snackbar.LENGTH_SHORT)
            question5Snackbar.show()
        } else {
            answer5 = findViewById<RadioButton>(radioGroup5ID).text
            //textView.text = " $answer"
            if (answer5 == correct5) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 6

        radioGroup6ID = radioGroup6.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup6ID == -1) {

            //textView.text = "No Answer Chosen"
            val question6Snackbar =
                Snackbar.make(layoutRoot, "Answer question 6", Snackbar.LENGTH_SHORT)
            question6Snackbar.show()
        } else {
            answer6 = findViewById<RadioButton>(radioGroup6ID).text
            //textView.text = " $answer"
            if (answer6 == correct6) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 7

        radioGroup7ID = radioGroup7.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup7ID == -1) {

            //textView.text = "No Answer Chosen"
            val question7Snackbar =
                Snackbar.make(layoutRoot, "Answer question 7", Snackbar.LENGTH_SHORT)
            question7Snackbar.show()
        } else {
            answer7 = findViewById<RadioButton>(radioGroup7ID).text
            //textView.text = " $answer"
            if (answer7 == correct7) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 8

        radioGroup8ID = radioGroup8.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup8ID == -1) {

            //textView.text = "No Answer Chosen"
            val question8Snackbar =
                Snackbar.make(layoutRoot, "Answer question 8", Snackbar.LENGTH_SHORT)
            question8Snackbar.show()
        } else {
            answer8 = findViewById<RadioButton>(radioGroup8ID).text
            //textView.text = " $answer"
            if (answer8 == correct8) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 9

        radioGroup9ID = radioGroup9.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup9ID == -1) {

            //textView.text = "No Answer Chosen"
            val question9Snackbar =
                Snackbar.make(layoutRoot, "Answer question 9", Snackbar.LENGTH_SHORT)
            question9Snackbar.show()
        } else {
            answer9 = findViewById<RadioButton>(radioGroup9ID).text
            //textView.text = " $answer"
            if (answer9 == correct9) {
                point = point + 1
                textView.text = "$point"
            }

        }

        //question 10

        radioGroup10ID = radioGroup10.checkedRadioButtonId
        //textView.text = "$answer"
        //var point: Int = 0
        if (radioGroup10ID == -1) {

            //textView.text = "No Answer Chosen"
            val question10Snackbar =
                Snackbar.make(layoutRoot, "Answer question 10", Snackbar.LENGTH_SHORT)
            question10Snackbar.show()
        } else {
            answer10 = findViewById<RadioButton>(radioGroup10ID).text
            //textView.text = " $answer"
            if (answer10 == correct10) {
                point = point + 1
            }

        }

        if (point <= 1) {
            point = point * 100
            textView.text = "You can do better than that! you scored $point!"
        }
        if (point <= 5 && point > 1) {
            point = point * 200
            textView.text = "Not to shaby, you scored $point"
        }
        if (point <= 8 && point > 5) {
            point = point * 250
            textView.text = "Good job! you scored $point"
        } else {
            point = point * 350
            textView.text = "Woah we got a big brain over here, you scored $point"
        }
    }
}
