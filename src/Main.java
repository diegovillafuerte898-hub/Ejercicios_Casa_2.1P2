void main() {
    System.out.println("=== PRUEBAS SW-L1: SPRINT ===");
    Sprint sprint = new Sprint();
    sprint.crearTarea("TS01", "Configurar Entorno", 6.0);
    sprint.crearTarea("TS02", "Crear Modelos", 10.0);
    sprint.crearTarea("TS03", "Implementar Lógica", 15.0);
    sprint.crearTarea("TS04", "Conectar Base de Datos", 8.0);
    sprint.crearTarea("TS05", "Desplegar Beta", 5.0);

    sprint.completarTarea("TS01");
    sprint.completarTarea("TS02");

    System.out.println("Tareas completadas: " + sprint.contarCompletadas());
    System.out.println("Horas pendientes: " + sprint.calcularHorasPendientes());
    System.out.println("Listado de tareas del sprint:\n" + sprint.mostrarTareas());
}
