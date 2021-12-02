package disiiy.khaper.drinkbobas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import disiiy.khaper.drinkbobas.databinding.ActivityAboutBinding
import disiiy.khaper.drinkbobas.databinding.ActivityMainBinding

class AboutActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var aboutBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        aboutBinding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(aboutBinding.root)

        aboutBinding.btnAbout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnAbout -> startActivity(MainActivity.getLaunchService(this))
        }
    }
}