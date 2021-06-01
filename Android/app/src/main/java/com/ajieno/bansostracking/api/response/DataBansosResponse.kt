package com.ajieno.bansostracking.api.response

import com.google.gson.annotations.SerializedName

data class DataBansosResponse(

    @field:SerializedName("provinsi")
    val provinsi: String? = null,

    @field:SerializedName("kota")
    val kota: String? = null,

    @field:SerializedName("kecamatan")
    val kecamatan: String? = null,

    @field:SerializedName("desa")
    val desa: String? = null,

    @field:SerializedName("nik")
    val nik: String? = null,

    @field:SerializedName("nama")
    val nama: String? = null,

    @field:SerializedName("penghasilan")
    val penghasilan: String? = null,

    @field:SerializedName("jtanggungjawab")
    val jtanggungjawab: String? = null,

    @field:SerializedName("umur")
    val umur: String? = null,

    @field:SerializedName("ibuhamil")
    val ibuhamil: String? = null,

    @field:SerializedName("lanjutusia")
    val lanjutusia: String? = null,

    @field:SerializedName("disabilitas")
    val disabilitas: String? = null,

    @field:SerializedName("jmotor")
    val jmotor: String? = null,

    @field:SerializedName("jmobil")
    val jmobil: String? = null,

    @field:SerializedName("bpnt")
    val bpnt: String? = null,

    @field:SerializedName("bst")
    val bst: String? = null,

    @field:SerializedName("pkh")
    val pkh: String? = null








)