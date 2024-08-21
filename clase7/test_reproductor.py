from tkinter import *
from tkinter.ttk import *
from reproductor import *

musica = Reproductor("wefere.mp3")

def play_musica():
    musica.volumen(0.8)
    musica.play()
    x = "Reproduciendo musica"
    Label.config(text=x)

def pause_musica():
    musica.pause()
    x = "Pausando musica"
    Label.config(text=x)

def despausar_musica():
    musica.despausar()
    x = "Continuando musica"
    Label.config(text=x)

def parar_musica():
    musica.stop()
    x = "Parando musica"
    Label.config(text=x)

master = Tk()
master.geometry("200x200")

Label = Label(master, text ="Reproductor de musica")
Label.pack(pady=10)

btn_play = Button(master, text ="▶", command=play_musica)
btn_play.pack(pady=10)

btn_pause = Button(master, text ="⏸", command=pause_musica)
btn_pause.pack(pady=10)

btn_despausar = Button(master, text ="⏯", command=despausar_musica)
btn_despausar.pack(pady=10)

btn_stop = Button(master, text ="⏹", command=parar_musica)
btn_stop.pack(pady=10)


mainloop()