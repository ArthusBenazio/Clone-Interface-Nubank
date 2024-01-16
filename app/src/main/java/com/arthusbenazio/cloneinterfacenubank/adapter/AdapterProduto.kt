package com.arthusbenazio.cloneinterfacenubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arthusbenazio.cloneinterfacenubank.databinding.ProdutoItemBinding
import com.arthusbenazio.cloneinterfacenubank.model.Produto

class AdapterProduto(private val context: Context, private val listaProdutos: MutableList<Produto>):
    RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProdutoViewHolder(itemLista)
    }

    override fun getItemCount() = listaProdutos.size

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.txtInformation.text = listaProdutos[position].text
    }

    inner class ProdutoViewHolder(binding: ProdutoItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtInformation = binding.txtInformation
    }
}