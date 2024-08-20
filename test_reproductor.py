from tkinter import *
from tkinter.ttk import *
from reproductor import *

musica = Reproductor("wefere.mp3")

def play_musica():
    musica.volumen(0.8)
    musica.play()

def pause_musica():
    musica.pause()

def despausar_musica():
    musica.despausar()

def parar_musica():
    musica.stop()

master = Tk()
master.geometry("200x200")

Label = Label(master, text ="Reproductor de musica")
Label.pack(pady=10)

btn_play = Button(master, text ="Reproductor de musica", command=play_musica)
btn_play.pack(pady=10)

btn_pause = Button(master, text ="La musica se ha pausado", command=pause_musica)
btn_pause.pack(pady=10)

btn_despausar = Button(master, text ="La musica continua", command=despausar_musica)
btn_pause.pack(pady=10)

btn_stop = Button(master, text ="La musica se detuvo", command=parar_musica)
btn_stop.pack(pady=10)



mainloop()