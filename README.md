# analisis-de-codigo-y-dependencia
*******************
Coexisten 2 clases: CarroCompra y Calculadora cada uno con funciones y atributos propios.

+ Se puede apreciar que en la clase CarroCompra, en una seccion se hace una instanciacion y una llamado a un metodo a la clase Calculadora
+ El metodo tipo INT "subTotal" dentro de la clase CarroCompra instancia el objeto calc de la clase Calculadora y su retorno es un metodo de dicha clase
---------------------
El anterior caso es un ejemplo claro de dependencia, ya que una clase necesita si o si que exista la otra clase para existir, ya que en este caso esta en juego sus atributos, sin los cuales un objeto de dicha clase no podria ser iniciado
**Especificamente: **

+ En los atributos de CarroCompra hay independencia
+ En los atributos de Calculaora hay indepencia
+ En los metodos de calculadora hay independencia, solo se ocupan elemntos dentro de la clase
+ En los metodos de CarroCompra hay conflicto: como la mayoria de los metodos son independientes y solo uno de los metodos tiene dependencia de un elemento de otra clase, no se habla de una asociacion, sino que solamente de una dependencia
