alert("Esta Pagina Muestra la Fecha Actual");
function mostrarFecha() {
    const ahora = new Date();
	const fechaActual = ahora.toDateString();
	document.getElementById('fecha').textContent = fechaActual;
}
// Mostrar la fecha actual al cargar la página
mostrarFecha();