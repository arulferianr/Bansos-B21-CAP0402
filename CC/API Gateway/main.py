from flask import Flask, request, jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_cors import CORS

app = Flask(__name__)
CORS(app)
app.config['SQLALCHEMY_DATABASE_URI'] = ''

db = SQLAlchemy(app)

class PenerimaBansos(db.Model):
    __tablename__ = 'penerimabansos'
    id = db.Column