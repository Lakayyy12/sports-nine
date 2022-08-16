package com.application.footballsbettips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.application.footballsbettips.utils.Navigator


class FragmentAbout : Fragment(), View.OnClickListener {

    private var guideView: View? = null
    private var btn1 : Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        guideView = inflater.inflate(R.layout.fragment_about, container, false)
        initComponents()
        initListener()
        return guideView
    }

    private fun initComponents(){
        btn1 = guideView?.findViewById(R.id.btn1)
    }
    private fun initListener(){
        btn1?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn1 -> Navigator.replaceFragment(FragmentHome(), parentFragmentManager)
        }
    }


}
