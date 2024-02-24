package id.order.kosan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyAdapter(var context: Context, var data: ArrayList<Data>) :
    RecyclerView.Adapter<RecyAdapter.Rec>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Rec {
        val view = LayoutInflater.from(context).inflate(R.layout.kosancustom, parent, false)
        return Rec(view)
    }

    override fun onBindViewHolder(holder: Rec, i: Int) {
        val d = data[i]
        holder.foto_ksoan.setImageResource(d.images)
        holder.total_like.text = d.totalLike.toString() + ""
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class Rec(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foto_ksoan: ImageView
        var add_like: ImageView
        var total_like: TextView

        init {
            foto_ksoan = itemView.findViewById(R.id.foto_kosan)
            add_like = itemView.findViewById(R.id.icon_like)
            total_like = itemView.findViewById(R.id.jumlah_like)
        }
    }
}