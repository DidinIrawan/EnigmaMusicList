package com.main.EnigmaMusicList.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.main.EnigmaMusicList.classes.Music

class MusicViewModel : ViewModel() {
    val musicList = mutableListOf<Music>(
        Music("Bara Suara", "Send Melagu", "https://1.bp.blogspot.com/-z1yONm1YBSU/WMtXQzqt5UI/AAAAAAAABd0/TFG0BW4OqbQPCnTO01iTKPcIe0GlNK9QgCLcB/s1600/BARASUARA-image-1024x786.jpg"),
        Music("Danila", "Berdistraksi", "https://i.pinimg.com/originals/c0/3b/dd/c03bdd2337296eac16a7920174f6696a.jpg"),
        Music("Feast", "Paid Milik Rakyat", "https://images.genius.com/7a1abeaaaa559c1357809fccfcd501d4.680x680x1.jpg"),
        Music("FourTwenty", "Nematomorpha", "https://infopensi.com/wp-content/uploads/2015/fourtwnty-perdengarkan-realita-di-synchronize-fest-2018-single-kedua-dari-album-kedua.jpg")
    )

    val musicLiveData: MutableLiveData<MutableList<Music>> = MutableLiveData(musicList)

    fun addMusicList(musicArtistName: String, musicTitle: String, musicImage: String) {
        musicList.add(
            Music(
                musicArtistName,
                musicTitle,
                musicImage
            )
        )
        musicLiveData.value = musicList
    }
}