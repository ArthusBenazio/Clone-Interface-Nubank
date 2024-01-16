package com.arthusbenazio.cloneinterfacenubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.arthusbenazio.cloneinterfacenubank.adapter.AdapterPagamento
import com.arthusbenazio.cloneinterfacenubank.adapter.AdapterProduto
import com.arthusbenazio.cloneinterfacenubank.databinding.ActivityMainBinding
import com.arthusbenazio.cloneinterfacenubank.model.Pagamento
import com.arthusbenazio.cloneinterfacenubank.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private lateinit var adapterProduto: AdapterProduto
    private var listaPagamento: MutableList<Pagamento> = mutableListOf()
    private var listaProduto: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        val recyclerIconPagamento = binding.recyclerIconPagamento
        recyclerIconPagamento.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerIconPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIconPagamento.adapter = adapterPagamento
        listaIconPagamento()

        val recyclerProdutos = binding.recyclerProdutos
        recyclerProdutos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerProdutos.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProdutos.adapter = adapterProduto
        listaTextInformation()
    }

    private fun listaIconPagamento() {
        val icon1 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icon1)

        val icon2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icon2)

        val icon3 = Pagamento(R.drawable.emprestimo, "Pegar \nEmprestado")
        listaPagamento.add(icon3)

        val icon4 = Pagamento(R.drawable.transferencia, "Transferir")
        listaPagamento.add(icon4)

        val icon5 = Pagamento(R.drawable.depositar, "Depositar")
        listaPagamento.add(icon5)

        val icon6 = Pagamento(R.drawable.ic_recarga_celular, "Recarga \nde Celular")
        listaPagamento.add(icon6)

        val icon7 = Pagamento(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icon7)

        val icon8 = Pagamento(R.drawable.doacao, "Doação")
        listaPagamento.add(icon8)
    }

    private fun listaTextInformation() {
        val textInformation1 = Produto("Participe da Promoção Tudo no Roxinho e concorra a ...")
        listaProduto.add(textInformation1)

        val textInformation2 = Produto("Chegou o débito automático da fatura do cartão")
        listaProduto.add(textInformation2)

        val textInformation3 = Produto("Conheça a conta PJ: prática e livre de burocracia para se...")
        listaProduto.add(textInformation3)

        val textInformation4 = Produto("Salve seus amigos da burocracia: Faça um convite...")
        listaProduto.add(textInformation4)
    }
}