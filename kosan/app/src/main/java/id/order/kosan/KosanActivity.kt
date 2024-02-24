package id.order.kosan

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KosanActivity : AppCompatActivity() {
    private var back: ImageView? = null
    private var title: TextView? = null
    private var recy: RecyclerView? = null
    private var data: ArrayList<Data>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kos2)
        data = ArrayList()
        back = findViewById<View>(R.id.back) as ImageView
        back!!.setOnClickListener { finish() }
        title = findViewById<View>(R.id.kosan_title) as TextView
        val bundle = intent.extras
        if (bundle != null) {
            val t = bundle.getString("title", "")
            title!!.text = t
            if (t == "Kost Campuran") {
                data!!.add(
                    Data(
                        1,
                        R.raw.kosan_1,
                        "Kos Bintang",
                        "550000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        2,
                        R.raw.kosan_1,
                        "Adrian Kos",
                        "650000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        3,
                        R.raw.kosan_1,
                        "Kos Roro Tari",
                        "700000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        4,
                        R.raw.kosan_1,
                        "Kos Putri Bu Isna",
                        "450000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
            }
            if (t == "Kost Laki Laki") {
                data!!.add(
                    Data(
                        1,
                        R.raw.kosan_1,
                        "Kos Bintang",
                        "550000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        2,
                        R.raw.kosan_1,
                        "Adrian Kos",
                        "650000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        3,
                        R.raw.kosan_1,
                        "Kos Roro Tari",
                        "700000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        4,
                        R.raw.kosan_1,
                        "Kos Putri Bu Isna",
                        "450000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
            }
            if (t == "Kost Perempuan") {
                data!!.add(
                    Data(
                        1,
                        R.raw.kosan_1,
                        "Kos Bintang",
                        "550000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        2,
                        R.raw.kosan_1,
                        "Adrian Kos",
                        "650000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        3,
                        R.raw.kosan_1,
                        "Kos Roro Tari",
                        "700000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
                data!!.add(
                    Data(
                        4,
                        R.raw.kosan_1,
                        "Kos Putri Bu Isna",
                        "450000",
                        "Jl.Maju Bersama rt/rw 06/08"
                    )
                )
            }
        }
        recy = findViewById<View>(R.id.recy) as RecyclerView
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        recy!!.layoutManager = linearLayoutManager
        val adapter = RecyclerAda(this, data!!)
        recy!!.adapter = adapter
    }
}