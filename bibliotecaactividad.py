huespedes={101:'Juan Valdes', 105:'Paquita la del Barrio', 202: 'Mariana Pajon'}
'''Crear una biblioteca '''
print (huespedes)

'''Imprime las variables que estan dentro de la biblioteca huespedes '''
print (huespedes.items())
'''obtenemos todos los pares de clave-valor en el diccionario existente.'''
print (huespedes.keys())
'''Devuelve un objeto de vista que muestra una lista de todas las claves en el diccionario'''
for key in huespedes:
    print (key)
'''por cada clave en el diccionario imprimira las claves '''
print ('====================================')
'''Imprime rayas'''
print (huespedes.values())
'''nos permiten almacenar una serie de articulos variables entre dos conjuntos de elementos, llamados keys'''
for key in huespedes:
    print (huespedes[key])
    '''por cada clave en el diccionario imprimira las claves '''
print()
'''Imprime espacios '''
for habitacion in huespedes:
    print (habitacion,':',huespedes[habitacion])
    '''por cada variable habitacion en huespedes clave en el diccionario imprimira un habitacion que son los keys y : + huespedes '''
print()
'''Imprime espacios '''
for habitacion,huesped in huespedes.items():
    print (habitacion,':',huespedes[key])
'''por cada variable habitacion,huesped en el cual porque necesitamos cambiar el diccionario, imprimira habitacion que es numero+: dentro de la clave llamada huesped'''
for indice, key in enumerate(huespedes):
    print (indice+1,key,huespedes[key])
    '''Enumera el arreglo huespedes con un contador+1 '''
print()
'''Imprime espacios '''

print (huespedes[105])
'''Obtiene e imprime al huesped que tiene por nombre 105 la cual es 
Paquita la del Barrio '''
print (huespedes.get(105))
'''Obtiene e imprime al huesped que tiene por nombre 105 la cual es 
Paquita la del Barrio '''
print ('====================================')
'''Imprime rayas '''

huespedes[102]='Fanny Lu'
'''Define el arreglo y añade que en la casilla o clave 102 esta fanny lu'''
huespedes[107]='Don Omar'
'''Define el arreglo y añade que en la casilla o clave 107 esta Don omar'''
huespedes.setdefault('109','Luis Miguel')
'''inserta una clave con un valor en el diccionario.'''

for huesped in huespedes.items():
    print (habitacion,':',huesped)
print()
''' imprime cada clave y un valo por cada clave en el diccionario imprimira las claves '''


registroshoy={201:'Vicente Fernandez',301:'Pepe Guardiola'}
'''Define registros hoy como una biblioteca'''
huespedes.update(registroshoy)
''' actualiza el diccionario con los elementos del otro objeto de diccionario o de un iterable de pares clave / valor.'''
for habitacion, huesped in huespedes.items():
    print (habitacion,':',huesped)
print()
''' imprime cada clave y un valo por cada clave en el diccionario imprimira las claves '''

print ('====================================')

huespedes[107]='Ricky Martin'
'''añade a ricky martin y le da un valor de 107'''
print (huespedes)
'''Imprime las variables que estan dentro de la biblioteca huespedes '''

print ('====================================')
'''Imprime rayas'''


del huespedes[102]
'''Elimina el valor dentro de la clave 102 '''
huespedes.pop(202)
'''elimina y retorna un elemento de una lista.'''
print(huespedes)
'''Imprime las variables que estan dentro de la biblioteca huespedes '''

print ('====================================')
'''Imprime rayas'''
copia1=huespedes.copy()
'''Las declaraciones de asignación en Python no copian objetos, crean enlaces entre un objetivo y un objeto. '''
print ('copia1: ',copia1)
'''Imprime las declaraciones de los huespedes'''
copia2={}
copia2.update(huespedes)
''' actualiza el diccionario con los elementos del otro objeto de diccionario o de un iterable de pares clave / valor.'''
print ("copia2: ",copia2)
'''Imprime la biblioteca actualizada con los objetos '''
print ('====================================')
''' imprime rayas'''
lista=[2,5,7,1]
'''Define la lista lista'''
diccio=dict.fromkeys(lista,"xxx")
'''es un tipo mapa que asocia claves a valores. A diferencia y define lo que este adentro que seria xxx'''
print(diccio)
'''imprime diccio la cual seria una biblioteca'''

print ('====================================')
'''Imprime rayas'''
inventario={"plata": (500,2500), 'cartera' : ["Cedula","Moneda","Boletas"],'mecato':'Detodito','dias':1}
'''Define la biblioteca que tiene por nombre inventario'''
print (inventario)
'''Imprime inventario'''
inventario["cartera"].sort()

print(inventario)
'''Imprime el inventario'''
inventario["cartera"].remove("Moneda")
'''Estaba mal escrito en Monedas es Moneda para que pueda reemplazarlo ya que no existe ninguna variable llamada monedas por ende no la podia reemplazar'''
print(inventario)
'''Imprime el inventario actualizado'''
print(inventario.get("plata")[0])
'''Obtiene e imprime la variable plata en la posicion 0'''