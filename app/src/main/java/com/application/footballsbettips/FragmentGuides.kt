package com.application.footballsbettips

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.application.footballsbettips.utils.Navigator

class FragmentGuides : Fragment(), View.OnClickListener {

    private var gd01 : Button? = null
    private var gd02 : Button? = null
    private var gd03 : Button? = null
    private var gd04 : Button? = null
    private var gd05 : Button? = null

    private var oks: Button? = null
    private var guideView: View? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        guideView = inflater.inflate(R.layout.fragment_guides, container, false)
        initComponents()
        initListeners()
        return guideView
    }

    private fun initComponents() {
        oks = guideView?.findViewById(R.id.oks)
        gd01 = guideView?.findViewById(R.id.gd01)
        gd02 = guideView?.findViewById(R.id.gd02)
        gd03 = guideView?.findViewById(R.id.gd03)
        gd04 = guideView?.findViewById(R.id.gd04)
        gd05 = guideView?.findViewById(R.id.gd05)
    }

    private fun initListeners(){
        oks?.setOnClickListener(this)
        gd01?.setOnClickListener(this)
        gd02?.setOnClickListener(this)
        gd03?.setOnClickListener(this)
        gd04?.setOnClickListener(this)
        gd05?.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.gd01 -> Navigator.showContent(context, getString(R.string.gd01))
            R.id.gd02 -> Navigator.showContent(context, getString(R.string.gd02))
            R.id.gd03 -> Navigator.showContent(context, getString(R.string.gd03))
            R.id.gd04 -> Navigator.showContent(context, getString(R.string.gd04))
            R.id.gd05 -> Navigator.showContent(context, getString(R.string.gd05))

            R.id.oks -> Navigator.replaceFragment(FragmentHome(), parentFragmentManager)
        }
    }

}