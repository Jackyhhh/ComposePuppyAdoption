package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    val dogs by mutableStateOf(
            listOf(
                    Dog(
                            "田田",  "南京",
                            "成年", "雄性", "比熊犬", R.drawable.bixiong
                    ),
                    Dog(
                            "小火", "广州",
                            "幼年", "雄性", "柴犬", R.drawable.chaiquan
                    ),
                    Dog(
                            "小哈", "武汉",
                            "成年", "雄性", "哈士奇", R.drawable.hashiqi
                    ),
                    Dog(
                            "壮壮", "北京",
                            "幼年", "雌性", "拉布拉多", R.drawable.labuladuo
                    ),

                    Dog(
                            "小布", "杭州", "幼年",
                            "雌性", "罗威纳犬", R.drawable.luoweina
                    ),
                    Dog(
                            "泰泰", "深圳", "幼年",
                            "雌性", "泰迪",  R.drawable.taidi
                    ),
            )
    )


    var currentDog: Dog? by mutableStateOf(null)

    fun showDog(dog: Dog) {
        currentDog = dog
    }

    fun deleteDog() {
        currentDog = null
    }

}