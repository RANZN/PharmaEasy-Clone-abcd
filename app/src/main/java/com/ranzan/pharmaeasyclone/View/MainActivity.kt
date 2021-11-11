package com.ranzan.pharmaeasyclone.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.ranzan.pharmaeasyclone.R
import com.ranzan.pharmaeasyclone.View.Fragments.*
import com.ranzan.pharmaeasyclone.ViewModel.Repo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var repo: Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repo = Repo(MainActivity@ this)
//        repo.fetchApi()

        bottomNavigation.add(MeowBottomNavigation.Model(0, R.drawable.home))
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.healthcare))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.diagnosis))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_user))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.account))

        bottomNavigation.setOnShowListener {
            var fragment: Fragment? = null
            when (it.id) {
                0 -> fragment = HomeFragment()
                1 -> fragment = HealthCareFragment()
                2 -> fragment = LabTestsFragment()
                3 -> fragment = NotificationsFragmnet()
                4 -> fragment = AccountFragment()
            }
            supportFragmentManager.beginTransaction().replace(R.id.frameContainer, fragment!!)
                .commit()
        }

        bottomNavigation.show(0, true)
        bottomNavigation.setOnClickMenuListener {
            bottomNavigation.show(it.id, true)
        }
    }
}