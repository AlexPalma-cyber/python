def ordenar_lista(lista, orden):

 if orden.upper() == "ASC":
   return sorted(lista)
 elif orden.upper() == "DESC":
   return sorted(lista, reverse=True)
 else:
   raise ValueError("El argumento 'orden' debe ser 'ASC' 'DESC'.")
 
mi_lista =[4,2,5,8,9,6,7,3]
print("Lista original:", mi_lista)

#ordenar de manera ascendente
lista_ascendente = ordenar_lista(mi_lista,"ASC")
print("Lista ordenada ascendente:", lista_ascendente)
#ordenar de manera descendente
lista_descendente = ordenar_lista(mi_lista,"DESC")
print("Lista ordenada descendente:", lista_descendente)