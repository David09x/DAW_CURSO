#muestra la suma,el producto y la media de los 100 primeros numeros naturales.

num = 100;
contadorSuma= 0;
contadorMedia = 0;
contadorMultiplicar = 1;
for i in range(1, num+1):
    
    contadorSuma=  contadorSuma + i;
    contadorMedia = contadorSuma/num; 
    contadorMultiplicar = contadorMultiplicar * i
else: 
    print("suma total = " + str(contadorSuma) + " " + "la media total es = " + str(contadorMedia) + " " +"producto total 0 " + str(contadorMultiplicar))
    