package com.example.navigasidata.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigasidata.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {

    private val _mahasiswaStateUI =
        MutableStateFlow(Mahasiswa())

    //response or state
    val mahasiswaUiState:
            StateFlow<Mahasiswa> =
        _mahasiswaStateUI.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>) {
        _mahasiswaStateUI.update { statusSaatini ->
            statusSaatini.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2],
            )
        }
    }

}