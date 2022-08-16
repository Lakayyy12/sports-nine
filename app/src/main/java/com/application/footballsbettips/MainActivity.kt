package com.application.footballsbettips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    var nav: NavigationView? = null
    var toggle: ActionBarDrawerToggle? = null
    var drawerlayout: DrawerLayout? = null
    var title: String? = null

    private var exit = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        nav = findViewById<View>(R.id.navmenu) as NavigationView
        drawerlayout = findViewById<View>(R.id.drawer) as DrawerLayout

        toggle = ActionBarDrawerToggle(this, drawerlayout, toolbar, R.string.open, R.string.close)
        drawerlayout?.addDrawerListener(toggle!!)
        toggle!!.syncState()
        replaceFragment(FragmentHome(), "HOME")
    }

    private fun initListeners(){
        nav?.setNavigationItemSelectedListener {
            it.isChecked = true
            when (it.itemId) {
                R.id.menu_home -> replaceFragment(FragmentHome(), it.title.toString())
                R.id.menu_rules -> replaceFragment(FragmentRules(), it.title.toString())
                R.id.menu_guide -> replaceFragment(FragmentGuides(), it.title.toString())
                R.id.menu_about -> replaceFragment(FragmentAbout(), it.title.toString())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout,fragment)
        fragmentTransaction.commit()
        drawerlayout?.closeDrawers()
        setTitle(title)
    }

    private fun drawerClose(){
        drawerlayout?.closeDrawer(GravityCompat.START)
    }

    override fun onBackPressed() {
        if (exit==0){
            exit = 1
            Toast.makeText(this,"CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        }
        else{
            super.finishAffinity()
        }
    }
}