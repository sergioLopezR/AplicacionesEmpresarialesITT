
//Validar el formulario
function validarForma(forma){
    
    //***Validar usuario
    var usuario = forma.usuario; //Nombre del componente en HTML
    if(usuario.value == ""){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    
    
    //***Validar las password
    var password = forma.password; //Password del componente en HTML
    if(password.value == "" || password.value.length < 8){ 
        alert("Debe proporcionar una contraseña de al menos caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    //***Validar las tecnologias
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    //Revisamos que por lo menos un check haya sido seleccionado
    for(i=0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }//fin if
    }//fin for
        
    if (!checkSeleccionado){
        alert("Debera seleccionar al menos una tecnologia");
        return false;
    }
    
    
    
    //***Validar las genero
    var genero = forma.genero;
    var seleccionGenero = false;
    
    for(i = 0; i < genero.length; i++){
        if(genero[i].checked){
            seleccionGenero = true;
        }
    }
    
    if(!seleccionGenero){
        alert("Debera seleccionar un genero");
        return false;
    }
    
    
    
    //***Validar las ocupacion
    var ocupacion = forma.ocupacion;
    
    if(ocupacion.value == "Seleccionar"){
        alert("Debe proporcionar una ocupacion");
        return false;
    }
    
    //***Validar musica
    var musica = forma.musica;
    
    if(musica.value == ""){
        alert("Debe proporcionar una musica");
        return false;
    }
    
    //***Validar comentarios
    var comentarios = forma.comentario; //Nombre del componente en HTML
    if(comentarios.value == ""){
        alert("Debe proporcionar un comentario");
        comentarios.focus();
        comentarios.select();
        return false;
    }
    
    alert("Enviando formulario...");
    return true;
    
    
    
    

    
    
    
    
    
    
    
} //Fin funcion
