package disiiy.khaper.drinkbobas.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Bobas (
    var imagePhoto : Int = 0,
    var name : String = "",
    var price : String = "",
    var description : String = ""
) : Parcelable