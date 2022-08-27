package com.example.smwuh_team17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_buy.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.aciton_buy ->{
                var buyFragment = BuyFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,buyFragment).commit()
            }
            R.id.action_sell ->{
                var sellFragment = SellFragmant()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,sellFragment).commit()
            }
            R.id.action_chat ->{
                var chatFragment = ChatFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,chatFragment).commit()
            }
            R.id.action_mypage ->{
                var mypageFragment = MypageFragment()
                supportFragmentManager.beginTransaction().replace(R.id.main_content,mypageFragment).commit()
            }
        }
        return false
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation.setOnNavigationItemSelectedListener(this)
    }
}