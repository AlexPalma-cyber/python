from tkinter import *
from controladores import *

ventana = Tk()
ventana.title("Primera Ventana") #cambiar el nombre de la ventana


ventana.geometry("520x420") #configurar tamaño
ventana.iconbitmap("logo.ico") #Cambiar el icono


botonCalculadora = Button(text= "Abrir calculadora", command=abrirCalculadora)
botonCalculadora.place(x=50, y=50)
botonSaludar = Button(text= "Saludar", command=saludar)
botonSaludar.place(x=200, y=50)
botonPaint = Button(text= "Abrir paint", command=abrirPaint)
botonPaint.place(x=300, y=50)
botonHora = Button(text= "Ver hora", command=verHora)
botonHora.place(x=400, y=50)


ventana.config(bg = "skyblue") #cambiar color de fondo
ventana. resizable(0,0) #Evitar el redimensionamiento
ventana.mainloop()

