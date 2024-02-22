"area de un triangulo dandole 2 numeros"

def areaTriangulo(num,num2):

   
    area= (num*num2)//2

    return area;


numero1 = int(input("dame un numero"))
numero2 = int(input("dame un numero"))

resultado = areaTriangulo(numero1,numero2)

print("area es ",resultado)
    