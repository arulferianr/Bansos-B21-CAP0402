#!/usr/bin/python3

#import library
import json
from flask import Flask, app, request
from flask.wrappers import Response
from flask_restful import Resource, Api
from flask_cors import CORS

#inisiasi object flask
app= Flask(__name__)

#inisiasi object flaskrestful
api= Api(app)

#inisiasi cors
CORS(app)

#inisiasi variabel kosong
identititas = {}

#membuat class Resource
class ResourceBansos(Resource):
    #method get and post
    def get(self):
        #response = {"msg":"coba dulu"}
        return identititas
    
    def post(self):
        no = request.form["No"]
        provinsi = request.form["Provinsi"]
        kabupaten = request.form["Kab/Kota"]
        kecamatan = request.form["Kecamatan"]
        desa = request.form["Desa"]
        nik = request.form["NIK"]
        nama = request.form["Nama"]
        penghasilan = request.form["Penghasilan/Bulan"]
        tanggungjawab = request.form["Jumlah Tanggung Jawab"]
        umur = request.form["Umur"]
        ibuhamil = request.form["Jumlah Ibu Hamil"]
        lanjutusia = request.form["Termasuk Lanjut Usia?"]
        disabilitas = request.form["Berkebutuhan Khusus?"]
        mobil = request.form["Jumlah Mobil"]
        motor = request.form["Jumlah Motor"]
        bpnt = request.form["Penerima BPNT?"]
        bst = request.form["Penerima BST?"]
        pkh = request.form["Penerima PKH?"]
        identititas["No"] = no
        identititas["Provinsi"] = provinsi
        identititas["Kab/Kota"] = kabupaten
        identititas["Kecamatan"] = kecamatan
        identititas["Desa"] = desa
        identititas["NIK"] = nik
        identititas["Nama"] = nama
        identititas["Penghasilan/Bulan"] = penghasilan
        identititas["Jumlah Tanggung Jawab"] = tanggungjawab
        identititas["Umur"] = umur
        identititas["Jumlah Ibu Hamil"] = ibuhamil
        identititas["Termasuk Lanjut Usia?"] = lanjutusia
        identititas["Berkebutuhan Khusus"] = disabilitas
        identititas["Jumlah Mobil"] = mobil
        identititas["Jumlah Motor"] = motor
        identititas["Penerima BPNT?"] = bpnt
        identititas["Penerima BST?"] = bst
        identititas["Penerima PKH?"] = pkh

        response = {"msg": "Data berhasil masuk"}
        return response

#setup resource
api.add_resource(ResourceBansos, "/users", methods=["GET", "POST"])

if __name__ == "__main__":
    app.run(debug=True, port=8000)