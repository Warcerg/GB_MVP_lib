package com.example.gb_mvp_lib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.gb_mvp_lib.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener{presenter.counterClickOne()}
        vb?.btnCounter2?.setOnClickListener{presenter.counterClickTwo()}
        vb?.btnCounter3?.setOnClickListener{presenter.counterClickThree()}

    }

    override fun setCounter1(text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setCounter2(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setCounter3(text: String) {
        vb?.btnCounter3?.text = text
    }
}