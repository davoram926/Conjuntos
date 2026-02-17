# Plan de trabajo: caso de estudiantes e idiomas

Este plan esta enfocado solo en el caso de estudio de conjuntos (100 estudiantes e idiomas).

## Objetivo
Completar el programa para responder correctamente:
- Cuantos alumnos no estudiaban idiomas.
- Cuantos alumnos tenian frances como unico idioma.

Resultados esperados:
- No estudiaban idiomas: **20**
- Solo frances: **30**

## Pendientes (en orden recomendado)

1. Completar el TAD de conjuntos
- Archivo: `src/conjuntos/Conjuntos.java`
- Implementar metodos faltantes:
  - `eliminar(T elemento)`
  - `interseccion(Conjuntos<T> set)`
  - `diferencia(Conjuntos<T> set)`
  - `subconjunto(Conjuntos<T> set)` (recomendado para dejarlo completo)

2. Agregar metodo de cardinalidad
- Archivo: `src/conjuntos/Conjuntos.java`
- Crear `size()` (o equivalente) para obtener el numero de elementos del conjunto.
- Esto evita depender de `toString()` para contar.

3. Armar el escenario de 100 estudiantes
- Archivo: `src/Main.java`
- Definir conjunto universo `U` con 100 alumnos (IDs 1..100).
- Construir conjuntos de idiomas:
  - `E` (Espanol) = 28
  - `A` (Aleman) = 30
  - `F` (Frances) = 42
- Modelar intersecciones segun datos:
  - `E∩A = 8`
  - `E∩F = 10`
  - `A∩F = 5`
  - `E∩A∩F = 3`

4. Calcular las respuestas solicitadas
- Formula para alumnos sin idioma:
  - `sinIdioma = U - (E ∪ A ∪ F)`
- Formula para solo frances:
  - `soloFrances = F - (E ∪ A)`
- Imprimir resultados claros por consola.

5. Verificar correctitud
- Confirmar que el programa arroje exactamente:
  - `sinIdioma = 20`
  - `soloFrances = 30`
- Hacer al menos una corrida de prueba limpia y guardar evidencia.

6. Preparar evidencia para el reporte
- Capturas:
  - Codigo del TAD completo.
  - Ejecucion en consola con resultados.
- Explicacion breve de:
  - Como se modelaron los conjuntos.
  - Que operaciones de conjuntos se usaron.
  - Por que los resultados son correctos.

## Criterio de terminado (Definition of Done)
- El codigo compila y corre sin errores.
- Los metodos clave del TAD funcionan.
- Las 2 respuestas del caso coinciden con los valores esperados (20 y 30).
- Hay evidencia lista para pegar en el reporte final.
