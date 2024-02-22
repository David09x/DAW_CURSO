#decir si es un año bisiesto

anyo= int(input("introduce un año y formato YYYY"))

if(anyo%400 ==0 or (anyo%4 == 0 and anyo%100 != 0)):
    print("es anyo bisiesto")
else:
    print("no es bisiesto")