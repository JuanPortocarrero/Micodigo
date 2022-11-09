Estudiante1 = {"codigo":"1",
               "nombre":"Luisa",
               "apellido":"Aguirre",
               "nota1":"5",
               "nota2":"4",
               "nota3":"4.2"
               }
Estudiante2 = {"codigo":"2",
               "nombre":"Pepito",
               "apellido":"Perez",
               "nota1":"4.7",
               "nota2":"4",
               "nota3":"4.3"
               }
Estudiante3 = {"codigo":"3",
               "nombre":"Juan",
               "apellido":"Vargas",
               "nota1":"5",
               "nota2":"4",
               "nota3":"4.9"
               }
SumaNotasEstudiante1 = ((float(Estudiante1["nota1"]))+(float(Estudiante1["nota2"]))+(float(Estudiante1["nota3"])))/3
SumaNotasEstudiante2 = ((float(Estudiante2["nota1"]))+(float(Estudiante2["nota2"]))+(float(Estudiante2["nota3"])))/3
SumaNotasEstudiante3 = ((float(Estudiante3["nota1"]))+(float(Estudiante3["nota2"]))+(float(Estudiante3["nota3"])))/3
palabrasecrete=0
repetir=0;
while repetir==0:
    i=int(input("MENU PRINCIPAL:\n Para seleccionar Estudiante1, teclee: 1\n Para seleccionar Estudiante2, teclee: 2\n "
                "Para seleccionar Estudiante3, teclee: 3\n Para agregar otro estudiante, teclee: 4\n "
                "Para modificar los datos de un Estudiante, teclee: 5\n Para eliminar Estudiante, teclee: 6\n "
                'Para ver todos los Estudiantes "originales o iniciales" , teclee: 7\n '
                'Ver mejor promedio de los estudiantes "originales o iniciales", teclee: 8\n'
                ' ver peor promedio de los estudiantes "originales o iniciales", teclee: 9\n' 
                ' Salir, teclee: 0 \n'
                '\n------------------------------------------\n :'))
    if i == 1:
        print("RESPUESTA: \n ", Estudiante1, "\nY cuenta con un promedio de",SumaNotasEstudiante1, "\n------------------------------------------","\n")
    elif i == 2:
        print("RESPUESTA: \n ", Estudiante2, "\nY cuenta con un promedio de",SumaNotasEstudiante2,"\n------------------------------------------","\n")
    elif i == 3:
        print("RESPUESTA: \n ", Estudiante3, "\nY cuenta con un promedio de",SumaNotasEstudiante3,"\n------------------------------------------","\n")
    elif i == 4:
        print(str(input("Agregue el nombre de otro estudiante: \n")))
        print("------------------------------------------\n")
        print(str(input("Agregue el apellido de ese estudiante: \n")))
        print("\n------------------------------------------\n")
        print("Agregue el nombre de ese estudiante: \n")
        print(float(input("Nota 1: \n")))
        print(float(input("Nota 2: \n")))
        print(float(input("Nota 3: \n")))
        print("\n------------------------------------------\n")
    elif i == 5:
        j=int(input("MENU:\n Para modificar datos de Estudiante1, teclee: 1\n Para modificar datos de Estudiante2, teclee: 2\n "
                    "Para modificar datos de estudiante3, teclee: 3\n------------------------------------------\n"))
        if j==1:
            DatosCambiar1=input("Los datos actuales de Estudiante1 son: "
                                + "\n codigo: " + Estudiante1["codigo"] + "\n nombre: " + Estudiante1["nombre"] +
                                "\n apellido: " + Estudiante1["apellido"] + "\n nota1: " + Estudiante1["nota1"]
                                + "\n nota2: " + Estudiante1["nota2"] + "\n nota3: " + Estudiante1["nota3"]
                                +"\n ¿Que dato desea modificar?, (escriba la palabra exacta de lo que quiere modificar): ")
            print("\n------------------------------------------\n")
            ValorNuevo1=input("Ingrese el dato nuevo: ")
            Estudiante1[DatosCambiar1] = ValorNuevo1
            SumaNotasEstudiante1 = ((float(Estudiante1["nota1"]))+(float(Estudiante1["nota2"]))+(float(Estudiante1["nota3"])))/3
        elif j==2:
            DatosCambiar2=input("Los datos actuales de Estudiante1 son: "
                                + "\n codigo: " + Estudiante2["codigo"] + "\n nombre: " + Estudiante2["nombre"] +
                                "\n apellido: " + Estudiante2["apellido"] + "\n nota1: " + Estudiante2["nota1"]
                                + "\n nota2: " + Estudiante2["nota2"] + "\n nota3: " + Estudiante2["nota3"]
                                +"\n ¿Que dato desea modificar?, (escriba la palabra exacta de lo que quiere modificar): ")
            print("\n------------------------------------------\n")
            ValorNuevo2=input("Ingrese el dato nuevo: ")
            Estudiante2[DatosCambiar2] = ValorNuevo2
            SumaNotasEstudiante2 = ((float(Estudiante2["nota1"]))+(float(Estudiante2["nota2"]))+(float(Estudiante2["nota3"])))/3
            PromedioEstudiante2 =(SumaNotasEstudiante2/3)
        elif j==3:
            DatosCambiar3=input("Los datos actuales de Estudiante1 son: "
                                + "\n codigo: " + Estudiante3["codigo"] + "\n nombre: " + Estudiante3["nombre"] +
                                "\n apellido: " + Estudiante3["apellido"] + "\n nota1: " + Estudiante3["nota1"]
                                + "\n nota2: " + Estudiante3["nota2"] + "\n nota3: " + Estudiante3["nota3"]
                                +"\n ¿Que dato desea modificar?, (escriba la palabra exacta de lo que quiere modificar): ")
            print("\n------------------------------------------\n")
            ValorNuevo3=input("Ingrese el dato nuevo: ")
            Estudiante3[DatosCambiar3] = ValorNuevo3
            SumaNotasEstudiante3 = ((float(Estudiante3["nota1"]))+(float(Estudiante3["nota2"]))+(float(Estudiante3["nota3"])))/3
            PromedioEstudiante3 =(SumaNotasEstudiante3/3)
    elif i == 6:
        d=int(input("MENU :\n Para eliminar Estudiante1, teclee: 1\n Para eliminar Estudiante2, teclee: 2\n "
                    "Para eliminar Estudiante3, teclee: 3\n"))
        if d==1:
            def delete(Estudiante1):
                del(Estudiante1)
            print("Estudiante1 ELIMINADO\n",Estudiante2,"\n",Estudiante3,"\n------------------------------------------\n")
        elif d==2:
            def delete(Estudiante2):
                del(Estudiante2)
            print(Estudiante1,"\nEstudiante2 ELIMINADO\n",Estudiante3,"\n------------------------------------------\n")
        elif d==3:
            def delete(Estudiante3):
                del(Estudiante3)
            print(Estudiante1,"\n",Estudiante2,"\nEstudiante3 ELIMINADO","\n------------------------------------------\n")
        else:
            print("Esa opcion no esta dentro del menú.\n------------------------------------------\n")
    elif i == 7:
        print("RESPUESTA: \n")
        print(Estudiante1,"\n")
        print(Estudiante2,"\n")
        print(Estudiante3,"\n")
        print("\n------------------------------------------\n")
    elif i == 8:
        if SumaNotasEstudiante1 > SumaNotasEstudiante2 and SumaNotasEstudiante1 > SumaNotasEstudiante3:
            print("El promedio mas alto es de: \n", Estudiante1, "\nPROMEDIO: \n", SumaNotasEstudiante1)
            print("------------------------------------------\n")
        elif SumaNotasEstudiante2 > SumaNotasEstudiante1 and SumaNotasEstudiante2 > SumaNotasEstudiante3:
            print("El promedio mas alto es de: \n", Estudiante2, "\nPROMEDIO: \n", SumaNotasEstudiante2)
            print("\n------------------------------------------\n")
        elif SumaNotasEstudiante3 > SumaNotasEstudiante1 and SumaNotasEstudiante3 > SumaNotasEstudiante2:
            print("El promedio mas alto es de: \n", Estudiante3, "\nPROMEDIO: \n", SumaNotasEstudiante3 )
            print("\n------------------------------------------\n")
    elif i == 9:
        if SumaNotasEstudiante1 < SumaNotasEstudiante2 and SumaNotasEstudiante1 < SumaNotasEstudiante3 :
            print("El promedio mas bajo es de: \n", Estudiante1, "\nPROMEDIO: \n", SumaNotasEstudiante1)
            print("\n------------------------------------------\n")
        elif SumaNotasEstudiante2 < SumaNotasEstudiante1 and SumaNotasEstudiante2 < SumaNotasEstudiante3 :
            print("El promedio mas bajo es de: \n", Estudiante2, "\nPROMEDIO: \n", SumaNotasEstudiante2)
            print("\n------------------------------------------\n")
        elif SumaNotasEstudiante3 < SumaNotasEstudiante1 and SumaNotasEstudiante3 < SumaNotasEstudiante2:
            print("El promedio mas bajo es de: \n", Estudiante3, "\nPROMEDIO: \n", SumaNotasEstudiante3)

            print("\n------------------------------------------\n")
    elif i == 0:

         break
    else:
        print("ERROR, Elija una de las 10 opciones disponibles.\n")
