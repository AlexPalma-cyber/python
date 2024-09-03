import re
import requests

def filtro(contenido):
    censuradas = ['mamón', 'bobo', 'pendejo', 'idiota', 'imbécil', 'estupido']
    # Crear una expresión regular que coincida con cualquiera de las palabras censuradas
    regex = r'\b(?:' + '|'.join(map(re.escape, censuradas)) + r')\b'
    # Reemplazar las palabras censuradas por 'CENSURADO'
    contenido_censurado = re.sub(regex, 'CENSURADO', contenido, flags=re.IGNORECASE)
    
    # Verificar si se ha censurado alguna palabra
    if 'CENSURADO' in contenido_censurado:
        return 'Palabra censurada en el contenido.'
    else:
        return 'El contenido cumple con las normas.'

def obtener_contenido_url(url):
    try:
        # Para obtener el contenido HTML de la página
        response = requests.get(url)
        response.raise_for_status()  # funcion que lanza un error si la solicitud falla
        html = response.text
        
        # Extraer el texto visible (básico) del contenido HTML
        texto_visible = re.sub(r'<[^>]+>', '', html)  # Sirve para eliminar las etiquetas HTML
        return texto_visible
    except requests.RequestException as e:
        return f'Error al obtener la página: {e}'

# URL de la página que quieres filtrar
url = 'https://es.wiktionary.org/wiki/Wikcionario:Insultos_regionales'

# Obtener el contenido de la URL
contenido_pagina = obtener_contenido_url(url)
# Aplicar el filtro al contenido
resultado = filtro(contenido_pagina)
print(resultado)

