rios={'El Amazonas':'Brasil',
      'El Nilo':'Egipto',
      'El Misisispi': 'Centro de Estados Unidos',
      'El Volga' : 'Moscú',
      'El Ganges':'Himalayas'}
print (rios.items())
print (rios.keys())
for key in rios:
    print ('El rio',key, 'pasa a través de ', rios[key])
print ('====================================')
print (rios.keys())
for key in rios:
    print (key)
print ('====================================')
print (rios.values())
for key in rios:
    print (rios[key])
