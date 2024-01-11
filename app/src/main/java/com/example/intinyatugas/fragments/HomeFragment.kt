package com.example.intinyatugas.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.intinyatugas.tablayout_cashinout
import com.example.intinyatugas.Customlistview
import com.example.intinyatugas.R
import com.example.intinyatugas.Saldo
import com.example.intinyatugas.Slidetoact
import com.ncorti.slidetoact.SlideToActView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val btn_saldo = view.findViewById<Button>(R.id.btnsaldo)

        btn_saldo.setOnClickListener{
            val intent = Intent(context, Saldo::class.java)
            startActivity(intent)
        }
        val btn_fav= view.findViewById<Button>(R.id.btnTransactionHistory)

        btn_fav.setOnClickListener{
            val intent = Intent(context, Customlistview::class.java)
            startActivity(intent)
        }
        val btn_logout= view.findViewById<Button>(R.id.btnLogout)

        btn_logout.setOnClickListener{
            val intent = Intent(context, Slidetoact::class.java)
            startActivity(intent)
        }

        val btn_transfer= view.findViewById<Button>(R.id.btnTransferMoney)

        btn_transfer.setOnClickListener{
            val intent = Intent(context, tablayout_cashinout::class.java)
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return view
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}