# GitResolucionConflictos

# Primer paso
1. Mediante el uso de cd usando Git Bash, se situa el **directorio local** donde queremos trabajar. En este caso, elegiremos un fichero previamente creado llamado **carpetaCasa**.
  * Una vez estamos aquí, procedemos a iniciar un repositorio local mediante **git init** y transferir los archivos que tenemos en **remoto** a nuestro **repositorio local**, que en este caso es carpetaCasa mediante un **git clone**.
  * Usando el comando cd .. nos situamos en otro fichero previamente creado llamado **carpetaInstituto** , y mediante un **git clone** obtendremos los archivos de nuestro repositorio remoto, en este **repositorio local**. Esto es esencialmente lo mismo que hemos hecho en carpetaCasa.
# Segundo paso
2. Nos situamos en la carpetaCasa, y realizamos un cambio de manera manual, en uno de los documentos java disponibles, en este caso **Ej01.java**. 
 * Una vez aquí, con nuestro pequeño cambio realizado, el cual añadiremos a nuestro repositorio mediante un **git add .** seguido de un **git commit -m ""** , dejaremos listo el cambio para ser subido a nuestro repositorio remoto mediante un **git push [Link a github]**
 * Acto seguido, nos dirigimos a carpetaInstituto mediante cd .. para retroceder ficheros y cd \ para avanzar ficheros, y realizaremos un cambio manual basado en la creación de una nueva clase llamada **Nueva clase**. Este cambio será introducido a nuestro repositorio local mediante un git add . seguido de un git commit -m "". 
  * Sin embargo, a la hora de intentar subir este cambio a nuestro repositorio remoto mediante git push, nos aparece un conflicto. La manera en que este conflicto fue solucionado fue mediante **merge by recursive strategy** usando el comando :qa.
 * Finalmente, usaremos un git pull en carpetaCasa y en carpetaInstituto, para así tener ambos actualizados respecto a nuestro remoto.
# Tercer paso
3. Aquí realizaremos los mismos cambios, tanto en carpetaCasa, como en carpetaInstituto. Subiremos los cambios de uno primero a nuestro remoto, y lo intentaremos con el otro siguiendo la misma dinámica mostrada anteriormente.
*  Una vez más, tendremos un conflicto basado en merge, ya que los dos repositorios presentan los mismos cambios. Esto se solucionará manualmente en nuestro editor.
*  Si abrimos el ultimo documento que hemos intentado subir al remoto, apreciamos las siguientes etiquetas: <<<<<<<<<HEAD , =======, >>>>>>>>>codigo commit. Borramos estos indicadores, y dejaremos los cambios que finalmente queremos añadir a nuestro remoto. 
*  git add . seguido de git commit y git push, nos permitirá subir los cambios deseados, y así finalizar con el conflicto. Finalmente, usaremos un git pull en carpetaCasa y en carpetaInstituto, para así tener ambos actualizados respecto a nuestro remoto 
# Cuarto paso
4. Este paso es parecido al anterior, excepto que los cambios que realicemos en ambos repositorios, serán en la misma linea del fichero, pero contendrán otro texto en cada uno, a diferencia del paso anterior, en el que contenían el mismo texto.
*  Una vez realizados los cambios en carpetaCasa y carpetaInstituto, intentaremos ambos mediante un git push, pero nos enfrentaremos a un nuevo conflicto, cuya solución pasa de nuevo por abrir nuestro documento(último que se haya intentado subir) en el IDE, y borrar manualmente estas etiquetas HEAD y nombre de rama.
*  En esta ocasión, podemos decidir entre quedarnos con los primeros cambios, con los segundos, o con ambos. Finalmente, procederemos a subir nuestros cambios mediante un git push.

# GitTrabajoEnRamas

# Primer paso
1. Primero seleccionaremos la opcion **git branch test-1** para crear una rama que reflejara el extremo de una serie de confirmaciones.
  * A continuación, seleccionamos este rama recién creada usando el comando **git checkout test-1**, que apuntará hacia ella. 
  * Realizamos unos cambios en el repositorio local, seguido de **git add. + git commit**, y estos estarían listos para ser subidos al repositorio     remoto.
  * git push origin test-1 nos enviará los cambios realizados a nuestro remoto. Sin embargo, la rama local no es enviada a nuestro remoto, ya que para enviarla necesitamos el comando **git push origin test-1**   
# Segundo paso
2. Teniendo en cuenta que el documento editado en repositorio local está siendo usado para redactar este README, los cambios son constantes, por lo tanto, rama test-1 tiende a estar siempre en la delantera. 
 * Precisamente esto se avisa cuando realizamos un cambio de rama mediante el comando **git checkout master**
 * Al intentar hacer un git push con cambios realizados en la rama master, nos encontraremos con un **error: failed to push some refs to 'https://github.com/marcusskelly/GitResolucionConflictos'** precisamente por la razón comentada previamente de tener un documento en constante edición en nuestro local. 
  * Esto se resolvió haciendo un git pull en el repositorio local en rama master, para después usar el comando **:qa** que nos permite fusionar los cambios en rama test-1 con rama master.
 * Una vez realizado esto, nuestros commit en rama master pueden ser subidos al repositorio remoto mediante git push.  
 # Tercer paso
3. LLega el turno de situarnos en carpetaInstituto situada en nuestro repositorio local, para obtener los cambios realizados desde carpetaCasa.
*  Nuestro principal problema se encuentra en que al consultar las ramas existentes en carpetaInsituto mediante un **git branch --list**, no nos aparece la rama test-1 creada en carpetaCasa.
*  Este problema lo solucionamos descargando la rama test-1 desde nuestro remoto a nuestro local usando el comando **git fetch + URL test-1:test-1**. 
*  Se nos presenta un nuevo problema, y esque al hacer git checkout, nos aparece un conflicto: **your local changes to the file would be overwritten by checkout**. Esto posiblemente se debe a los continuos cambios en este documento de texto al intentar documentar los pasos seguidos en esta práctica.
*  Para lidiar con este problema, nos iremos al propio documento de texto en carpetaInstituto, y borraremos un código alfa numérico señalado mediante una etiqueta. Después de guardar cambios, realizamos git add . + git commit y finalmente git push a remoto.
# Cuarto paso
4. Llegados a este punto, al situarnos en rama test-1, se nos avisa que rama master se encuentra unos commits por detrás.
*  Esto será solucionado mediante un **git merge master**, que nos permitirá unir ambas ramas.
*  Finalmente, realizamos un git push desde rama master para finalmente tener local y remoto completamente sincronizados.

