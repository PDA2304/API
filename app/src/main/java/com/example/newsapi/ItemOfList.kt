package com.example.newsapi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ItemOfList ( val title : String,
                   val description : String,
                   val name :String,
                   val date : String,
                   val image :String
): Parcelable
