package fr.supinternet.androidtv.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.ListRowPresenter
import fr.supinternet.androidtv.BrowseSupportFragment
import fr.supinternet.androidtv.R

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        supportFragmentManager
            .beginTransaction()
            .replace(android.R.id.content, BrowseSupportFragment())
            .commitAllowingStateLoss()
    }
}