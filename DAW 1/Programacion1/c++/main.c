
#include <stdio.h>

int suma(int op1, int op2){
return (op1+op2);
}

int resta(int op1, int op2){
return (op1-op2);
}
int multiplica(int op1, int op2){
return (op1*op2);
}

int divideix(int op1, int op2){
return (op1/op2);
 }
 
int mayor(int op1,int op2){
	if(op1 >op2){
		return op1;
	}
	else
	{
		return op2;
	}
}

int main()
{
int a=10;
int b=5;

printf("La suma de %d i %d �s %d\n", a, b, suma(a,b));
printf("La resta entre %d i %d �s %d\n", a, b, resta(a,b));
printf("La multiplicaci� de %d i %d �s %d\n", a, b, multiplica(
a,b));
printf("La divisi� entre %d i %d �s %d\n", a, b, divideix(a,b));
printf("el numero mayor entre  %d i %d �s %d\n", a, b, mayor(a,b));
}
