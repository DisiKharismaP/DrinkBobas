package disiiy.khaper.drinkbobas

import android.content.Intent.EXTRA_USER
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import disiiy.khaper.drinkbobas.databinding.ActivityDetailBinding
import disiiy.khaper.drinkbobas.model.Bobas

class DetailActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var bobas: Bobas

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        bobas = intent.getParcelableExtra<Bobas>(EXTRA_DATA) as Bobas
        showDetail()
    }

    private fun showDetail() {
        detailBinding.apply {
            Glide.with(this.root).load(bobas.imagePhoto).into(ivDetail)
            tvNameDetail.text = bobas.name
            tvDescriptionContent.text = bobas.description
            tvPriceDetail.text = bobas.price
        }
    }
}