# BonoPatrones


#Definicion de atributos

Generales:

Nombre 			| Type 					| JComponent
-------------------------------------------------------
Convertible		| Boolean				| JComboBox or JRadioButton
Receptor DAB	| Boolean				| JComboBox or JRadioButton
Faros 	 		| {LED,Láser}			| JComboBox
Color			| Color					| JColorChooser
Rines			| {20",21",22"}   		| JComboBox

BMW:

Nombre 							| Type 													| JComponent
----------------------------------------------------------------------------------------------------------
Diseño Interior 				|{Default,i Halo, i Accaro} 							| JComboBox
Modelos 						|{i8Roadster,M240i,X3 M40i, M2 Competition} 			| JComboBox
Navegacion e interfaz smartphone|Boolean												| JComboBox or JRadioButton
Sistema de elevación 			|Boolean												| JComboBox or JRadioButton

Ferrari:

Nombre			 				| Type 													| JComponent
-----------------------------------------------------------------------------------------------------------------
Modelos 						|{812 SuperFast, 488 Spider, GTC4Lusso T, Portofino}	| JComboBox
Tapacubos fibra Carbono			|Boolean												| JComboBox or JRadioButton
Elevador de Suspencion			|Boolean												| JComboBox or JRadioButton
Cámara frontal aparca,dos vistas|Boolean  												| JComboBox or JRadioButton



Lamborghini:

Nombre 							| Type 													| JComponent
-------------------------------------------------------------------------------------------
Modelos 						|{Urus,Huracán,Aventador,Few Off,Concept,Ad Personam}	| JComboBox
Suspensión Magnética Reológica	|Boolean												| JComboBox or JRadioButton
Sistema de escape deportivo		|Boolean												| JComboBox or JRadioButton
Telemetria Lamborghini			|Boolean												| JComboBox or JRadioButton



Siguientes Pasos:



1. Generar Vistas aplicando patrón Builder (Considerar poner imagenes de los modelos mencionados para hacerlo mas dinámico)
2. Definir formula de cotización del precio
3. Definir estructura Iterator para montar en una coleccion las cotizaciones.
4. Generar Funcionalidades de cotizacion
	4.1 Crear 
	4.2 Consultar
	4.3 Actualizar
	4.4 Liquidar
