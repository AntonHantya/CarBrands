package com.example.autobrands3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.view_pager)
        val fragments: ArrayList<Fragment> = arrayListOf(
            Page1Fragment(),
            Page2Fragment(),
            Page3Fragment(),
            AudiFragment(),
            BentleyFragment(),
            BugattiFragment(),
            CheryFragment(),
            ChevroletFragment(),
            CitroenFragment(),
            DaciaFragment(),
            DaewooFragment(),
            DodgeFragment(),
        )
        val adapter = ViewPagerAdapter(fragments,this)
        viewPager.adapter = adapter


    }

    fun btn1(view: View) {
        val myToast = Toast.makeText(this,"Acura",Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun btn2(view: View) {
        val myToast = Toast.makeText(this,"Alfa Romeo",Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun btn3(view: View) {
        val myToast = Toast.makeText(this,"Aston Martin",Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun btn_audi(view: View) {
        val myToast = Toast.makeText(this,"Audi",Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun btn_bentley(view: View) {
        val myToast = Toast.makeText(this,"Bentley",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_bugatti(view: View) {
        val myToast = Toast.makeText(this,"Bugatti",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_chery(view: View) {
        val myToast = Toast.makeText(this,"Chery",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_chevrolet(view: View) {
        val myToast = Toast.makeText(this,"Chevrolet",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_citroen(view: View) {
        val myToast = Toast.makeText(this,"Citroen",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_dacia(view: View) {
        val myToast = Toast.makeText(this,"Dacia",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_daewoo(view: View) {
        val myToast = Toast.makeText(this,"Daewoo",Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun btn_dodge(view: View) {
        val myToast = Toast.makeText(this,"Dodge",Toast.LENGTH_SHORT)
        myToast.show()
    }


}