package com.example.zeddit.Post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zeddit.R

/**
 * A simple [Fragment] subclass for opening up a detailed post.
 */
class DetailPostFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_detail_post, container, false)
    }


}
