package id.order.kosan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAda(var context: Context, var data: ArrayList<Data>) :
    RecyclerView.Adapter<RecyclerAda.Rec>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Rec {
        val view = LayoutInflater.from(context).inflate(R.layout.kost_custom_1, parent, false)
        return Rec(view)
    }

    override fun onBindViewHolder(holder: Rec, i: Int) {
        val d = data[i]
        holder.foto_ksoan.setImageResource(d.images)
        holder.title.text = d.title
        holder.alamat.text = d.alamat
        holder.harga.text = "Rp " + d.harga + "/bulan"
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class Rec(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foto_ksoan: ImageView
        var title: TextView
        var alamat: TextView
        var harga: TextView

        init {
            foto_ksoan = itemView.findViewById(R.id.foto_kosan)
            title = itemView.findViewById(R.id.nama_kosan)
            alamat = itemView.findViewById(R.id.alamat_kosan)
            harga = itemView.findViewById(R.id.harga_kosan)
        }
    }
}