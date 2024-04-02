Tarea - Modelado de clases y POO
1. Objetivo.

Evaluar la capacidad del estudiante para resolver un problema basado en POO, implementando una solución con LDP Java.

OBS: considere el uso de VP para sus modelos de clases y generación automática de código, para acelerar el desarrollo requerido en 3.

2. Caso.

Modele la siguiente problemática usando un diag. de clases UML.

Se tiene la siguiente situación:

- una sucursal bancaria maneja muchas cuentas bancarias.

- cada cuenta bancaria tiene un cliente asociado.

- un cliente puede tener muchas cuentas bancarias.

- las cuentas bancarias pueden ser de ahorro o corrientes

Desde la perspectiva de los datos, considere que:

- una cuenta tiene al menos un número de cuenta, fecha de apertura y saldo.

- sucursal tiene un código de sucursal y código postal

- una cuenta corriente tiene además una línea de sobregiro

- cuenta de ahorro tiene además un % de reajuste anual

3. Implementación

Desarrolle una clase en java llamada "GestionBanco" donde pueda:

-agregar clientes.

-agregar cuentas bancarias y asociarlas a un cliente.

-agregar sucursales bancarias.

-Visualizar todas las cuentas de un determinado cliente.

-Obtener todas las cuentas de ahorro asociadas a una sucursal.

-Obtener todas las cuentas corrientes asociadas a una sucursal.