package com.example.programminglanguages

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val list : MutableList<OurData>,val activity: Activity,
                var backup : MutableList<OurData>) : RecyclerView.Adapter<MyAdapter.Viewholder>(), Filterable{
    inner class Viewholder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName : TextView = itemView.findViewById(R.id.txt1)
        val textDes : TextView = itemView.findViewById(R.id.txt2)
        val ImageShow : ImageView = itemView.findViewById(R.id.imgView)







    }
    interface onItemClickListener {
        fun onClicked(url : String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.single_row,parent,false)
       return Viewholder(v)


    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.textName.setText(list[position].LangaugeName)
        holder.ImageShow.setImageResource(list[position].image_flag)

        holder.itemView.setOnClickListener(){
            val item = list[position]
            val i = Intent(activity,MainActivity2::class.java)
            i.putExtra("name",item.LangaugeName)
            i.putExtra("desc",item.Description)
            i.putExtra("img",item.image_flag)
            i.putExtra("link",item.link)
            activity.startActivity(i)
        }
    }

    override fun getFilter(): Filter {
        return object : Filter(){
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                var filterdata : ArrayList<OurData> = ArrayList()
                if (constraint.toString().isEmpty()){
                    filterdata.addAll(backup)
                }
                else{
                    for (obj : OurData in backup){
                        if (obj.LangaugeName.toString().toLowerCase().contains(constraint.toString().toLowerCase())){
                            filterdata.add(obj)
                        }
                    }
                }
                val result : FilterResults = FilterResults()
                result.values = filterdata
                return result
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                list.clear()
                if (results != null) {
                    list.addAll(results.values as Collection<OurData>)
                }
                notifyDataSetChanged()
            }

        }
    }

}
