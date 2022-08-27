package com.example.smwuh_team17

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_buy.*

class BuyFragment : Fragment() {

    lateinit var recyclerItemAdapter: RecyclerItemAdapter
    val datas = mutableListOf<UserData>()
    lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)

        // 2. Context를 액티비티로 형변환해서 할당
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(activity).inflate(R.layout.activity_buy,container, false)
        return view
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initRecycler()
    }

    private fun initRecycler() {
        recyclerItemAdapter = RecyclerItemAdapter(mainActivity)
        product_list.adapter = recyclerItemAdapter

        datas.apply {
            add(UserData(img = R.drawable.buy, name = "mary", detail = "mary"))
            add(UserData(img = R.drawable.chat, name = "jenny", detail = "mary"))
            add(UserData(img = R.drawable.mypage, name = "jhon", detail = "mary"))
            add(UserData(img = R.drawable.sell, name = "ruby", detail = "mary"))
            add(UserData(img = R.drawable.product, name = "yuna", detail = "mary"))

            recyclerItemAdapter.datas = datas
            recyclerItemAdapter.notifyDataSetChanged()

        }
    }
}