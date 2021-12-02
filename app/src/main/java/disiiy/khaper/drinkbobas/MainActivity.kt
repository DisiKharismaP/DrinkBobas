package disiiy.khaper.drinkbobas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import disiiy.khaper.drinkbobas.adapter.BobasAdapter
import disiiy.khaper.drinkbobas.data.DataBobas
import disiiy.khaper.drinkbobas.databinding.ActivityMainBinding
import disiiy.khaper.drinkbobas.model.Bobas

class MainActivity : AppCompatActivity() {
    companion object{
        fun getLaunchService(from : Context)= Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        }
    }

    private lateinit var mainBinding: ActivityMainBinding
    private var list: ArrayList<Bobas> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.apply {
            rvMain.setHasFixedSize(true)
            list.addAll(DataBobas.listBobas)
            addRecyclerView()
        }
    }

    private fun addRecyclerView() {
        val bobasAdapter = BobasAdapter(list)
        mainBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mainBinding.rvMain.adapter = bobasAdapter

        bobasAdapter.setOnClickCallback(object : BobasAdapter.OnItemClickCallBack{
            override fun onItemClicked(bobas: Bobas) {
                setSelectedItem(bobas)
            }

        })
    }

    private fun setSelectedItem(bobas: Bobas) {
        val intentDetail = Intent(this@MainActivity, DetailActivity::class.java)
        intentDetail.putExtra(DetailActivity.EXTRA_DATA, bobas)
        startActivity(intentDetail)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setAction(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setAction(itemId: Int) {
        when (itemId) {
            R.id.action_about -> {
                intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}