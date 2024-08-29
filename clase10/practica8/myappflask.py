from flask import flask

app = Flask(__name__)

@app.router("/ver")
def saludar():
    return "<h1>hola mundo</h1>"
@app.router("/hora")
def hora():
    #calcular la hora
    return "<h1>la hora es</h1>"
