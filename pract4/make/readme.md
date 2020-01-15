"

#TO-DO 1


	##hola

		-Com es compila: Creem un arxiu amb qualsevol editor de text anomenat **hola* i amb l'extenció *c*, i l'afegim amb **GIT** al apartat *make/fichers* del directori de **GITHUB**.
 Després amb l'eina **MAKE** compilem el codi font que acabem de crear amb aquests commands:

		  *  $	make hola; *

		i ens crea l'executable **hola.exe** a partir de l'arxiu **hola.c**


		-Com s'executa: Finalment, per executar sols hi ha que introduir al **cmd** el nom del executable que volem executar:

			* $  hola;   *


----------------

----------------






#TO-DO 2




	##calculadora1

		-Com es compila: Creem un arxiu amb qualsevol editor de text anomenat **calculadora1* i amb l'extenció *c*. Aquest programa consta de 3 apartats:

				- ** #include **: És una capçalera que 					enllaça amb la llibreria * <stdio.h>.*

				-Les **funcions**, que consten de un 				tipus que les identifica, un nombre, 					uns parametres de entrada, i un valor 				de retorn.


				-El metode **main**, que s'encarrega de 				cridar (amb un determinat ordre) a les 					funcions asignat-li uns valors de 					entrada.	


		Després l'afegim amb **GIT** al apartat *make/fichers* del 		directori de **GITHUB**. Després amb l'eina **MAKE** 		compilem el codi font que acabem de crear amb aquests 		commands:

		  *  $	make calculadora1; *

		i ens crea l'executable **calculadora1.exe** a partir de l'arxiu **calculadora1.c**






		-Com s'executa: Finalment, per executar sols hi ha que introduir al **cmd** el nom del executable que volem executar:

			* $  calculadora1;   *





------------------------










	##calculadora2



		-Com es compila: Creem un arxiu amb qualsevol editor de text anomenat **calc2* i amb l'extenció *c*. Aquest arxiu tindrà implementades les 5 funcions.
			
			Posteriorment, creem el arxiu **calc2** i amb l'extensió *h*. Aquesta llibreriia, conté les capçaleres de les funcions, per poder ser cridades desde altre programa.  


L'afegim amb **GIT** al apartat *make/fichers* del directori de **GITHUB**. Després amb l'eina **MAKE** compilem el codi font que acabem de crear amb aquests commands:


		Amb el comand:

			* $  gcc -c calc.c -o calc.o*


		obtenim el arxiu objecte de la llibreria a partir del 		codi font.




		Tot seguit, amb el comand:



			* $  gcc calc.o calcula.c -o calcula *


		obtenim el arxiu executable **calcula.exe** a partir 	        del arxiu objecte de la llibreria i i el arxiu font que 		conté el metode **main**, i al qual se li enllaça en la 		capçalera la llibreria objecte ** <calc.h> **.
		Aquesta llibreria conté les 5 funcions i permet al 			metode cridar-les. El arxiu resultant, ja es podra 		executar.





		-Com s'executa: Finalment, per executar sols hi ha que introduir al **cmd** el nom del executable que volem executar:

			* $  calcula;   *




----------------

























"