package id.order.kosan

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class  MainActivity : AppCompatActivity() {
    private var bottomNavi: BottomNavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavi = findViewById<View>(R.id.bottomNavi) as BottomNavigationView
        bottomNavi!!.setOnNavigationItemSelectedListener(object :
            BottomNavigationView.OnNavigationItemSelectedListener {
            private var fg: Fragment? = null
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                println("ID bottomnavi => " + item.itemId)
                fg = Fragment()
                when (item.itemId) {
                    R.id.menu_home -> {}
                    R.id.menu_kost -> fg = Fragment_kosan()
                    R.id.menu_kendaraan -> {}
                    R.id.menu_profile -> {}
                }
                supportFragmentManager.beginTransaction().replace(R.id.framelayout_view, fg!!)
                    .commit()
                return true
            }
        })
    }
}