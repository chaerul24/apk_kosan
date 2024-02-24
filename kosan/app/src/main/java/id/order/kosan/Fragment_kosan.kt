package id.order.kosan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment_kosan : Fragment() {
    private var recy: RecyclerView? = null
    private var data: ArrayList<Data>? = null
    private var adapter: RecyAdapter? = null
    private var kos_campur: RelativeLayout? = null
    private var kos_laki: RelativeLayout? = null
    private var kos_perempuan: RelativeLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.kosan, container, false)
        recy = view.findViewById<View>(R.id.recy) as RecyclerView
        val gridLayoutManager = LinearLayoutManager(context)
        recy!!.layoutManager = gridLayoutManager
        data = ArrayList()
        data!!.add(Data(1, R.raw.kosan_1, 10000))
        data!!.add(Data(2, R.raw.kosan_1, 15000))
        adapter = context?.let { RecyAdapter(it, data!!) }
        recy!!.adapter = adapter
        kos_campur = view.findViewById<View>(R.id.kosan_campuran) as RelativeLayout
        kos_campur!!.setOnClickListener {
            val intent = Intent(context, KosanActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            intent.putExtra("title", "Kost Campuran")
            context?.startActivity(intent)
        }
        kos_laki = view.findViewById<View>(R.id.kos_laki) as RelativeLayout
        kos_laki!!.setOnClickListener {
            val intent = Intent(context, KosanActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            intent.putExtra("title", "Kost Laki Laki")
            context?.startActivity(intent)
        }
        kos_perempuan = view.findViewById<View>(R.id.kos_perempuan) as RelativeLayout
        kos_perempuan!!.setOnClickListener {
            val intent = Intent(context, KosanActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            intent.putExtra("title", "Kost Perempuan")
            context?.startActivity(intent)
        }
        return view
    }
}