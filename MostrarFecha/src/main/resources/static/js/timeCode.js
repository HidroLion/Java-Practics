alert("Esta Pagina Muestra la Hora");
function mostrarHora() {
     const ahora = new Date();
     const hora = ahora.getHours();
     const minutos = ahora.getMinutes();
     const segundos = ahora.getSeconds();
     const horaActual = `${hora}:${minutos < 10 ? '0' : ''}${minutos}:${segundos < 10 ? '0' : ''}${segundos}`;
     document.getElementById('hora').textContent = horaActual;
}

// Actualizar la hora cada segundo
setInterval(mostrarHora, 1000);
// Mostrar la hora actual al cargar la página
mostrarHora();