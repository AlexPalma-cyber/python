import os
from tkinter import messagebox, ttk
import datetime
def abrirCalculadora():
    os.system("calc")

def saludar(): 
    messagebox.showinfo(message="¡Hola, mundo!", title="Saludo")   

def abrirPaint():
    os.system("mspaint")

def verHora():
    hora = datetime.datetime.now()
    messagebox.showinfo(message=f"{hora.hour}:{hora.minute}\n{hora.year}/{hora.month}/{hora.day} ", title="La hora es: ")
    #otra forma de poner la hora del dia es:
    # hora = datetime.datetime.now()
    #messagebox.showinfo(message= "hora", title="La hora es: ")