t = (23,'a',(2.5,3.7,'x'),["perrito","gatito"],'Pepe')
print (t)
'''Imprime las variables que estan dentro de t'''
print (len(t))
'''Devuelve la longitud de un objeto'''


print ('=====================================')
'''Imprime rayas '''
print (t[0])
'''Imprime t en la posicion 0 es decir 23'''
print (t[3])
'''Imprime t en la posicion 3 es decir ['perrito', 'gatito'] '''
print (t[1:3])
'''omite t en la posicion 1, y toma  3 valores que esten en t  es decir ('a', (2.5, 3.7, 'x'))'''
print (t[3][1])
'''toma el valor en la posicion 3 y coje el valor que este en la posicion 1 es decir gatito'''



print ('====================================')
'''Imprime rayas '''
print (t[3])
'''Imprime t en la posicion 3 es decir ['perrito', 'gatito'] '''
t[3].append('lorito')
'''para agregar un elemento de cualquier tipo en la pocision 3 de una lista'''
print (t)
'''Imprime las variables que estan dentro de t'''
print ('====================================')
'''Imprime rayas '''
for elemento in t:
    print (elemento)
'''Se utiliza para recorrer los elementos de un objeto iterable e imprimirlas'''
print ('====================================')
'''Imprime rayas '''
for index in range(0,len(t)):
    print (t[index])
'''Usamos la función index que devuelve la posición de la primera aparición del elemento.'''

print ('====================================')
'''Imprime rayas '''
if 'a' in t:
    print ("El elemento 'a' esta en la tupla")
'''Si, 'a' esta en t se imprimira que si está  '''
print ('====================================')
'''Imprime rayas '''
lista=list(t)
lista[1]='A'
print (lista)
'''Reemplaza t en la posicion [1] por A e imprimirla'''
tupla=tuple(lista)
print (tupla)
'''son elementos ordenados en una secuencia específica e imprimirla'''
print ('====================================')
'''Imprime rayas '''
l = [(1,1), (2,4), (3,9), (4,16), (5,25)]
for x, y in l:
    print (x, ':', y)
'''Imprime X & Y y para cada x & y imprimidos en l se imprimen : '''