#include <stdio.h>


int suma(int n1, int n2){

	return(n1+n2);

}


int resta(int n1, int n2){

	return(n1-n2);

}


int multiplicacio(int n1, int n2){

	return(n1*n2);

}



int divisio(int n1, int n2){

	return(n1/n2);

}




int mayor (int n1, int n2){


	if(n1 > n2){


		return n1;


	} else { return n2;}



}







int main(){


	int a=10;
	int b=5;



		printf("La suma de %d i %d és %d\n", a,b,  suma(a,b));
		printf("La reta de %d i %d és %d\n", a,b,  resta(a,b));
		printf("La multiplicació de %d i %d és %d\n",a,b, multiplicacio(a,b));
		printf("La divisió de %d i %d és %d\n", a,b,  divisio(a,b));



		printf("El mayor de d% i d% és %d\n", a,b, mayor(a,b));












}