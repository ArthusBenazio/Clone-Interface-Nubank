package com.arthusbenazio.cloneinterfacenubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arthusbenazio.cloneinterfacenubank.databinding.PaymentItemBinding
import com.arthusbenazio.cloneinterfacenubank.model.Pagamento

class AdapterPagamento(
    private val context: Context,
    private val listaPagamento: MutableList<Pagamento>
) :
    RecyclerView.Adapter<AdapterPagamento.PagamentoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
        val itemLista = PaymentItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return PagamentoViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
        holder.iconPagamento.setBackgroundResource(listaPagamento[position].icon!!)
        holder.txtTituloPagamento.text = listaPagamento[position].titulo
    }

    override fun getItemCount() = listaPagamento.size

    inner class PagamentoViewHolder(binding: PaymentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val iconPagamento = binding.icPagamento
        val txtTituloPagamento = binding.txtTituloPagamento
    }


}