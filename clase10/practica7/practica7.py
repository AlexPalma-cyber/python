#ejecutar python -m pipinstall mysql-connector-python
#documentacion de consulta: https://www.w3schools.com/python/python_mysql_getstarted.asp
"""perfeccionar el ejercicio de traductor implementando una base de datos mysql
Crear una tabla llamada traductor con los campos ID, español, ingles"""

import mysql.connector
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="",
  database="python_traductor"
 )

cursor = mydb.cursor()
while True:
    palabra = input("Ingrese la palabra a traducir: ")
    sentencia = f"select ingles from traductor where espanol = '{palabra}'"
    cursor.execute(sentencia)

    resultado = cursor.fetchall()
#si existe imprimir, sino solicitar para agregar una nueva palabra
    for x in resultado:
      print(f"{palabra}: {x[0]}")