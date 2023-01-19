package curso.g2.operadores;

public class Vuelta {
 public static void main(String[] args) {
	 System.out.println("Fase 1 ****************");

	 String salida = "";
	 for(String ele: args) {
		 salida = salida+ele+" ";
	 }
	 System.out.println(salida);

 System.out.println("Fase 2 ****************");

 String[] palabras = salida.split(" ");
 int fin = palabras.length;
 String salida2="";
 for(int i = fin-1;i>=0;i--) {
	 salida2= salida2+palabras[i]+" ";
 }

 System.out.println(salida2.toString());
 
 System.out.println("Fase 3 ****************");

 String salida3 ="";
 int ls = salida.length();
 for(int i = ls-1;i>=0;i--) {
	 salida3+=salida.charAt(i);
 }

 System.out.println(salida3);

 System.out.println("Fase 4 ****************");
  String salida4="";
 for(int i=0;i<ls;i++) {
	 char r=conver(salida3.charAt(i));
	 salida4+=r+"";
	 }
 System.out.println(salida4);
 
 
 System.out.println("Fase 5 ****************");
  String salida5="";
  char del =salida.charAt(0);
  /*boolean f=false;
  int pos=1;
  salida+=del;
  while(!f) {
	  if(salida.charAt(pos)==del) {
		  f=true;
	  }else {
		  salida5+=salida.charAt(pos);
		  pos++;
	  }
  }*/
  for(int a =1;(salida+del).charAt(a)!=del;a++) {
	  salida5 +=salida.charAt(a);

  }
  System.out.println(salida5);
  System.out.println("Fase 6 ****************");
 
 String salida6="";
  salida+=(char)0;
  int pos = 0;
  while(salida.charAt(pos)!=(char)0) {
	  salida6 += salida.charAt(pos);
	  pos++;
  }
 System.out.println(salida6);
 }


public static char conver(char c) {
	char resul=c;
	switch(c) {
	 case 'a':resul= '4';break;
	 case 'e':
	 case 'E':resul=  '3';break;
	 
	 case 'i':resul=  '1';break;
	 case 'o':resul=  '0';break;
	 case 'u':resul=  '9';break;
	 default :resul=c;
	 }
	return resul;
}




}
