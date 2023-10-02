# Probar Prolog
Así entramos de forma interactiva.

```bash
docker pull wipl
docker run -it swipl
```
Entrar con un terminal interactivo

```bash
docker run -it swipl bash
```

Actualizar repositorios

```bash
apt update
```

Instalar nano

```bash
apt install nano
```

Abrir nano para editar el código fuente de un programa

```bash
nano programa.pl
```

Abrir intérprete de Prolog

```bash
swipl
```

Cargar programa en Prolog


```prolog
consult('programa.pl').
```

Y probar el programa

```prolog
mujer(X).
```

