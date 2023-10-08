# ProgramacionFuncional

Las lambdas son funciones anónimas que no necesitan una clase pero solo son aceptadas cuando el tipo es una interfaz funcional. Donde la interfaz funcional solo tiene un método abstracto. De manera opcional puede estar anotada como @FunctionalInterface.

- Consumer: Siempre se usa cuando queremos consumir un dato, es decir,
        caundo queremos consumir un dato, guardarlo en una BBDD, imprimirlo, etc...

- Function: Le pasas un objeto y te devuelve su valor por ejemplo
         le pasas un producto y te devuelve el precio.

  -Predicate: Devuelve un boolean y simpre se usa cuando queremos poner filtros.
          Ejemplo:  Predicate<String> validateName = name -> name.length() > 5 && name.length() < 15;

  -Supplier:  Este método genera datos, solo tiene salida y no entrada por eso
        los paréntesis van vacíos.
          Ejemplo: Supplier<Double> generator = () -> Math.random();
