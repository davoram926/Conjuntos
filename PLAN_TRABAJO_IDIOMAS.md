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

1. Completar el TAD de conjuntos.     🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢REALIZADO🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢
- Archivo: `src/conjuntos/Conjuntos.java`
- Implementar metodos faltantes:
  - `eliminar(T elemento)`
  - `interseccion(Conjuntos<T> set)`
  - `diferencia(Conjuntos<T> set)`
  - `subconjunto(Conjuntos<T> set)` (recomendado para dejarlo completo)

2. Agregar metodo de cardinalidad     🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢REALIZADO🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢
- Archivo: `src/conjuntos/Conjuntos.java`
- Se agrego `size()` que retorna `nElem` directamente.
- Ya no depende de `toString()` para contar elementos.

3. Armar el escenario de 100 estudiantes     🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢REALIZADO🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢
- Archivo: `src/Main.java`
- Se definio conjunto universo `U` con 100 alumnos (IDs 1..100).
- Se construyeron conjuntos de idiomas usando rangos de IDs:
  - `E` (Espanol) = 28  →  IDs: 1-3, 4-8, 9-15, 18-30
  - `A` (Aleman)  = 30  →  IDs: 1-3, 4-8, 16-17, 31-50
  - `F` (Frances) = 42  →  IDs: 1-3, 9-15, 16-17, 51-80
- Intersecciones modeladas correctamente:
  - `E∩A = 8`   →  IDs 1-8
  - `E∩F = 10`  →  IDs 1-3 y 9-15
  - `A∩F = 5`   →  IDs 1-3 y 16-17
  - `E∩A∩F = 3` →  IDs 1-3

4. Calcular las respuestas solicitadas     🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢REALIZADO🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢
- Formula para alumnos sin idioma:
  - `sinIdioma = U - (E ∪ A ∪ F)` → resultado: **20** ✓
- Formula para solo frances:
  - `soloFrances = F - (E ∪ A)` → resultado: **30** ✓
- Resultados impresos claramente por consola.

5. Verificar correctitud     🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢REALIZADO🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢🟢
-  y se confirmo que:
  - `sinIdioma = 20` ✓
  - `soloFrances = 30` ✓
- Todas las cardinalidades intermedias tambien coinciden (E=28, A=30, F=42, intersecciones).

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
