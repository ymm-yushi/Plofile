package app.keino.yushi.plofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import app.keino.yushi.plofile.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prophileImage.isVisible = false
        textView.isVisible = false

        button1 .setOnClickListener(){
            prophileImage.isVisible = true
            textView.isVisible = true
        }



    }
}