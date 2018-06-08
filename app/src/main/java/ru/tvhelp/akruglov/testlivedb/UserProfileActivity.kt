package ru.tvhelp.akruglov.testlivedb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.tvhelp.akruglov.testlivedb.ui.userprofile.UserProfileFragment

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, UserProfileFragment.newInstance())
                    .commitNow()
        }
    }

}
