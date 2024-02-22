#muestra el factorial de un numero introducido por teclado

num = int(input("dame un numero "))
contadorFactorial= 1;

for i in  range(1,num+1):
    contadorFactorial =  contadorFactorial * i;
else:
    print(str(contadorFactorial))