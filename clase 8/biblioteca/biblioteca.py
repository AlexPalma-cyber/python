class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self._libros = []

    def consultar_nombre_biblioteca(self):
        return self.nombre

    def agregar_libro(self, libro):
            self._libro.appende(
                 {
                    libro.titulo,
                    libro.autor,
                    libro.cantidad_de_paginas,
                    libro.genero,
                    libro.sinopsis,   
                 }
            )
    def consultar_libros(self):
         return self._libros

    def  consultar_libros(self, id):
         return self._libros[id]
    
    def  quitar_libros(self, id):
         return self._libros.pop[id]
    
