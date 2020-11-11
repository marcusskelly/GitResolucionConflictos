# GitResolucionConflictos

# Primer paso
1. Mediante el uso de cd usando Git Bash, se situa el **directorio local** donde queremos trabajar. En este caso, elegiremos un fichero previamente creado llamado **carpetaCasa**.
> Una vez estamos aquí, procedemos a iniciar un repositorio local mediante **git init** y transferir los archivos que tenemos en **remoto** a nuestro **repositorio local**, que en este caso es carpetaCasa mediante un **git clone**.
> Usando el comando cd .. nos situamos en otro fichero previamente creado llamado **carpetaInstituto** , y mediante un **git clone** obtendremos los archivos de nuestro repositorio remoto, en este **repositorio local**. Esto es esencialmente lo mismo que hemos hecho en carpetaCasa.
# Segundo paso
2. Nos situamos en la carpetaCasa, y realizamos un cambio de manera manual, en uno de los documentos java disponibles, en este caso **Ej01.java**. 
⋅⋅* Una vez aquí, con nuestro pequeño cambio realizado, el cual añadiremos a nuestro repositorio mediante un **git add .** seguido de un **git commit -m ""** , dejaremos listo el cambio para ser subido a nuestro repositorio remoto mediante un **git push [Link a github]**
⋅⋅* Acto seguido, nos dirigimos a carpetaInstituto mediante cd .. para retroceder ficheros y cd \ para avanzar ficheros, y realizaremos un cambio manual basado en la creación de una nueva clase llamada **Nueva clase**. Este cambio será introducido a nuestro repositorio local mediante un git add . seguido de un git commit -m "". Sin embargo, a la hora de intentar subir este cambio a nuestro repositorio remoto mediante git push, nos aparece un conflicto. La manera en que este conflicto fue solucionado fue mediante **merge by recursive strategy** usando el comando :qa.
⋅⋅* Finalmente, usaremos un git pull en carpetaCasa y en carpetaInstituto, para así tener ambos actualizados respecto a nuestro remoto.
# Tercer paso
3. Aquí realizaremos los mismos cambios, tanto en carpetaCasa, como en carpetaInstituto. Subiremos los cambios de uno primero a nuestro remoto, y lo intentaremos con el otro siguiendo la misma dinámica mostrada anteriormente.
⋅⋅* Una vez más, tendremos un conflicto basado en merge, ya que los dos repositorios presentan los mismos cambios. Esto se solucionará manualmente en nuestro editor.
⋅⋅* Si abrimos el ultimo documento que hemos intentado subir al remoto, apreciamos las siguientes etiquetas: <<<<<<<<<HEAD , =======, >>>>>>>>>nombre de rama. Borramos estos indicadores, y dejaremos los cambios que finalmente queremos añadir a nuestro remoto. 
⋅⋅* git add . seguido de git commit y git push, nos permitirá subir los cambios deseados, y así finalizar con el conflicto. Finalmente, usaremos un git pull en carpetaCasa y en carpetaInstituto, para así tener ambos actualizados respecto a nuestro remoto 
# Cuarto paso
4. Este paso es parecido al anterior, excepto que los cambios que realicemos en ambos repositorios, serán en la misma linea del fichero, pero contendrán otro texto en cada uno, a diferencia del paso anterior, en el que contenían el mismo texto.
⋅⋅* Una vez realizados los cambios en carpetaCasa y carpetaInstituto, intentaremos ambos mediante un git push, pero nos enfrentaremos a un nuevo conflicto, cuya solución pasa de nuevo por abrir nuestro documento(último que se haya intentado subir) en el IDE, y borrar manualmente estas etiquetas HEAD y nombre de rama.
⋅⋅* En esta ocasión, podemos decidir entre quedarnos con los primeros cambios, con los segundos, o con ambos. Finalmente, procederemos a subir nuestros cambios mediante un git push.

[Link a mi github](https://github.com/marcusskelly/GitResolucionConflictos)
