package disiiy.khaper.drinkbobas.data

import disiiy.khaper.drinkbobas.R
import disiiy.khaper.drinkbobas.model.Bobas

object DataBobas {
    private val bobaNames = arrayOf(
        "Brown Sugar",
        "Salted Caramel",
        "Milk Chocolate",
        "Biscuit Regal",
        "Red Velvet",
        "Matcha Oishi",
        "Milk Tea",
        "Choco Hazelnut",
        "Purple Taro",
        "Blue Oceana"
    )

    private val bobaPrices = arrayOf(
        "Rp23.000",
        "Rp27.000",
        "Rp30.000",
        "Rp30.000",
        "Rp30.000",
        "Rp23.000",
        "Rp23.000",
        "Rp27.000",
        "Rp27.000",
        "Rp35.000"
    )

    private val bobaDescriptions = arrayOf(
        "Brown Sugar Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang khas.",
        "Salted Caramel Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang manisnya pas.",
        "Milk Chocolate Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang sangat coklat.",
        "Biscuit Regal Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang cocok bagi pecinta regal.",
        "Red Velvet Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang unik.",
        "Matcha Oishi Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang oishiii.",
        "Milk Tea Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang semua orang suka.",
        "Choco Hazelnut Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang Sangat Gurih.",
        "Purple Taro Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang bikin nagih.",
        "Blue Oceana Boba adalah salah satu minuman dari menu boba kami yang terfavorit, karena rasanya yang menyentuh jiwa raga.",
    )

    private val bobaImages = arrayOf(
        R.drawable.brown_sugar,
        R.drawable.salted_caramel,
        R.drawable.milk_chocolate,
        R.drawable.biscuit_regal,
        R.drawable.red_velvet,
        R.drawable.matcha_oishi,
        R.drawable.milk_tea,
        R.drawable.choco_hazelnut,
        R.drawable.purple_taro,
        R.drawable.blue_oceana
    )

    val listBobas : ArrayList<Bobas>
    get() {
        val list = arrayListOf<Bobas>()
        for (position in bobaNames.indices){
            val bobas = Bobas()
            bobas.name = bobaNames[position]
            bobas.price = bobaPrices[position]
            bobas.description = bobaDescriptions[position]
            bobas.imagePhoto = bobaImages[position]
            list.add(bobas)
        }
        return list
    }
}